package aula3.tratamentoerros;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;

public class Item {
	private String nome;
	private double preco;
	
	public Item() {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		if(preco <= 0 ) {
			throw new PrecoIncorretoException();
			
		}
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	public String dados() {
		return "Nome do produto: " + this.getNome() + "\nValor do produto: " + this.getPreco();
	}
}
