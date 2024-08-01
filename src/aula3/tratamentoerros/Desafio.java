package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {

		Venda v1 = new Venda(JOptionPane.showInputDialog("Informe o nome do cliente: "));
		Item i1 = new Item();
		i1.setNome(JOptionPane.showInputDialog("Informe o nome do produto: "));

		while (true) {
			try {
				i1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto ")));
				break;
			} catch (PrecoIncorretoException e) {
				System.err.println("O valor do produto não pode ser menor ou igual a zero, digite novamente");
			}
		}
		v1.adicionar(i1);

		try {
			String total = v1
					.totalPreco(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade que deseja: ")));
			System.out.println(v1.getItens() + total);
		} catch (VendaException e) {
			System.err.println("A quantidade não pode ser menor ou igual a 0");
		}
	}

}
