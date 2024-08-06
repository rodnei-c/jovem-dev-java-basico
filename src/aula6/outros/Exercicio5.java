package aula6.outros;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe a circunferência de um círculo"));
		double num = 2 * Math.PI;
		
		BigDecimal circunferencia = BigDecimal.valueOf(numero);
		BigDecimal divisor = BigDecimal.valueOf(num);
		
		BigDecimal raio = circunferencia.divide(divisor);
		
		if(raio.precision() >= 5) {
			BigDecimal arredondado = raio.round(null);
			System.out.println(arredondado);
		} else {
			
		}
		
		
		
	}
	
}
