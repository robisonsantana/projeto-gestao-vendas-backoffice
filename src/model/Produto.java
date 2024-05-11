package model;

public class Produto {
	
	public int id;
	public String nome;
	public int valor;
	public String descricao;
	public int quantidadeEmEstoque;
	public String tipo;
	
	public Produto(int id, String nome, int valor, String descricao, int quantidadeEmEstoque, String tipo) {
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
