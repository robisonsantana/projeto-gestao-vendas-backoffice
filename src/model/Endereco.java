package model;

public class Endereco {
	
	//propriedades usadas para endereco (tanto pessoa normal quanto juridica)
	public String logradouro;
	public int cep;
	public int numeroPorta;
	public int complemento;
	
	//construtor
	Endereco (String logradouro, int cep, int numeroPorta, int complemento){
		this.logradouro = logradouro;
		this.cep = cep;
		this.numeroPorta = numeroPorta;
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		return "Endereco [logradouro = " + logradouro + ", cep = " + cep + ", numeroPorta = " + numeroPorta + ", complemento = " + complemento +"]";
	}
	
}
