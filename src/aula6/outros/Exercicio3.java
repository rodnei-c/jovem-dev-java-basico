package aula6.outros;

public class Exercicio3 {

	public static void main(String[] args) {
		
		System.out.println(Calculadora2Enum.SOMA.getResultado().apply(4, 2));
		System.out.println(Calculadora2Enum.SUBTRACAO.getResultado().apply(4, 2));
		System.out.println(Calculadora2Enum.DIVISAO.getResultado().apply(4, 2));
		System.out.println(Calculadora2Enum.MULTIPLICACAO.getResultado().apply(4, 2));
		
	}
	
}
