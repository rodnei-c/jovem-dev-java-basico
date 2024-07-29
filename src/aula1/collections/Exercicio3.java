package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		Set<Integer> lista2 = new HashSet<>();

		while (lista.size() < 50) {

			lista.add(new Random().nextInt(20));
			lista2.addAll(lista);
			Collections.sort(lista);
			
		}
		
		System.out.println(lista);
		System.out.println(lista2);
		
	}
	
}
