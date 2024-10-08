package exemplo.enuns;

import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		
	new Principal();	
		
	}
	
	public Principal() {
		System.out.println(FormaPagamento.CARTAO_CREDITO.ordinal());
		
		for (FormaPagamento pagamento : FormaPagamento.values()) {
			System.out.println(pagamento.getDesconto().apply((double) 100));
		}
		System.out.println(FormaPagamento.valueOf("CARTAO_CREDITO").getCodigo());
		
		String nome = "joao";
		StringBuilder sb = new StringBuilder();
		sb.append("O nome do usuário é ").append(nome).append(" e ele tem ").append(18).append(" anos");
		BigDecimal b1 = BigDecimal.valueOf(0.1);
		BigDecimal b2 = BigDecimal.valueOf(0.2);
		System.out.println(b1.add(b2));
		
		
	}
	
}
