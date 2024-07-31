package aula2.poo.exercicio6;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		PessoaFisica p2 = new PessoaFisica();
		
		p1.setNome(null);
		p1.setDataNasc(null);
		p2.setNome(null);
		p2.setDataNasc(null);
		p2.setCpf(null);
		
		if(p1.getIdade() > p2.getIdade()) {
			System.out.println(p2.dados());
		} else {
			System.out.println(p1.dados());
		}
		
		
		
	}
}
