package model;

public class Produto {
	
<<<<<<< HEAD
	public int id;
	public String nome;
	public int valor;
	public String descricao;
	public int quantidadeEmEstoque;
	public String tipo;
	
	public Produto(int id, String nome, int valor, String descricao, int quantidadeEmEstoque, String tipo) {
=======
	public String id;
	public String nome;
	public String valor;
	public String descricao;
	public String quantidadeEmEstoque;
	public String tipo;
	
	public Produto() {
>>>>>>> bec4a6c (Brenda: Adicionado models necessários e o controller de produtos)
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "ID: " + id 
		   + "\nNome: " + nome 
		   + "\nValor: " + valor
		   + "\nDescrição: " + descricao
		   + "\nQuantidade em estoque: " + quantidadeEmEstoque
		   + "\nTipo: " + tipo;
	}
	
}
