package avaliacao.semana2;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;
import avaliacao.semana2.model.Personagem;
import avaliacao.semana2.model.herois.Barbaro;
import avaliacao.semana2.model.herois.Mago;
import avaliacao.semana2.model.herois.Paladino;
import avaliacao.semana2.model.inimigos.Arok;
import avaliacao.semana2.model.inimigos.Morcego;
import avaliacao.semana2.model.inimigos.Urso;
import avaliacao.semana2.model.inimigos.Vampiro;
import avaliacao.semana2.model.inimigos.Zumbi;

public class Main {

	public static void main(String[] args) {
		

		
		
//		CRIAÇÃO DE PERSONAGEM
		Personagem mago = new Mago("Mago", 30, 30, 18, 23);
		Personagem barbaro = new Barbaro("Bárbaro", 100, 100, 20, 18);
		Personagem paladino = new Paladino("Paladino", 50, 50, 20, 19);
		
		Personagem morcegoM = new Morcego("Morcego", 10, 10, 5, 5);
		Personagem zumbiM = new Zumbi("Zumbi", 22, 22, 6, 6);
		Personagem ursoM = new Urso("Urso", 30, 30, 8, 9);
		Personagem vampiroM = new Vampiro("Vampiro", 35, 35, 10, 10);
		Personagem arokM = new Arok("Arok, Mestre Supremo", 50, 50, 20, 20);
		
		Personagem morcegoB = new Morcego("Morcego", 10, 10, 5, 5);
		Personagem zumbiB = new Zumbi("Zumbi", 22, 22, 6, 6);
		Personagem ursoB = new Urso("Urso", 30, 30, 8, 9);
		Personagem vampiroB = new Vampiro("Vampiro", 35, 35, 10, 10);
		Personagem arokB = new Arok("Arok, Mestre Supremo", 50, 50, 20, 20);
		
		Personagem morcegoP = new Morcego("Morcego", 10, 10, 5, 5);
		Personagem zumbiP = new Zumbi("Zumbi", 22, 22, 6, 6);
		Personagem ursoP = new Urso("Urso", 30, 30, 8, 9);
		Personagem vampiroP = new Vampiro("Vampiro", 35, 35, 10, 10);
		Personagem arokP = new Arok("Arok, Mestre Supremo", 50, 50, 20, 20);

		
//		*********************************** MAGO CONTRA OS INIMIGOS *************************************
		
		
		try {
		
			mago.batalhar(morcegoM);
		
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			mago.batalhar(zumbiM);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			mago.batalhar(ursoM);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			mago.batalhar(vampiroM);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			mago.batalhar(arokM);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		
//		*********************************** BARBARO CONTRA OS INIMIGOS *************************************
		
		
		try {
			
			barbaro.batalhar(morcegoB);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			barbaro.batalhar(zumbiB);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			barbaro.batalhar(ursoB);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			barbaro.batalhar(vampiroB);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			barbaro.batalhar(arokB);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		
//		*********************************** PALADINO CONTRA OS INIMIGOS *************************************
		
		
		try {
			
			paladino.batalhar(morcegoP);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			paladino.batalhar(zumbiP);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			paladino.batalhar(ursoP);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			paladino.batalhar(vampiroP);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
		try {
			
			paladino.batalhar(arokP);
			
		} catch(PersonagemDerrotadoException e) {
			System.out.println(e.getMensagem());
		}
		
	}
	
}
