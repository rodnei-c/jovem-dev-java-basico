package aula2.poo.exercicio7;

public class NotaFiscal {
	private double valor;
	private String emitente;
	
	public NotaFiscal(double valor, String emitente) {
		this.valor = valor;
		this.emitente = emitente;
	}

	public double getValor() {
		return valor;
	}

	public String getEmitente() {
		return emitente;
	}
	
	public double calculaValor(double valor, double desconto) {
		double desc = 0;
		double total = 0;
		desc = valor * desconto / 100;
		total = valor - desc;
		return total;
	}
	
}
