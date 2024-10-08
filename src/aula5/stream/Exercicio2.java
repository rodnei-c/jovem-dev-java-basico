package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio2 {

	public static void main(String[] args) {
		
		new Exercicio2();
		
	}
	
	public Exercicio2() {
		
		List<Integer> rng = new ArrayList<>();
		
		for(int i = 0; i < 50; i++) {
			
			rng.add(new Random().nextInt(100));
			
		}
		rng.forEach(System.out::println);
		
		List<Integer> maisQue = rng.stream().filter(elemento -> elemento.intValue() > 50).collect(Collectors.toList());
		
		System.out.println(maisQue);
		System.out.println(
				maisQue.stream().collect(Collectors.averagingInt(Integer::intValue))		
		);
		
		
	}
	
}
