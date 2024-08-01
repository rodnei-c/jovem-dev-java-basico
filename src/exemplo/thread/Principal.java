package exemplo.thread;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Principal {

	public static void main(String[] args) {
		
		new Principal();
		
	}
	public Principal() {
		
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i = 0; i < 100; i++) {
//					System.out.println(i);
//				}
//			}
//			
//		};
//		
//		Runnable rLambda = () -> {
//			for(int i = 0; i < 100; i++) {
//				System.out.println(i);
//			}
//			
//		};
//		Thread t = new Thread(rLambda);
//		
//		System.out.println("Iniciando thread");
//		
//		t.start();
//		
//		System.out.println("Terminou a thread");
		
//		List<String> lista = new ArrayList<String>();
//		lista.add("a1");
//		lista.add("a2");
//		lista.add("a3");
//		lista.add("a4");
//		lista.add("a5");
//		
//		lista.forEach((String s) -> {
//			System.out.println(s);
//		});
//		/***********/
//		Optional.ofNullable("ABC").orElseGet(() -> pegaString());
//		/***************************/
//		lista.removeIf((String s) -> {
//			return s.contains("3");
//		});
//		lista.forEach((String s) -> {
//			System.out.println(s);
//		});
//		
//		lista.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
//		lista.forEach(System.out::println);
		
		FunctionalInterfaceCalculadora c1 = (v1, v2) -> v1 * v2;
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("abc");
		
		String filtro = "abc";
		lista.removeIf(filtro::equals);
		System.out.println(lista);
		
	}
	
	private String pegaString() {
		return "def";
	}
	
}
