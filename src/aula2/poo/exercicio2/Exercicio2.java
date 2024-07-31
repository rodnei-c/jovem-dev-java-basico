package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		String frase1 = JOptionPane.showInputDialog("Primeira frase: ");
		String frase2 = JOptionPane.showInputDialog("Segunda frase: ");
		
		if(frase1.equals(frase2)) {
			System.out.println("As frases são iguais");
		} else {
			System.out.println("As frases não são iguais");
		}
		
		System.out.println("Quantidade de caracteres na primeira frase: " + frase1.length());
		System.out.println("Quantidade de caracteres na segunda frase: " + frase2.length());
	}
	
}
