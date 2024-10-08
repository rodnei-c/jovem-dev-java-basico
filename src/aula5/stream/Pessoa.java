package aula5.stream;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pessoa {
	public static void main(String[] args) {
		
		List<Pessoa> lista = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("joao", "12345678", LocalDate.parse("2000-06-11"));
		Pessoa p2 = new Pessoa("arrascaeta", "98765432", LocalDate.parse("2004-05-03"));
		Pessoa p3 = new Pessoa("chapeleta", "56437888", LocalDate.parse("1997-09-01"));
		Pessoa p4 = new Pessoa("gabigol", "43526785", LocalDate.parse("1986-11-21"));
		Pessoa p5 = new Pessoa("caçapa", "10029846", LocalDate.parse("1992-11-13"));
		Pessoa p6 = new Pessoa("ligma", "25466678", LocalDate.parse("2010-02-13"));
		Pessoa p7 = new Pessoa("sonic", "33445566", LocalDate.parse("2002-03-19"));
		Pessoa p8 = new Pessoa("gura", "9988776655", LocalDate.parse("1999-05-29"));
		Pessoa p9 = new Pessoa("daronco", "77885522", LocalDate.parse("1995-12-04"));
		Pessoa p10 = new Pessoa("braulio", "21332409", LocalDate.parse("1998-05-10"));
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		lista.add(p6);
		lista.add(p7);
		lista.add(p8);
		lista.add(p9);
		lista.add(p10);
		
		
		
//		List<Pessoa> listaMaio = lista.stream()
//				.filter(elemento -> elemento.getDataNasc().getMonth() == mes)
//				.sorted(Comparator.comparing(Pessoa::getNome))
//				.collect(Collectors.toList());
//		List<Pessoa> listaVogal = lista.stream()
//				.filter(elemento -> elemento.getDataNasc().isLeapYear() || elemento.comecaComVogal(elemento.getNome()))
//				.sorted(Comparator.comparing(Pessoa::getNome).reversed())
//				.collect(Collectors.toList());
//		String resultado = listaVogal.stream().map(Pessoa::getNome).collect(Collectors.joining("; "));
		
//		for(int i = 0; i < listaMaio.size(); i++) {
//			System.out.println(listaMaio.get(i).getNome());
//		}
		System.out.println(new Pessoa().buscaPorMaio(lista));
		System.out.println(new Pessoa().buscaPorVogalOuAnoBissexto(lista));
		
	}
	
	public List<String> buscaPorMaio(List<Pessoa> lista) {
		return lista.stream()
				.filter(elemento -> elemento.getDataNasc().getMonth() == Month.MAY)
				.sorted(Comparator.comparing(Pessoa::getNome)).map(Pessoa::getNome)
				.collect(Collectors.toList());
	}
	
	public List<String> buscaPorVogalOuAnoBissexto(List<Pessoa> lista){
		return lista.stream().filter(elemento -> elemento.getDataNasc().isLeapYear() || elemento.comecaComVogal(elemento.getNome()))
				.sorted(Comparator.comparing(Pessoa::getNome).reversed()).map(Pessoa::getNome)
				.collect(Collectors.toList());
	}
	
	private static boolean comecaComVogal(String nome) {
		return Stream.of("a","e","i","o","u").anyMatch(nome::startsWith);
	}
	
	private String nome;
	private String telefone;
	private LocalDate dataNasc;
	
	public Pessoa(String nome, String telefone, LocalDate dataNasc) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	
	
	
}
