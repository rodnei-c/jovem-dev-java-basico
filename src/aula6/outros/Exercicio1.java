package aula6.outros;

public class Exercicio1 {

	public static void main(String[] args) {
		
		for (DiaSemanaEnum diaSemana : DiaSemanaEnum.values()) {
			System.out.println(diaSemana.getNome() + " é fim de semana? " + diaSemana.fimDeSemana());
		}
		
	}
	
}
