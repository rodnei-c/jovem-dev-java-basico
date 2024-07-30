package aula2.poo.exercicio2;

public class Main {

	public static void main(String[] args) {
		
		Frase f = new Frase();
		
		f.setFraseUm(null);
		f.setFraseDois(null);
		
		System.out.println(f.getFraseUm());
		System.out.println(f.getFraseDois());
		
		System.out.println(f.frasesIguais(f.getFraseUm(), f.getFraseDois()));
		System.out.println(f.quatidadeChar());
		
	}
	
}
