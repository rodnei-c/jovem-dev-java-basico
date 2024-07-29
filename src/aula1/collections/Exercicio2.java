package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();

		while (lista.size() < 50) {

			lista.add(new Random().nextInt(60));
			Collections.sort(lista.reversed());
			
		}
		System.out.println(lista);

	}

}
