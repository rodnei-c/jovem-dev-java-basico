package aula2.poo.exercicio4;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("abc123", 1999, "vermelho");
		Carro c2 = new Carro("def456", 2004, "amarelo");
		Carro c3 = new Carro("ghi789", 2000, "verde");
		
		
		System.out.println("Primeiro carro: \n" + c1.dados() + "\n");
		System.out.println("Segundo carro: \n" + c2.dados() + "\n");
		System.out.println("Terceiro carro: \n" + c3.dados() + "\n");
		
	}
	
}
