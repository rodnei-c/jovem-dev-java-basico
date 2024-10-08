package avaliacao.semana1.classes;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private Cliente cliente;
	private List<ItemVenda> itens = new ArrayList<>();
	
	public Venda(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Venda() {
		
	}
	
	public void adicionar(ItemVenda item) {
		itens.add(item);
	}
	
	public void remover(ItemVenda item) {
		itens.remove(item);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getItens() {
		String msg = "";
		for (ItemVenda item : itens) {
			msg += "\n" + item.getProduto().getNome() + "\n" + item.getProduto().getQuant() + "x" + " " + item.getProduto().getPreco()
					+ "  ............... " + item.totalProduto();
		}
		
		return msg;
	}
	
	public double subtotal() {
		double total = 0;
		for (ItemVenda itemVenda : itens) {
			total += itemVenda.totalProduto();
		}
		return total;
	}
	
	public String totalVenda() {
		double total = 0;
		for (ItemVenda itemVenda : itens) {
			total += itemVenda.totalProduto();
		}
		return "\nSubtotal  " + "............... " + total;
	}

	
}
