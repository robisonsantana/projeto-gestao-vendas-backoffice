package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JLabel;
import javax.swing.JTextField;

import model.ClienteJuridico;

public class ConsultaClienteJController implements ActionListener{
	
	private JTextField tfConsultaClientePJ;
	private JLabel lblExibeConsulta;

	public ConsultaClienteJController(JTextField tfConsultaClientePJ, JLabel lblExibeConsulta) {
		this.lblExibeConsulta = lblExibeConsulta;
		this.tfConsultaClientePJ = tfConsultaClientePJ;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//pegando valor do terminal
		String cmd = e.getActionCommand();
				
		//clicando em cadastrar, redireciona pro metodo
		if (cmd.equals("Cadastrar")) {
			try {
				buscar();
			} catch (IOException e1) {
				System.err.println(e1.getMessage());
			}
		}
	}
	
	private void buscar() throws IOException {
		ClienteJuridico cj = new ClienteJuridico();
		cj.cnpj = tfConsultaClientePJ.getText();
		cj = buscarCliente(cj);
		System.out.println(cj.cnpj);
		//implementar
		if(cj.nome != null) {
			lblExibeConsulta.setText("CNPJ: " + cj.cnpj + "; Nome: " + cj.nome);
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
					cj.complemento = vetLinha[7];
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
