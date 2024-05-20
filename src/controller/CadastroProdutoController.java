package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

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
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		//ao clicar no botao Cadastrar produto, redirecionar ao botao "cadastrar produto"
		if (cmd.equals("Cadastrar")) {
		    cadastroProduto();
		}
	}

	//metodo 
	private void cadastroProduto() {
		Produto p = new Produto();
		p.id = tfProdutoID.getText();
		p.nome = tfNomeProduto.getText();
		p.valor = tfValorProduto.getText();
		p.quantidadeEmEstoque = tfQuantidadeProduto.getText();		
		p.tipo = tfNomeTipoProduto.getText();
		System.out.println(p);
	}
}
