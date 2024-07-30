package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Frase {
	private String fraseUm;
	private String fraseDois;
	
	public Frase() {
		this.fraseUm = fraseUm;
		this.fraseDois = fraseDois;
	}

	public String getFraseUm() {
		return fraseUm;
	}

	public void setFraseUm(String fraseUm) {
		this.fraseUm = JOptionPane.showInputDialog(fraseUm);
	}

	public String getFraseDois() {
		return fraseDois;
	}

	public void setFraseDois(String fraseDois) {
		this.fraseDois = JOptionPane.showInputDialog(fraseDois);
	}
	
	public boolean frasesIguais(String fraseUm, String fraseDois) {
		if(fraseUm.equals(fraseDois))
			return true;
		return false;
		
	}
	
	public String quatidadeChar() {
		return "A primeira frase tem " + fraseUm.length() + " caracteres e a segunda frase tem " + fraseDois.length() + " caracteres";
	}
	
	
}
