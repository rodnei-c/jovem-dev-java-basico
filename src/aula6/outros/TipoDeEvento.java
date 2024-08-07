package aula6.outros;

public enum TipoDeEvento {

	SOCIAL(1, "Social"),
	LAZER(2, "Lazer"),
	PROFISSIONAL(3, "Profissional"),
	OUTROS(4, "Outros");
	
	private int numero;
	private String nome;
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	private TipoDeEvento(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	
}
