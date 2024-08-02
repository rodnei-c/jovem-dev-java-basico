package avaliacao.semana1.classes;

import avaliacao.semana1.interfaces.FormaDePagamento;

public class Credito implements FormaDePagamento{

	@Override
	public String formaPagamento() {
		return "Forma de pagamento: Crédito";
	}

}
