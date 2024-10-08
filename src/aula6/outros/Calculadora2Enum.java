package aula6.outros;

import java.util.function.BiFunction;

public enum Calculadora2Enum {

	SOMA("Soma", (valor1, valor2) -> (valor1 + valor2)),
	SUBTRACAO("Subtração", (valor1, valor2) -> (valor1 - valor2)),
	DIVISAO("Divisão", (valor1, valor2) -> (valor1 / valor2)),
	MULTIPLICACAO("Multiplicação", (valor1, valor2) -> (valor1 * valor2));
	
	private String nomeAmigavel;
	private BiFunction<Integer, Integer, Integer> calculo;
	
	
	private Calculadora2Enum(String nomeAmigavel, BiFunction<Integer, Integer, Integer> calculo) {
		this.nomeAmigavel = nomeAmigavel;
		this.calculo = calculo;
		
	}


	public String getNomeAmigavel() {
		return nomeAmigavel;
	}


	public BiFunction<Integer, Integer, Integer> getResultado() {
		return calculo;
	}
	
}
