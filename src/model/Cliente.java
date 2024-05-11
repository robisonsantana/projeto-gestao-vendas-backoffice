package model;

public class Cliente {
	
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
	
}
