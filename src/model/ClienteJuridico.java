package model;

public class ClienteJuridico {
	
	//dados do formulario do cliente pessoa juridica
	public int id;
	public String nome;
	public int cnpj;
	public int telefone;
	public String email;
	
	//construtor
	public ClienteJuridico(int id, String nome, int cnpj, int telefone) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
	}
	
	@Override
	public String toString(){
		return "Cliente [id = " + id + ", nome = " + nome + ", cnpj = " + cnpj + ", telefone = " + telefone + "]";
	}
	
//	@Override
//	public String toString() {
//		return "ID: " + id 
//		   + "\nNome: " + nome;
//	}
	
}

