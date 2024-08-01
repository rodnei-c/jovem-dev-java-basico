package aula4.lamba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {

		List<Integer> lista = new ArrayList<Integer>();
		
//		Adiciona 50 números aleatórios de 0 a 100
		for (int i = 0; i < 50; i++) {
			lista.add(new Random().nextInt(100));
		}
//		Imprime a lista de 50 npumeros
		lista.forEach(System.out::println);

	}

}
