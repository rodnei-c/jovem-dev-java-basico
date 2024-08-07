package aula5.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.exceptions.ZeroBertoException;

class Exercicio5Test {

	@Test
	void deveRetornarPrimeiroNomeTerminadoEmBerto() {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("alberto");
		nomes.add("carlos");
		nomes.add("roberto");
		
		Exercicio5 exercicio = new Exercicio5();
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes);
		
		assertEquals("alberto",retorno);
	}
	
	@DisplayName("Se a lista estiver vazia, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoSeListaVazia() {
		List<String> listaVazia = new ArrayList<>();
		
		Exercicio5 exercicio = new Exercicio5();
		
		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(listaVazia));
	}
	
	@DisplayName("Se houver um elemento nulo e houver um berto, deve trazer berto")
	@Test
	void deveTrazerNomeMesmoComElementoNulo() {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("alberto");
		nomes.add("carlos");
		nomes.add("roberto");
		
		Exercicio5 exercicio = new Exercicio5();
		
		String retorno = exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes);
		
		assertEquals("alberto",retorno);
	}
	
	@DisplayName("Se não houver berto na lista, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcecaoSeNaoHouverBerto() {
		List<String> nomes = new ArrayList<>();
		nomes.add("joao");
		nomes.add("augusto");
		nomes.add("carlos");
		
		Exercicio5 exercicio = new Exercicio5();
		
		assertThrows(ZeroBertoException.class, () -> exercicio.buscaPrimeiroNomeTerminadoEmBerto(nomes));
	}

}
