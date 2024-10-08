
package avaliacao.semana2.testes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;
import avaliacao.semana2.model.Personagem;
import avaliacao.semana2.model.herois.Mago;
import avaliacao.semana2.model.inimigos.Arok;
import avaliacao.semana2.model.inimigos.Morcego;

class PersonagemTest {

	private Personagem mago;
	private Personagem morcego;
	private Personagem arok;
	
	
	@BeforeAll
	void setup() {
		mago = new Mago("Mago", 30, 30, 18, 23);
		morcego = new Morcego("Morcego", 10, 10, 5, 5);
		arok = new Arok("Arok, Mestre Supremo", 50, 50, 20, 20);
	}
	
	
	@Test
	void deveDispararSeArokForDerrotado() {
		
		assertThrows(PersonagemDerrotadoException.class, () -> mago.batalhar(arok));
		
	}

}