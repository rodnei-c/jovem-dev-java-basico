package aula6.outros;

public class Exercicio2 {

	public static void main(String[] args) {
		
		System.out.println(Calculadora1Enum.SOMA.getResultado().calcular(4, 2));
		System.out.println(Calculadora1Enum.SUBTRACAO.getResultado().calcular(4, 2));
		System.out.println(Calculadora1Enum.DIVISAO.getResultado().calcular(4, 2));
		System.out.println(Calculadora1Enum.MULTIPLICACAO.getResultado().calcular(4, 2));
		
	}
	
}
