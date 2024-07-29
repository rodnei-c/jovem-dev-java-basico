package aula1.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		
		while(lista.size() < 50) {
		
		lista.add(new Random().nextInt());
		Collections.sort(lista);
		}
		System.out.print(lista);		
		
	}
	
}
