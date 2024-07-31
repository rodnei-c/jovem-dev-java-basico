package aula3.tratamentoerros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio3 {
	public static void main(String[] args) {
		
		try {
			System.out.println(6/0);
		} catch (ArithmeticException e) {
			System.err.println("Não pode ser dividido por 0");
		}
		
		try {
			String nuloErro = null;
			System.out.println(nuloErro.length());
		} catch (NullPointerException e) {
			System.err.println("Não pode ser um valor nulo");
		}
		
		try {
			String strErro = "barril";
			System.out.println(strErro.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Erro! o valor pedido está fora dos limites do elemento");
		}
		
		try {
			List<Integer> listaErro = new ArrayList<>();
			Iterator<Integer> listaErroIterator = listaErro.iterator();
			listaErroIterator.remove();			
		} catch (IllegalStateException e) {
			System.err.println("Erro! Método usado errado!");
		}
	}
}
