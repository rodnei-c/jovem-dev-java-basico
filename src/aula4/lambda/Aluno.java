package aula4.lambda;

import java.time.LocalDate;

public class Aluno {
	private String nome;
	private int numeroChamada;
	private LocalDate dataNascimento;
	
	public Aluno(String nome, int numeroChamada, LocalDate dataNascimento) {
		this.nome = nome;
		this.numeroChamada = numeroChamada;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroChamada() {
		return numeroChamada;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public String dados() {
		return "\nNome: " + this.getNome() + "\nNumero de chamada: " + this.getNumeroChamada() + "\nData de Nascimento: " + this.getDataNascimento();
	}
	
	
}
