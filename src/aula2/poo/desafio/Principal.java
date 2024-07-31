package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		List<Carro> lista = new ArrayList<>();
		
		String modelo = "";
		do {
			modelo = JOptionPane.showInputDialog("Informe o modelo do carro: ");
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro: "));
			
			
			lista.add(new Carro(modelo, ano));
			if(modelo.equalsIgnoreCase(modelo)) {
				
				lista.removeLast();
				
			}
			
			
		} while(!modelo.equals("fim"));
		lista.sort(new Comparator<Carro>() {
			public int compare(Carro c1, Carro c2) {
				return Integer.compare(c1.getAno(), c2.getAno());
			}
		});
		
		for (Carro c : lista) {
			System.out.println(c.dados());
		}
		
	}
	
}
