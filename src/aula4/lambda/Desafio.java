package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Desafio {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		Mostrador s1 = palavra -> palavra.toUpperCase();
		
		String p1 = s1.mostra("joelho");
		String p2 = s1.mostra("dimba");
		String p3 = s1.mostra("chapeleta");
		String p4 = s1.mostra("ouriço");
		String p5 = s1.mostra("bafora");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		lista.forEach(System.out::println);
	}
 	
}
