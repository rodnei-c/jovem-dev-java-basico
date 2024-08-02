package avaliacao.semana1.classes;

import avaliacao.semana1.exceptions.QuantException;

public class Produto {
	private String nome;
	private double preco;
	private int quant;
	
	public Produto(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
	}

	public Produto() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) throws QuantException {
		if(quant < 1 || quant > 50) {
			throw new QuantException();
		}
		this.quant = quant;
	}
	
}
