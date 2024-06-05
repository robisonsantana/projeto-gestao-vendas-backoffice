package model;

public class Cliente {
	
	//dados do formulario do cliente normal
	public String cpf;
	public String nome;
	public String telefone;
	public String cep;
	public String logradouro;
	public String numeroPorta;
	public String complemento;

	//construtor
	public Cliente() {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numeroPorta = numeroPorta;
		this.complemento = complemento;
	}
	
	
	@Override
	public String toString(){
		return cpf + ";" + nome + ";" + telefone + ";" + cep + ";" + logradouro + ";" + numeroPorta + ";" + complemento;
	}

	
//	@Override
//	public String toString() {
//		return "ID: " + id 
//		   + "\nNome: " + nome;
//	}
	
}
