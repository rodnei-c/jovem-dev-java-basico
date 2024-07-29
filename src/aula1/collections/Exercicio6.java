package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		double[] notas = new double[3];
		Map<String, Double> mapa = new HashMap<>();
		
		int quantA = 0;
		int quantN = 0;
		
		for(int i = 0; i < nomes.length; i++) {
			nomes[quantA] = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			double total = 0;
			double media = 0;
			for(int j = 0; j < notas.length; j++) {
				notas[quantN] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (j+1) + "º nota"));
				total += notas[j];
				
				quantN++;
			}
			
			media = total/notas.length;
			mapa.put(nomes[quantA], media);
			
			
			quantA++;
			
		}
		for(Entry<String, Double> m: mapa.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
	}
	
}
