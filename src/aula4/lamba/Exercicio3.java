package aula4.lamba;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<String>();
		
		alunos.add("teodoro".toUpperCase());
		alunos.add("maluco".toUpperCase());
		alunos.add("taison".toUpperCase());
		alunos.add("mesclado".toUpperCase());
		alunos.add("caça-rato".toUpperCase());
		alunos.add("teofilo".toUpperCase());
		
		alunos.removeIf((String s) -> {
			return s.startsWith("T") && s.endsWith("O");
		});
		
		
		System.out.println(alunos);
	}
	
}
