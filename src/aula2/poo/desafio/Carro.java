package aula2.poo.desafio;

public class Carro {
	private String modelo = "";
	private int ano;
	
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}
	
	public String dados() {
		return "Modelo: " + this.getModelo() + "\nAno: " + this.getAno();
	}
}
