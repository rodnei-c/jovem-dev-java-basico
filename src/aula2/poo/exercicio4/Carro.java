package aula2.poo.exercicio4;

import javax.swing.JOptionPane;

public class Carro {

	private String modelo;
	private int ano;
	private String cor;
	
	public Carro(String modelo, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String dados() {
		return "O modelo do carro é " + this.getModelo() + "\n" + "O ano do carro é " + this.getAno() + "\n" + "A cor do carro é " + this.getCor();
	}
	
}
