package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfClienteNomePF;
	private JTextField tfCpfPF;
	private JTextField tfTelefonePF;
	private JTextField tfCepPF;
	private JTextField tfLogradouroPF;
	private JTextField tfNumeroPortaPF;
	private JTextField tfComplementoPF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela frame = new tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public tela() {
		setTitle("Sistema Backoffice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 606, 423);
		contentPane.add(tabbedPane);
		
		JPanel tabClientesPF = new JPanel();
		tabbedPane.addTab("Cliente Pessoa Física", null, tabClientesPF, "Cadastro de clientes");
		tabClientesPF.setLayout(null);
		
		JLabel lblClienteNomePF = new JLabel("Nome");
		lblClienteNomePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClienteNomePF.setBounds(27, 75, 96, 25);
		tabClientesPF.add(lblClienteNomePF);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(27, 115, 96, 25);
		tabClientesPF.add(lblCpf);
		
		JLabel lblTelefonePF = new JLabel("Telefone");
		lblTelefonePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefonePF.setBounds(27, 155, 96, 25);
		tabClientesPF.add(lblTelefonePF);
		
		JLabel lblCepPF = new JLabel("CEP");
		lblCepPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCepPF.setBounds(392, 75, 42, 25);
		tabClientesPF.add(lblCepPF);
		
		tfClienteNomePF = new JTextField();
		tfClienteNomePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfClienteNomePF.setBounds(118, 70, 149, 36);
		tabClientesPF.add(tfClienteNomePF);
		tfClienteNomePF.setColumns(10);
		
		tfCpfPF = new JTextField();
		tfCpfPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCpfPF.setBounds(118, 110, 149, 36);
		tabClientesPF.add(tfCpfPF);
		tfCpfPF.setColumns(10);
		
		tfTelefonePF = new JTextField();
		tfTelefonePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTelefonePF.setBounds(118, 150, 149, 36);
		tabClientesPF.add(tfTelefonePF);
		tfTelefonePF.setColumns(10);
		
		tfCepPF = new JTextField();
		tfCepPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCepPF.setBounds(431, 70, 149, 36);
		tabClientesPF.add(tfCepPF);
		tfCepPF.setColumns(10);
		
		JLabel lblLogradouroPF = new JLabel("Logradouro");
		lblLogradouroPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogradouroPF.setBounds(348, 120, 96, 24);
		tabClientesPF.add(lblLogradouroPF);
		
		tfLogradouroPF = new JTextField();
		tfLogradouroPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfLogradouroPF.setBounds(431, 115, 149, 36);
		tabClientesPF.add(tfLogradouroPF);
		tfLogradouroPF.setColumns(10);
		
		JLabel lblNumeroPortaPF = new JLabel("Número da Porta");
		lblNumeroPortaPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroPortaPF.setBounds(317, 166, 120, 25);
		tabClientesPF.add(lblNumeroPortaPF);
		
		tfNumeroPortaPF = new JTextField();
		tfNumeroPortaPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNumeroPortaPF.setBounds(431, 161, 149, 36);
		tabClientesPF.add(tfNumeroPortaPF);
		tfNumeroPortaPF.setColumns(10);
		
		JLabel lblComplementoPF = new JLabel("Complemento");
		lblComplementoPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComplementoPF.setBounds(330, 212, 96, 25);
		tabClientesPF.add(lblComplementoPF);
		
		tfComplementoPF = new JTextField();
		tfComplementoPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfComplementoPF.setBounds(431, 207, 149, 36);
		tabClientesPF.add(tfComplementoPF);
		tfComplementoPF.setColumns(10);
		
		JButton btnCadastrarClientePF = new JButton("Cadastrar");
		btnCadastrarClientePF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarClientePF.setBounds(212, 286, 139, 66);
		tabClientesPF.add(btnCadastrarClientePF);
		
		JButton btnConsultarClientePF = new JButton("Consultar");
		btnConsultarClientePF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultarClientePF.setBounds(63, 286, 139, 66);
		tabClientesPF.add(btnConsultarClientePF);
		
		JLabel lblDadosClientePF = new JLabel("Dados Pessoais");
		lblDadosClientePF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDadosClientePF.setBounds(118, 31, 149, 25);
		tabClientesPF.add(lblDadosClientePF);
		
		JLabel lblEnderecoPF = new JLabel("Endereço");
		lblEnderecoPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnderecoPF.setBounds(433, 26, 101, 34);
		tabClientesPF.add(lblEnderecoPF);
		
		JPanel tabClientesPJ = new JPanel();
		tabbedPane.addTab("Cliente Pessoa Jurídica", null, tabClientesPJ, null);
		tabClientesPJ.setLayout(null);
		
		JLabel lblDadosClientePJ = new JLabel("Dados Pessoais");
		lblDadosClientePJ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDadosClientePJ.setBounds(36, 31, 160, 34);
		tabClientesPJ.add(lblDadosClientePJ);
	}
}
