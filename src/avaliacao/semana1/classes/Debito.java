package avaliacao.semana1.classes;

import avaliacao.semana1.interfaces.FormaDePagamento;

public class Debito implements FormaDePagamento{

	@Override
	public String formaPagamento() {
		// TODO Auto-generated method stub
		return "Forma de pagamento: Débito";
	}

}
