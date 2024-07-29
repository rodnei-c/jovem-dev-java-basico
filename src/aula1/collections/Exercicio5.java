package aula1.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Set<Integer> conjuntoUm = new HashSet<>();
		Set<Integer> conjuntoDois = new HashSet<>();
		Set<Integer> conjuntoTres = new HashSet<>();
		
		while(conjuntoUm.size() < 10 && conjuntoDois.size() < 10) {
			
			conjuntoUm.add(new Random().nextInt(30));
			conjuntoDois.add(new Random().nextInt(30));
			
			
			
			
		}
		
		System.out.println(conjuntoUm);
		System.out.println(conjuntoDois);
		conjuntoDois.retainAll(conjuntoUm);
		System.out.println(conjuntoDois);
		
	}
	
}
