package aula7.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.Pessoa;

class PessoaTest {
	
	private List<Pessoa> lista;
	private static Pessoa pessoa;
	
	@BeforeEach
	void setup() {
		lista = new ArrayList<>();
		pessoa = new Pessoa();
	}

	@DisplayName("Dispara NPE se a lista estiver vazia")
	@Test
	void deveDispararExcecaoSeListaVazia() {
		
		assertThrows(NullPointerException.class, () -> pessoa.buscaPorVogalOuAnoBissexto(lista));
	}
	
	@DisplayName("Verifica se busca por nomes que começam com vogal ou por pessoas que fazem aniversário em ano bissexto")
	@Test
	void deveBuscarPorNomeVogalOuAnoBissexto() {
		
		lista.add(new Pessoa("joao", "12345678", LocalDate.parse("2000-06-11")));
		lista.add(new Pessoa("braulio", "21332409", LocalDate.parse("1998-05-10")));
		lista.add(new Pessoa("arrascaeta", "98765432", LocalDate.parse("2004-05-03")));
		lista.add(new Pessoa("daronco", "77885522", LocalDate.parse("1995-12-04")));
		
//		String retorno = pessoa.buscaPorVogalOuAnoBissexto(lista.get(2).getNome());
		
//		assertEquals(lista.get(2).getNome(), retorno);
		
	}

}
