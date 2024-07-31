package aula3.tratamentoerros.exceptions;

public class ZeroException extends IllegalArgumentException {

	public ZeroException(String mensagem) {
		super(mensagem);
	}
	
	public ZeroException() {
		super();
	}
	
}
