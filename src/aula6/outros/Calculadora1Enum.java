package aula6.outros;

import java.util.function.Function;

public enum Calculadora1Enum {

	SOMA("Soma", (valor1, valor2) -> (valor1 + valor2)),
	SUBTRACAO("Subtração", (valor1, valor2) -> (valor1 - valor2)),
	DIVISAO("Divisão", (valor1, valor2) -> (valor1 / valor2)),
	MULTIPLICACAO("Multiplicação", (valor1, valor2) -> (valor1 * valor2));
	
	private String nomeAmigavel;
	private CalculoInterface resultado;
	
	
	private Calculadora1Enum(String nomeAmigavel, CalculoInterface resultado) {
		this.nomeAmigavel = nomeAmigavel;
		this.resultado = resultado;
		
	}


	public String getNomeAmigavel() {
		return nomeAmigavel;
	}


	public CalculoInterface getResultado() {
		return resultado;
	}
	
	
	
}
