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

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.Cliente;
import model.ClienteJuridico;
import model.Produto;

public class CadastroClienteJController implements ActionListener{

	//cliente juridico
	private JTextField tfClienteNomePJ;
	private JTextField tfCnpjPJ;
	private JTextField tfTelefonePJ;
	private JTextField tfEmail;
	private JTextField tfLogradouroPJ;
	private JTextField tfCepPJ;
	private JTextField tfNumeroPortaPJ;
	private JTextField tfComplementoPJ;
	private JTextField tfConsultaClientePJ;
	private JLabel lblExibeConsulta;
	private JLabel lblExibeErroCadastro_1;
	
	//construtor
	public CadastroClienteJController(JTextField tfClienteNomePJ, JTextField tfCnpjPJ, JTextField tfTelefonePJ,
			JTextField tfEmail, JTextField tfLogradouroPJ, JTextField tfCepPJ, JTextField tfNumeroPortaPJ,
			JTextField tfComplementoPJ, JTextField tfConsultaClientePJ, JLabel lblExibeConsulta, JLabel lblExibeErroCadastro_1) {
		super();
		this.tfClienteNomePJ = tfClienteNomePJ;
		this.tfCnpjPJ = tfCnpjPJ;
		this.tfTelefonePJ = tfTelefonePJ;
		this.tfEmail = tfEmail;
		this.tfLogradouroPJ = tfLogradouroPJ;
		this.tfCepPJ = tfCepPJ;
		this.tfNumeroPortaPJ = tfNumeroPortaPJ;
		this.tfComplementoPJ = tfComplementoPJ;
		this.tfConsultaClientePJ =  tfConsultaClientePJ;
		this.lblExibeConsulta = lblExibeConsulta;
		this.lblExibeErroCadastro_1 = lblExibeErroCadastro_1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//pegando valor do terminal
		String cmd = e.getActionCommand();
		
		//clicando em cadastrar, redireciona pro metodo
		if (cmd.equals("Cadastrar")) {
			try {
				cadastroClienteJ();
			} catch (IOException e1) {
				System.err.println(e1.getMessage());
			}
		} else if(cmd.equals("Consultar")) {
			try {
				buscar();
			} catch (IOException e1) {
				System.err.println(e1.getMessage());
			}
		}
	}
	

	//metodo
	private void cadastroClienteJ() throws IOException {
		//instancia
		ClienteJuridico cj = new ClienteJuridico();

		int controller = 0;
		while(controller != 9) {
			cj.cnpj = tfCnpjPJ.getText();
			cj.telefone = tfTelefonePJ.getText();
			cj.cep = tfCepPJ.getText();
			cj.nome = tfClienteNomePJ.getText();
			cj.logradouro = tfLogradouroPJ.getText();
			cj.numeroPorta = tfNumeroPortaPJ.getText();
			cj.complemento = tfComplementoPJ.getText();
			cj.email = tfEmail.getText();
//			if(cj.cnpj.equals(null) || cj.cep.equals(null) || cj.email.equals(null) || cj.logradouro.equals(null) || cj.nome.equals(null) || cj.numeroPorta.equals(null)) {
//				lblExibeErroCadastro_1.setText("*Preencher todos os campos obrigatórios");;
//			} else if(cj.complemento.equals(null)) {
//				cj.complemento = " ";
//			} else {
//				controller = 9;
//			}
			
		}
		
		System.out.println(cj);
		gravarDados(cj.toString());
		tfCnpjPJ.setText("");
		tfTelefonePJ.setText("");
		tfCepPJ.setText("");
		tfClienteNomePJ.setText("");
		tfLogradouroPJ.setText("");
		tfNumeroPortaPJ.setText("");
		tfComplementoPJ.setText("");
		tfEmail.setText("");
	}
	
	private void gravarDados(String csvClientePJ) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaCadastro";
		File dir = new File(path);
		if(!dir.exists()) {
			dir.mkdir();
		}
		File arq = new File(path, "clientePJ.csv");
		boolean existe = false;
		if(arq.exists()) {
			existe = true;
		}
		FileWriter fw = new FileWriter(arq, existe);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(csvClientePJ + "\r\n");
		pw.flush();
		pw.close();
		fw.close();	
	}
	
	private void buscar() throws IOException {
		ClienteJuridico cj = new ClienteJuridico();
		cj.cnpj = tfConsultaClientePJ.getText();
		cj = buscarCliente(cj);
		//implementar
		if(cj.nome != null) {
			lblExibeConsulta.setText("CNPJ: " + cj.cnpj + "; Nome: " + cj.nome + "; Telefone: " + cj.telefone + "; Email: " + cj.email + "; Logradouro: " + cj.logradouro + "; CEP: " + cj.cep + "; Nº: " + cj.numeroPorta + "; Complemento: " + cj.complemento);
		} else {
			lblExibeConsulta.setText("Cliente não encontrado!");
		}
	}

	private ClienteJuridico buscarCliente(ClienteJuridico cj) throws IOException {
		String path = System.getProperty("user.home") + File.separator + "SistemaCadastro";
		File arq = new File(path, "clientePJ.csv");
		if(arq.exists() && arq.isFile()) {
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String linha = buffer.readLine();
			while(linha != null) {
				String[] vetLinha = linha.split(";");
				if(vetLinha[0].equals(cj.cnpj)) {
					cj.nome = vetLinha[1];
					cj.telefone = vetLinha[2];
					cj.email = vetLinha[3];
					cj.logradouro = vetLinha[4];
					cj.cep = vetLinha[5];
					cj.numeroPorta = vetLinha[6];
					//cj.complemento = vetLinha[7];
					break;
				}
				linha = buffer.readLine();
			}
			buffer.close();
			isr.close();
			fis.close();
		}
		return cj;
	}
	
}
