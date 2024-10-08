package exemplo.enuns;

import java.util.function.Function;

public enum FormaPagamento {

	CARTAO_DEBITO(2, "Cartão de débito", vb -> vb),
	CARTAO_CREDITO(1, "Cartão de crédito", vb -> vb),
	DINHEIRO(3, "Dinheiro", vb -> vb * 0.8),
	PIX(17, "Pix", vb -> vb * 0.9);
	
	
	public Function<Double, Double> getDesconto() {
		return desconto;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	private int codigo;
	private String descricao;
	private Function<Double, Double> desconto;
	
	private FormaPagamento(int codigo, String descricao, Function<Double, Double> desconto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.desconto = desconto;
	}
	
}
