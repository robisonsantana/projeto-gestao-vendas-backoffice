package model;

public class ClienteJuridico {
	
	//dados do formulario do cliente pessoa juridica
	public String id;
	public String nome;
	public String cnpj;
	public String telefone;
	public String email;
	public String logradouro;
	public String cep;
	public String numeroPorta;
	public String complemento;
	
	//construtor
	public ClienteJuridico() {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
		this.logradouro = logradouro;
		this.cep = cep;
		this.numeroPorta = numeroPorta;
		this.complemento = complemento;
	}

	
	@Override
	public String toString(){
		return "Cliente [id = " + id + ", nome = " + nome + ", cnpj = " + cnpj + ", telefone = " + telefone + " logradouro = " + logradouro + ", cep = " + cep + ", numeroPorta = " + numeroPorta + ", complemento = " + complemento +"]";
	}

		
//	@Override
//	public String toString() {
//		return "ID: " + id 
//		   + "\nNome: " + nome;
//	}
	
}

