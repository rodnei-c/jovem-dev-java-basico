package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {
	public static void main(String[] args) {
		List<String> nome = new ArrayList<>();
		
		nome.add("douglas");
		nome.add("valdemiro");
		nome.add("mirosvaldo");
		nome.add("ced");
		nome.add("dmoc");
		nome.add("roberto");
		nome.add("adalberto");
		nome.add("bertones");
		nome.add("gabigol");
		nome.add("solaire");
		
//		List<String> nomeBerto = nome.stream().filter(elemento -> elemento.endsWith("berto")).collect(Collectors.toList());
		
		System.out.println(new Exercicio5().buscaPrimeiroNomeTerminadoEmBerto(nome));
		
	}
	
	public String buscaPrimeiroNomeTerminadoEmBerto(List<String> lista) {
		return lista.stream()
				.filter(Objects::nonNull)
				.filter(n -> n.endsWith("berto"))
				.findFirst()
				.orElseThrow(() -> new ZeroBertoException("Nenhum berto encontrado"));
	}
}
