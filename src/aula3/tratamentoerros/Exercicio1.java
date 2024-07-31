package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		try {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		System.out.println(numero);
		} catch(IllegalArgumentException e) {
			System.err.println("Valor Inválido");
		} 
	}
	
}
