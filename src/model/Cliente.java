package model;

public class Cliente {
	
<<<<<<< HEAD
	public int id;
	public String nome;
	public Cliente(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "ID: " + id 
		   + "\nNome: " + nome;
	}
	
=======
	//dados do formulario do cliente normal
	public int id;
	public String nome;
	public int cpf;
	public int telefone;
	
	//construtor
	public Cliente(int id, String nome, int cpf, int telefone) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	@Override
	public String toString(){
		return "Cliente [id = " + id + ", nome = " + nome + ", cpf = " + cpf + ", telefone = " + telefone + "]";
	}
	
//	@Override
//	public String toString() {
//		return "ID: " + id 
//		   + "\nNome: " + nome;
//	}
	
>>>>>>> bec4a6c (Brenda: Adicionado models necessários e o controller de produtos)
}
