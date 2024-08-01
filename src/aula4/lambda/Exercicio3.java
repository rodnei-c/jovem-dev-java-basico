package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<String>();
		
//		Adiciona os nomes a lista em caixa alta
		alunos.add("teodoro".toUpperCase());
		alunos.add("maluco".toUpperCase());
		alunos.add("taison".toUpperCase());
		alunos.add("mesclado".toUpperCase());
		alunos.add("caça-rato".toUpperCase());
		alunos.add("teofilo".toUpperCase());
		
//		Remove da lista nomes que começam com "T" e terminam com "O"
		alunos.removeIf((String s) -> {
			return s.startsWith("T") && s.endsWith("O");
		});
		
		
		System.out.println(alunos);
	}
	
}
