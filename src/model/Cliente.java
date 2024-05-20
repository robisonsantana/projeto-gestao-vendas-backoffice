package model;

public class Cliente {
	
	//dados do formulario do cliente normal
	public String id;
	public String nome;
	public String cpf;
	public String telefone;
	public String cep;
	public String logradouro;
	public String numeroPorta;
	public String complemento;

	//construtor
	public Cliente() {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numeroPorta = numeroPorta;
		this.complemento = complemento;
	}
	
	
	@Override
	public String toString(){
		return "Cliente [id = " + id + ", nome = " + nome + ", cpf = " + cpf + ", telefone = " + telefone + ", cep = " + cep +", logradouro = " + logradouro + ", numero da porta = " + numeroPorta + ", complemento =" + complemento + "]";
	}

	
//	@Override
//	public String toString() {
//		return "ID: " + id 
//		   + "\nNome: " + nome;
//	}
	
}
