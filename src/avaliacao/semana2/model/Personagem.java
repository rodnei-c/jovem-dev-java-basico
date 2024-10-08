package avaliacao.semana2.model;

import java.util.Random;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public abstract class Personagem {

	private String nome;
	private int maxHP;
	private int hp;
	private int ataque;
	private int defesa;
	
	public Personagem(String nome, int maxHP, int hp, int ataque, int defesa) {
		this.nome = nome;
		this.maxHP = maxHP;
		this.hp = hp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	
	public void batalhar(Personagem p) throws PersonagemDerrotadoException {
//		Enquanto nenhum dos dois estiverem mortos, o personagem irá atacar.
		do {
			
			System.out.println(atacar(p));
			
		} while(this.getHp() > 0 || p.getHp() > 0);
		
		
	}
	
	public String atacar(Personagem p) throws PersonagemDerrotadoException {
		
//		Rola 1d6.
		int dado = new Random().nextInt(1, 6);
//		Adiciona o modificador ao ataque.
		int atkRoll = this.getAtaque() + dado;		
//		Compara a rolagem de ataque com a defesa do oponente.
		if(atkRoll > p.getDefesa()) {	
//		Calcula o dano e subtrai da vida.
			int atkDano = atkRoll - p.getDefesa();
			p.setHp(p.getHp() - atkDano);
//		Verifica se algum personagem morreu e dispara uma exception.
			if(p.getHp() <= 0) {
				if(p.getNome().equals("Arok, Mestre Supremo")) {
					throw new PersonagemDerrotadoException(p.getNome() + " foi derrotado por " + this.getNome() + ", que se tornou o novo campeão");
				}
				throw new PersonagemDerrotadoException(p.getNome() + " foi derrotado por " + this.getNome());
			} else if(this.getHp() <= 0) {
				throw new PersonagemDerrotadoException(this.getNome() + " foi derrotado por " + p.getNome());
			} else {
				System.out.println(p.getNome() + " HP: " + p.getHp() + "/" + p.getMaxHP());
			}
			
		} else {
			System.out.println(getNome() + " errou o ataque!");
		}
//		Turno do adversário.
		p.batalhar(this);
		return p.getNome() + " HP: " + this.getHp() + "/" + this.getMaxHP() ;
	}
	
}
