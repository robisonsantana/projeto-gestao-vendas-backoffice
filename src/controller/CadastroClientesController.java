package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
			cadastroCliente();
		}
	}
	

	//metodo
	private void cadastroCliente() {
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
	}
	
	
	
}
