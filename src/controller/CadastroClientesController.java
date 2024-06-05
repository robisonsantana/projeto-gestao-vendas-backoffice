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

import model.Cliente;

public class CadastroClientesController implements ActionListener{
	
	//variaveis cliente fisico
	private JTextField tfClienteNomePF;
	private JTextField tfCpfPF;
	private JTextField tfTelefonePF;
	private JTextField tfCepPF;
	private JTextField tfLogradouroPF;
	private JTextField tfNumeroPortaPF;
	private JTextField tfComplementoPF;
	
	//construtor
	public CadastroClientesController(JTextField tfClienteNomePF, JTextField tfCpfPF, JTextField tfTelefonePF,
			JTextField tfCepPF, JTextField tfLogradouroPF, JTextField tfNumeroPortaPF, JTextField tfComplementoPF) {
		super();
		this.tfClienteNomePF = tfClienteNomePF;
		this.tfCpfPF = tfCpfPF;
		this.tfTelefonePF = tfTelefonePF;
		this.tfCepPF = tfCepPF;
		this.tfLogradouroPF = tfLogradouroPF;
		this.tfNumeroPortaPF = tfNumeroPortaPF;
		this.tfComplementoPF = tfComplementoPF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//pegando valor do terminal
		String cmd = e.getActionCommand();
		
		//clicando em cadastrar, redireciona pro metodo
		if (cmd.equals("Cadastrar")) {
			try {
				cadastroCliente();
			} catch (IOException e1) {
				System.err.println(e1.getMessage());
			}
		}
	}
	

	//metodo
	private void cadastroCliente() throws IOException {
		//instancia
		Cliente c = new Cliente();

		c.cpf = tfCpfPF.getText();
		c.telefone = tfTelefonePF.getText();
		c.cep = tfCepPF.getText();
		c.nome = tfClienteNomePF.getText();
		c.logradouro = tfLogradouroPF.getText();
		c.numeroPorta = tfNumeroPortaPF.getText();
		c.complemento = tfComplementoPF.getText();
		
		System.out.println(c);
		gravarDados(c.toString());
		tfCpfPF.setText("");
		tfTelefonePF.setText("");
		tfCepPF.setText("");
		tfClienteNomePF.setText("");
		tfLogradouroPF.setText("");
		tfNumeroPortaPF.setText("");
		tfComplementoPF.setText("");
	}

	private void gravarDados(String csvClientePF) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaCadastro";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "clientePF.csv");
		boolean existe = false;
		if(arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(csvClientePF + "\r\n");
		pw.flush();
		pw.close();
		fw.close();	
	}
	
	private void buscar() throws IOException {
		Cliente cliente = new Cliente();
		cliente.cpf = tfCpfPF.getText();
		cliente = buscarCliente(cliente);
		//implementar
		if(cliente.nome != null) {
			//aqui
		}
	}

	private Cliente buscarCliente(Cliente cliente) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaCadastro";
		File arq = new File(path, "clientePF.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String linha = buffer.readLine();
			while(linha != null) {
				String[] vetLinha = linha.split(";");
				if(vetLinha[1].equals(cliente.cpf)) {
					cliente.nome = vetLinha[0];
					cliente.telefone = vetLinha[2];
					cliente.cep = vetLinha[3];
					cliente.logradouro = vetLinha[4];
					cliente.numeroPorta = vetLinha[5];
					cliente.complemento = vetLinha[6];
					break;
				}
				linha = buffer.readLine();
			}
			buffer.close();
			isr.close();
			fis.close();
		}
		return cliente;
	}
	
	
	
}
