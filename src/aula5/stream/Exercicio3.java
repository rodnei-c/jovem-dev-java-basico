package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio3 {

	public static void main(String[] args) {
		
		new Exercicio3();
		
	}
	
	public Exercicio3() {
		
List<Integer> rng = new ArrayList<>();
		
		for(int i = 0; i < 50; i++) {
			
			rng.add(new Random().nextInt(100));
			
		}
		rng.forEach(System.out::println);
		
		List<Integer> quantNum = rng.stream().filter(elemento -> elemento == 25).collect(Collectors.toList());
		
		System.out.println(quantNum);
		System.out.println(
				quantNum.stream().count()	
		);
		
	}
	
}