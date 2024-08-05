package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio1 {

	public static void main(String[] args) {
		
		new Exercicio1();
		
	}
	
	public Exercicio1() {
		
		List<Integer> rng = new ArrayList<>();
		
		for(int i = 0; i < 50; i++) {
			
			rng.add(new Random().nextInt(100));
			
		}
		rng.forEach(System.out::println);
		System.out.println(
		rng.stream().collect(Collectors.summingInt(Integer::intValue))
		);
		
		
	}
	
}
