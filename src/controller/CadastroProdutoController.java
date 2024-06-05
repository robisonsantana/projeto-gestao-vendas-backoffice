package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import model.Cliente;
import model.Produto;
public class CadastroProdutoController implements ActionListener {

	//variaveis
	private JTextField tfNomeProduto;
	private JTextField tfProdutoID;
	private JTextField tfValorProduto;
	private JTextField tfQuantidadeProduto;
	private JTextField tfNomeTipoProduto;
	
	
	//construtor
	public CadastroProdutoController(JTextField tfNomeProduto, JTextField tfProdutoID, JTextField tfValorProduto,
			JTextField tfQuantidadeProduto, JTextField tfNomeTipoProduto) {
		super();
		this.tfNomeProduto = tfNomeProduto;
		this.tfProdutoID = tfProdutoID;
		this.tfValorProduto = tfValorProduto;
		this.tfQuantidadeProduto = tfQuantidadeProduto;
		this.tfNomeTipoProduto = tfNomeTipoProduto;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		//ao clicar no botao Cadastrar produto, redirecionar ao botao "cadastrar produto"
		if (cmd.equals("Cadastrar")) {
		    try {
				cadastroProduto();
			} catch (IOException e1) {
				System.err.println(e1.getMessage());
			}
		}
	}

	//metodo 
	private void cadastroProduto() throws IOException {
		Produto p = new Produto();
		p.id = tfProdutoID.getText();
		p.nome = tfNomeProduto.getText();
		p.valor = tfValorProduto.getText();
		p.quantidadeEmEstoque = tfQuantidadeProduto.getText();		
		p.tipo = tfNomeTipoProduto.getText();
		System.out.println(p);
		gravarDados(p.toString());
		tfProdutoID.setText("");
		tfNomeProduto.setText("");
		tfValorProduto.setText("");
		tfQuantidadeProduto.setText("");		
		tfNomeTipoProduto.setText("");
	}
	
	private void gravarDados(String csvProdutos) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaCadastro";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "produtos.csv");
		boolean existe = false;
		if(arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(csvProdutos + "\r\n");
		pw.flush();
		pw.close();
		fw.close();
	}
	
	private void buscar() throws IOException {
		Produto produto = new Produto();
		produto.id = tfProdutoID.getText();
		produto = buscarProduto(produto);
		//implementar
		if(produto.nome != null) {
			//aqui
		}
	}

	private Produto buscarProduto(Produto produto) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaCadastro";
		File arq = new File(path, "produtos.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String linha = buffer.readLine();
			while(linha != null) {
				String[] vetLinha = linha.split(";");
				if(vetLinha[0].equals(produto.id)) {
					produto.nome = vetLinha[1];
					produto.valor = vetLinha[2];
					produto.descricao = vetLinha[3];
					produto.quantidadeEmEstoque = vetLinha[4];
					produto.tipo = vetLinha[5];
					break;
				}
				linha = buffer.readLine();
			}
			buffer.close();
			isr.close();
			fis.close();
		}
		return produto;
	}
}
