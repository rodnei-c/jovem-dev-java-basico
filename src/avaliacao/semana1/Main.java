package avaliacao.semana1;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import avaliacao.semana1.classes.Cliente;
import avaliacao.semana1.classes.ClientePremium;
import avaliacao.semana1.classes.Credito;
import avaliacao.semana1.classes.Debito;
import avaliacao.semana1.classes.Dinheiro;
import avaliacao.semana1.classes.ItemVenda;
import avaliacao.semana1.classes.Produto;
import avaliacao.semana1.classes.Venda;
import avaliacao.semana1.exceptions.QuantException;
import avaliacao.semana1.interfaces.DescontoInterface;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 
		 * FALTOU METHOD REFERENCE
		 * FALTOU 1 CATCH
		 * FALTOU OTIMIZAR ALGUMAS FUNÇÕES
		 * FALTOU MASCARAR O CLIENTE
		 * 
		 * 
		 * 
		 * 
		 */

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DescontoInterface desconto = (valor1, valor2) -> valor1 - (valor1 * ((double)valor2 / 100));
		Cliente c1 = new Cliente(JOptionPane.showInputDialog("Nome do cliente: "),
				LocalDate.parse(JOptionPane.showInputDialog("Data de nascimento: "), df));
		Venda venda = new Venda();
		String msg = "";
		double totalCompra = 0;
		Credito credito = new Credito();
		Debito debito = new Debito();
		Dinheiro dinheiro = new Dinheiro();
		String formaPagMsg = "";
		
		while (true) {
			Produto p1 = new Produto();

			p1.setNome(JOptionPane.showInputDialog("Qual produto deseja? "));

			if (p1.getNome().equalsIgnoreCase("fim")) {
				break;
			}
			p1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: ")));
			try {
			p1.setQuant(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade que quer: ")));
			} catch(QuantException e) {
				System.err.println("Não é permitido uma quantidade menor que 1 ou maior que 50");
			}

			ItemVenda item = new ItemVenda(p1);

			venda.setCliente(c1);
			venda.adicionar(item);

		}
		
		int formaPag = Integer.parseInt(JOptionPane.showInputDialog("Como deseja pagar\n1- Cartão de crédito\n2- Cartão de Débito\n3- Dinheiro"));
		
		if(formaPag == 1) {
			formaPagMsg = credito.formaPagamento();
		} else if(formaPag == 2) {
			formaPagMsg = debito.formaPagamento();
		} else if(formaPag == 3) {
			formaPagMsg = dinheiro.formaPagamento();
		} else {
			System.out.println("Forma de pagamento inválida");
		}

		int valorDesc = 0;
		double subtotal = venda.subtotal();
		LocalDate dtAtual = LocalDate.now();
		int idade = dtAtual.getYear() - c1.getDataNasc().getYear();
		int diaNasc = c1.getDataNasc().getDayOfMonth();
		Month mesNasc = c1.getDataNasc().getMonth();
		
		if (c1.getNome().equalsIgnoreCase("thiago")) {
			totalCompra = desconto.calculaDesconto(subtotal, 20);
			msg = "\nDescto. 20% cliente premium\n\n" + "Total ...............  " + totalCompra;
		} else {
			if (idade >= 60) {
				totalCompra = desconto.calculaDesconto(subtotal, 10);
				msg = "\nDescto. 10% terceira idade\n\n" + "Total ...............  " + totalCompra;
			} else {
				if (diaNasc == dtAtual.getDayOfMonth() && mesNasc == dtAtual.getMonth()) {
					totalCompra = desconto.calculaDesconto(subtotal, 30);
					msg = "\nDescto. 30% aniversário\n\n" + "Total ...............  " + totalCompra;
				}
			}
		}
		
		

		System.out.println("************ CUPOM ************\n" + venda.getItens() + "\n" + venda.totalVenda() + msg + "\n" + formaPagMsg + "\nCliente: " + c1.getNome());

	}

}
