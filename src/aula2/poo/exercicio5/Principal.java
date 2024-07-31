package aula2.poo.exercicio5;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.setNome(null);
		p1.setDataNasc(null);
		p2.setNome(null);
		p2.setDataNasc(null);
		
		if(p1.getIdade() > p2.getIdade()) {
			System.out.println("A pessoa mais velha é " + p1.getNome());
		} else {
			System.out.println("A pessoa mais velha é " + p2.getNome());
		}
		
	}
}
