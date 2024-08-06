package aula6.outros;

public enum DiaSemanaEnum {

	SEGUNDA("Segunda-feira", false) {
		@Override
		boolean fimDeSemana() {
			// TODO Auto-generated method stub
			return this.isFimDeSemana();
		}
	},
	TERCA("Terça-feira", false) {
		@Override
		boolean fimDeSemana() {
			// TODO Auto-generated method stub
			return this.isFimDeSemana();
		}
	},
	QUARTA("Quarta-feira", false) {
		@Override
		boolean fimDeSemana() {
			// TODO Auto-generated method stub
			return this.isFimDeSemana();
		}
	},
	QUINTA("Quinta-feira", false) {
		@Override
		boolean fimDeSemana() {
			// TODO Auto-generated method stub
			return this.isFimDeSemana();
		}
	},
	SEXTA("Sexta-feira", false) {
		@Override
		boolean fimDeSemana() {
			// TODO Auto-generated method stub
			return this.isFimDeSemana();
		}
	},
	SABADO("Sábado", true) {
		@Override
		boolean fimDeSemana() {
			// TODO Auto-generated method stub
			return this.isFimDeSemana();
		}
	},
	DOMINGO("Domingo", true) {
		@Override
		boolean fimDeSemana() {
			// TODO Auto-generated method stub
			return this.isFimDeSemana();
		}
	};
	
	private String nome;
	private boolean isFimDeSemana;
	
	private DiaSemanaEnum(String nome, boolean isFimDeSemana) {
		this.nome = nome;
		this.isFimDeSemana = isFimDeSemana;
	}

	public String getNome() {
		return nome;
	}

	public boolean isFimDeSemana() {
		return isFimDeSemana;
	}
	
	abstract boolean fimDeSemana();
	
	
}
