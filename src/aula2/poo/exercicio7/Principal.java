package aula2.poo.exercicio7;

public class Principal {

	public static void main(String[] args) {
		
		NotaFiscal nota1 = new NotaFiscal(60, "teste");
		
		System.out.println("O valor " + nota1.getValor() + " fica " + nota1.calculaValor(nota1.getValor(), 20)
		+ " com desconto");
		
	}
	
}
