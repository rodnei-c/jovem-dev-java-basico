package aula3.tratamentoerros;

import java.util.ArrayList;

import aula3.tratamentoerros.exceptions.VendaException;

public class Venda {
	private String nomeCliente;
	private ArrayList<Item> itens;
	
	public Venda(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.itens = new ArrayList<Item>();
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public void adicionar(Item item) {
		itens.add(item);
	}
	
	public void remover(Item item) {
		itens.remove(item);
	}
	
	public String totalPreco(int quant) {
		if(quant < 1 || quant > 10) {
			throw new VendaException();
		}
		double total = 0;
		for (Item item : itens) {
			total = item.getPreco() * quant;
		}
		return "\nTotal: " + total;
	}

	public String getItens() {
		String msg = "";
		for (Item item : itens) {
			msg += item.dados();
		}
		return msg;
	}
	
}
