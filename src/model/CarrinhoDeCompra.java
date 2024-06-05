package model;

public class CarrinhoDeCompra {
	
	public String produto;
	public int quantidade;
	public int data;
	public int hora;
	
	public CarrinhoDeCompra(String produto, int quantidade, int data, int hora) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
		this.data = data;
		this.hora = hora;
	}

	@Override
	public String toString() {
		return produto + ";" + quantidade + ";" + data + ";" + hora;
	}
	
}
