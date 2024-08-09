package avaliacao.semana2.exceptions;

public class PersonagemDerrotadoException extends Exception{
	private String mensagem;
	public PersonagemDerrotadoException(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getMensagem() {
		return mensagem;
	}
	
}
