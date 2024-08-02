package avaliacao.semana1.classes;

public class ItemVenda {
	private Produto produto;
	
	public ItemVenda(Produto produto) {
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double totalProduto() {
		double total = produto.getPreco() * produto.getQuant();
		return total;
	}
}
