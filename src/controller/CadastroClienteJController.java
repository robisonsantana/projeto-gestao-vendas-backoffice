package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import model.Cliente;
import model.ClienteJuridico;

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
	
	//construtor
	public CadastroClienteJController(JTextField tfClienteNomePJ, JTextField tfCnpjPJ, JTextField tfTelefonePJ,
			JTextField tfEmail, JTextField tfLogradouroPJ, JTextField tfCepPJ, JTextField tfNumeroPortaPJ,
			JTextField tfComplementoPJ) {
		super();
		this.tfClienteNomePJ = tfClienteNomePJ;
		this.tfCnpjPJ = tfCnpjPJ;
		this.tfTelefonePJ = tfTelefonePJ;
		this.tfEmail = tfEmail;
		this.tfLogradouroPJ = tfLogradouroPJ;
		this.tfCepPJ = tfCepPJ;
		this.tfNumeroPortaPJ = tfNumeroPortaPJ;
		this.tfComplementoPJ = tfComplementoPJ;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//pegando valor do terminal
		String cmd = e.getActionCommand();
		
		//clicando em cadastrar, redireciona pro metodo
		if (cmd.equals("Cadastrar")) {
			cadastroClienteJ();
		}
	}
	

	//metodo
	private void cadastroClienteJ() {
		//instancia
		ClienteJuridico cj = new ClienteJuridico();

		cj.cnpj = tfCnpjPJ.getText();
		cj.telefone = tfTelefonePJ.getText();
		cj.cep = tfCepPJ.getText();
		cj.nome = tfClienteNomePJ.getText();
		cj.logradouro = tfLogradouroPJ.getText();
		cj.numeroPorta = tfNumeroPortaPJ.getText();
		cj.complemento = tfComplementoPJ.getText();
		cj.email = tfEmail.getText();
		
		System.out.println(cj);
	}
	
}
