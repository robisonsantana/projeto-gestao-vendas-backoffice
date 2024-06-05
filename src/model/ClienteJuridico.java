package model;

public class ClienteJuridico {
	
	//dados do formulario do cliente pessoa juridica
	public String cnpj;
	public String nome;
	public String telefone;
	public String email;
	public String logradouro;
	public String cep;
	public String numeroPorta;
	public String complemento;
	
	//construtor
	public ClienteJuridico() {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numeroPorta = numeroPorta;
		this.complemento = complemento;
	}

	
	@Override
	public String toString(){
		return cnpj + ";" + nome + ";" + telefone + ";" + logradouro + ";" + cep + ";" + numeroPorta + ";" + complemento;
	}

		
//	@Override
//	public String toString() {
//		return "ID: " + id 
//		   + "\nNome: " + nome;
//	}
	
}

