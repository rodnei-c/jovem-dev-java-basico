package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {

	public static void main(String[] args) {
		
		try {
			
		System.out.println(divisao());
		
		} catch(ZeroException e) {
			System.err.println("O segundo número não pode ser zero");
		}
		
	}
	
	public static double divisao() {
		
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro número: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo número: "));
		
		if(n2 == 0) {
			throw new ZeroException();
		}
		
		return n1/n2;
		
	}
	
}
