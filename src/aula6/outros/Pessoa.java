package aula6.outros;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private LocalDate dataNasc;
	
	public Pessoa(String nome,String telefone , LocalDate dataNasc) {
		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
	}
	
	public Pessoa() {
		
	}

	public String getTelefone() {
		return telefone;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}
	
	
	
}
