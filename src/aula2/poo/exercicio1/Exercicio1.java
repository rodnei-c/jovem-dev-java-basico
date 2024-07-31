package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite um número com virgula (Exemplo 1,2): ");
		if(numero.contains(",")) {
		
		System.out.println(numero.replace(",", ""));	
		
		} else {
			System.out.println("Número inválido");
		}
		
	}	
	
}
