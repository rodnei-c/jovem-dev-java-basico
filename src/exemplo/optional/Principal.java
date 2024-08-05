package exemplo.optional;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * 
 */
public class Principal {

	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		String s = getString();
		
		Optional<String> opt = Optional.ofNullable(s);
//		System.out.println(opt.orElse("Não encontrou"));
//		System.out.println(opt.orElseGet(() -> getStringAlternativa()));
		System.out.println(opt.orElseThrow(() -> new IllegalArgumentException("valor nulo")));
		
	}
	
	private String getStringAlternativa() {
		System.out.println("Chamou o método getStringAlternativa");
		return "String alternativa";
	}
	
	private String getString() {
		if(LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
	}
	
}
