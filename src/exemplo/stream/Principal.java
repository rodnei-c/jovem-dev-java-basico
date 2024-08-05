package exemplo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Principal {
	public static void main(String[] args) {
		new Principal();
		
	}
	
	public Principal() {
		List<String> lista = new ArrayList<>();
		
		lista.add("abc");
		lista.add("kjh");
		lista.add("tre");
		lista.add("gfd");
		lista.add("nbv");
		
//		lista.stream().map(String::toUpperCase).forEach(System.out::println);
//		lista.stream().filter(elemento -> elemento.startsWith("a")).forEach(System.out::println);
//		lista.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase).findFirst();
//		lista.stream().filter(elemento -> elemento.startsWith("a")).map(String::toUpperCase).findAny();
		System.out.println(
//				lista.stream().filter(elemento -> elemento.startsWith("a")).mapToInt(String::length).average()
		);
//		List<String> nomesFiltrados = lista.stream().filter(elemento -> elemento.startsWith("a")).collect(Collectors.toList());
//		Map<Integer, List<String>> nomesFiltrados = lista.stream().collect(Collectors.groupingBy(String::length));
//		System.out.println(nomesFiltrados);
		
		String nomesFiltrados = lista.stream().filter(Objects::nonNull).collect(Collectors.joining(" - ", "[", "]"));
		
		
		
		
	}
}
