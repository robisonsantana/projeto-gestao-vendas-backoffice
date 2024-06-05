package model;

public class Produto {

	public String id;
	public String nome;
	public String valor;
	public String descricao;
	public String quantidadeEmEstoque;
	public String tipo;
	
	public Produto() {
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
		return id + ";" + nome + ";" + valor + ";" + descricao + ";" + quantidadeEmEstoque + ";" + tipo;
	}
	
}
