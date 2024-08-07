package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe a circunferência: "));
		
		BigDecimal circunferencia = BigDecimal.valueOf(numero);
		
		BigDecimal raio = circunferencia.divide(BigDecimal.valueOf(2 * Math.PI), 4, RoundingMode.HALF_EVEN);
		
		System.out.println(raio);
		
	}
	
}
