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
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

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
	private JTextField tfClienteNomePJ;
	private JTextField tfCnpjPJ;
	private JTextField tfTelefonePJ;
	private JTextField tfEmail;
	private JTextField tfLogradouroPJ;
	private JTextField tfCepPJ;
	private JTextField tfNumeroPortaPJ;
	private JTextField tfComplementoPJ;
	private JTextField tfNomeProduto;
	private JTextField tfProdutoID;
	private JTextField tfValorProduto;
	private JTextField tfQuantidadeProduto;
	private JTextField tfNomeTipoProduto;

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
		tabbedPane.addTab("Cliente Pessoa Física", null, tabClientesPF, "Cadastro de clientes PF (Pessoa Física)");
		tabClientesPF.setLayout(null);
		
		JLabel lblClienteNomePF = new JLabel("Nome");
		lblClienteNomePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClienteNomePF.setBounds(69, 86, 54, 25);
		tabClientesPF.add(lblClienteNomePF);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(79, 130, 35, 25);
		tabClientesPF.add(lblCpf);
		
		JLabel lblTelefonePF = new JLabel("Telefone");
		lblTelefonePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefonePF.setBounds(54, 176, 60, 25);
		tabClientesPF.add(lblTelefonePF);
		
		JLabel lblCepPF = new JLabel("CEP");
		lblCepPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCepPF.setBounds(380, 86, 42, 25);
		tabClientesPF.add(lblCepPF);
		
		tfClienteNomePF = new JTextField();
		tfClienteNomePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfClienteNomePF.setBounds(123, 81, 149, 36);
		tabClientesPF.add(tfClienteNomePF);
		tfClienteNomePF.setColumns(10);
		
		tfCpfPF = new JTextField();
		tfCpfPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCpfPF.setBounds(123, 125, 149, 36);
		tabClientesPF.add(tfCpfPF);
		tfCpfPF.setColumns(10);
		
		tfTelefonePF = new JTextField();
		tfTelefonePF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTelefonePF.setBounds(123, 171, 149, 36);
		tabClientesPF.add(tfTelefonePF);
		tfTelefonePF.setColumns(10);
		
		tfCepPF = new JTextField();
		tfCepPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCepPF.setBounds(419, 81, 149, 36);
		tabClientesPF.add(tfCepPF);
		tfCepPF.setColumns(10);
		
		JLabel lblLogradouroPF = new JLabel("Logradouro");
		lblLogradouroPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogradouroPF.setBounds(335, 130, 120, 24);
		tabClientesPF.add(lblLogradouroPF);
		
		tfLogradouroPF = new JTextField();
		tfLogradouroPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfLogradouroPF.setBounds(419, 125, 149, 36);
		tabClientesPF.add(tfLogradouroPF);
		tfLogradouroPF.setColumns(10);
		
		JLabel lblNumeroPortaPF = new JLabel("Número da Porta");
		lblNumeroPortaPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroPortaPF.setBounds(302, 176, 120, 25);
		tabClientesPF.add(lblNumeroPortaPF);
		
		tfNumeroPortaPF = new JTextField();
		tfNumeroPortaPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNumeroPortaPF.setBounds(419, 171, 149, 36);
		tabClientesPF.add(tfNumeroPortaPF);
		tfNumeroPortaPF.setColumns(10);
		
		JLabel lblComplementoPF = new JLabel("Complemento");
		lblComplementoPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComplementoPF.setBounds(321, 222, 106, 25);
		tabClientesPF.add(lblComplementoPF);
		
		tfComplementoPF = new JTextField();
		tfComplementoPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfComplementoPF.setBounds(419, 217, 149, 36);
		tabClientesPF.add(tfComplementoPF);
		tfComplementoPF.setColumns(10);
		
		JButton btnCadastrarClientePF = new JButton("Cadastrar");
		btnCadastrarClientePF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarClientePF.setBounds(139, 317, 160, 36);
		tabClientesPF.add(btnCadastrarClientePF);
		
		JButton btnConsultarClientePF = new JButton("Consultar");
		btnConsultarClientePF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultarClientePF.setBounds(348, 317, 160, 36);
		tabClientesPF.add(btnConsultarClientePF);
		
		JLabel lblDadosClientePF = new JLabel("Dados Pessoais");
		lblDadosClientePF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDadosClientePF.setBounds(123, 36, 149, 25);
		tabClientesPF.add(lblDadosClientePF);
		
		JLabel lblEnderecoPF = new JLabel("Endereço");
		lblEnderecoPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnderecoPF.setBounds(419, 31, 101, 34);
		tabClientesPF.add(lblEnderecoPF);
		
		JPanel tabClientesPJ = new JPanel();
		tabbedPane.addTab("Cliente Pessoa Jurídica", null, tabClientesPJ, "Cadastro de clientes PJ (Pessoa Jurídica)");
		tabClientesPJ.setLayout(null);
		
		JLabel lblDadosClientePJ = new JLabel("Dados Pessoais");
		lblDadosClientePJ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDadosClientePJ.setBounds(123, 31, 136, 34);
		tabClientesPJ.add(lblDadosClientePJ);
		
		JLabel lblClienteNomePJ = new JLabel("Nome fantasia");
		lblClienteNomePJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblClienteNomePJ.setBounds(21, 87, 101, 23);
		tabClientesPJ.add(lblClienteNomePJ);
		
		tfClienteNomePJ = new JTextField();
		tfClienteNomePJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfClienteNomePJ.setBounds(123, 81, 149, 36);
		tabClientesPJ.add(tfClienteNomePJ);
		tfClienteNomePJ.setColumns(10);
		
		JLabel lblCnpjPJ = new JLabel("CNPJ");
		lblCnpjPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCnpjPJ.setBounds(74, 131, 45, 23);
		tabClientesPJ.add(lblCnpjPJ);
		
		tfCnpjPJ = new JTextField();
		tfCnpjPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCnpjPJ.setBounds(123, 125, 149, 36);
		tabClientesPJ.add(tfCnpjPJ);
		tfCnpjPJ.setColumns(10);
		
		JLabel lblTelefonePJ = new JLabel("Telefone");
		lblTelefonePJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelefonePJ.setBounds(56, 177, 66, 23);
		tabClientesPJ.add(lblTelefonePJ);
		
		tfTelefonePJ = new JTextField();
		tfTelefonePJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfTelefonePJ.setBounds(123, 171, 149, 36);
		tabClientesPJ.add(tfTelefonePJ);
		tfTelefonePJ.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(68, 223, 54, 23);
		tabClientesPJ.add(lblEmail);
		
		tfEmail = new JTextField();
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfEmail.setBounds(123, 217, 149, 36);
		tabClientesPJ.add(tfEmail);
		tfEmail.setColumns(10);
		
		JLabel lblEnderecoPJ = new JLabel("Endereço");
		lblEnderecoPJ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEnderecoPJ.setBounds(419, 31, 136, 34);
		tabClientesPJ.add(lblEnderecoPJ);
		
		JLabel lblLogradouroPJ = new JLabel("Logradouro");
		lblLogradouroPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogradouroPJ.setBounds(336, 131, 101, 23);
		tabClientesPJ.add(lblLogradouroPJ);
		
		tfLogradouroPJ = new JTextField();
		tfLogradouroPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfLogradouroPJ.setBounds(419, 125, 149, 36);
		tabClientesPJ.add(tfLogradouroPJ);
		tfLogradouroPJ.setColumns(10);
		
		JLabel lblCepPJ = new JLabel("CEP");
		lblCepPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCepPJ.setBounds(381, 89, 37, 18);
		tabClientesPJ.add(lblCepPJ);
		
		tfCepPJ = new JTextField();
		tfCepPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfCepPJ.setBounds(419, 81, 149, 36);
		tabClientesPJ.add(tfCepPJ);
		tfCepPJ.setColumns(10);
		
		JLabel lblNumeroPortaPJ = new JLabel("Número da Porta");
		lblNumeroPortaPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumeroPortaPJ.setBounds(302, 177, 149, 23);
		tabClientesPJ.add(lblNumeroPortaPJ);
		
		tfNumeroPortaPJ = new JTextField();
		tfNumeroPortaPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNumeroPortaPJ.setBounds(419, 171, 149, 36);
		tabClientesPJ.add(tfNumeroPortaPJ);
		tfNumeroPortaPJ.setColumns(10);
		
		JLabel lblComplementoPJ = new JLabel("Complemento");
		lblComplementoPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblComplementoPJ.setBounds(322, 226, 117, 16);
		tabClientesPJ.add(lblComplementoPJ);
		
		tfComplementoPJ = new JTextField();
		tfComplementoPJ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfComplementoPJ.setBounds(419, 218, 149, 36);
		tabClientesPJ.add(tfComplementoPJ);
		tfComplementoPJ.setColumns(10);
		
		JButton btnCadastrarClientePJ = new JButton("Cadastrar");
		btnCadastrarClientePJ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarClientePJ.setBounds(139, 317, 160, 36);
		tabClientesPJ.add(btnCadastrarClientePJ);
		
		JButton btnConsultarClientePJ = new JButton("Consultar");
		btnConsultarClientePJ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultarClientePJ.setBounds(348, 317, 160, 36);
		tabClientesPJ.add(btnConsultarClientePJ);
		
		JPanel tabProdutos = new JPanel();
		tabbedPane.addTab("Produtos", null, tabProdutos, "Cadastro de Produtos");
		tabProdutos.setLayout(null);
		
		JLabel lblNomeProduto = new JLabel("Nome");
		lblNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeProduto.setBounds(147, 79, 77, 30);
		tabProdutos.add(lblNomeProduto);
		
		tfNomeProduto = new JTextField();
		tfNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNomeProduto.setBounds(203, 77, 149, 36);
		tabProdutos.add(tfNomeProduto);
		tfNomeProduto.setColumns(10);
		
		JLabel lblProdutoID = new JLabel("Código ID");
		lblProdutoID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProdutoID.setBounds(128, 123, 77, 30);
		tabProdutos.add(lblProdutoID);
		
		tfProdutoID = new JTextField();
		tfProdutoID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfProdutoID.setBounds(203, 121, 149, 36);
		tabProdutos.add(tfProdutoID);
		tfProdutoID.setColumns(10);
		
		JLabel lblValorProduto = new JLabel("Valor");
		lblValorProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblValorProduto.setBounds(158, 167, 77, 30);
		tabProdutos.add(lblValorProduto);
		
		tfValorProduto = new JTextField();
		tfValorProduto.setBounds(203, 167, 149, 36);
		tabProdutos.add(tfValorProduto);
		tfValorProduto.setColumns(10);
		
		JLabel lblQuantidadeProduto = new JLabel("Quantidade em estoque");
		lblQuantidadeProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidadeProduto.setBounds(41, 213, 164, 36);
		tabProdutos.add(lblQuantidadeProduto);
		
		tfQuantidadeProduto = new JTextField();
		tfQuantidadeProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfQuantidadeProduto.setBounds(203, 214, 149, 36);
		tabProdutos.add(tfQuantidadeProduto);
		tfQuantidadeProduto.setColumns(10);
		
		JLabel lblDescricaoProduto = new JLabel("Descrição do produto");
		lblDescricaoProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDescricaoProduto.setBounds(52, 260, 183, 30);
		tabProdutos.add(lblDescricaoProduto);
		
		JTextArea taDescricaoProduto = new JTextArea();
		taDescricaoProduto.setFont(new Font("Monospaced", Font.PLAIN, 14));
		taDescricaoProduto.setBounds(203, 265, 342, 98);
		tabProdutos.add(taDescricaoProduto);
		
		JButton btnCadastrarProduto = new JButton("Cadastrar");
		btnCadastrarProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarProduto.setBounds(381, 79, 164, 74);
		tabProdutos.add(btnCadastrarProduto);
		
		JButton btnConsultarProduto = new JButton("Consultar");
		btnConsultarProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultarProduto.setBounds(381, 167, 164, 74);
		tabProdutos.add(btnConsultarProduto);
		
		JLabel lblTipoProduto = new JLabel("Tipo");
		lblTipoProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTipoProduto.setBounds(158, 36, 77, 30);
		tabProdutos.add(lblTipoProduto);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selecionar", "Produtos ao consumidor", "Produtos industriais", "Bens de conveniência", "Bens de impulso", "Bens de emergência", "Bens de compra comparada", "Bens de especialidade", "Bens perecíveis", "Bens duráveis ", "Bens não-duráveis", "Bens de capital", "Partes e materiais", "Abastecimento e serviços ", "Commodities", "Produtos intermediários"}));
		comboBox.setBounds(203, 33, 342, 36);
		tabProdutos.add(comboBox);
		
		JPanel tabTiposProdutos = new JPanel();
		tabbedPane.addTab("Tipos de Produtos", null, tabTiposProdutos, "Cadastrar Tipo de Produto");
		tabTiposProdutos.setLayout(null);
		
		JLabel lblNomeTipoProduto = new JLabel("Nome");
		lblNomeTipoProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNomeTipoProduto.setBounds(71, 34, 89, 34);
		tabTiposProdutos.add(lblNomeTipoProduto);
		
		tfNomeTipoProduto = new JTextField();
		tfNomeTipoProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfNomeTipoProduto.setBounds(139, 34, 420, 36);
		tabTiposProdutos.add(tfNomeTipoProduto);
		tfNomeTipoProduto.setColumns(10);
		
		JLabel lblDescricaoTipo = new JLabel("Descrição");
		lblDescricaoTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDescricaoTipo.setBounds(45, 99, 101, 34);
		tabTiposProdutos.add(lblDescricaoTipo);
		
		JTextArea taDescricaoTipo = new JTextArea();
		taDescricaoTipo.setFont(new Font("Monospaced", Font.PLAIN, 14));
		taDescricaoTipo.setBounds(139, 105, 420, 196);
		tabTiposProdutos.add(taDescricaoTipo);
		
		JButton btnCadastrarTipo = new JButton("Cadastrar");
		btnCadastrarTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrarTipo.setBounds(139, 327, 198, 36);
		tabTiposProdutos.add(btnCadastrarTipo);
		
		JButton btnConsultarTipo = new JButton("Consultar");
		btnConsultarTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultarTipo.setBounds(361, 327, 198, 36);
		tabTiposProdutos.add(btnConsultarTipo);
	}
}
