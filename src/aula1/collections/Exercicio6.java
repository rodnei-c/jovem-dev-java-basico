package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Map<String, Double[]> mapa = new HashMap<>();
	
		for(int i = 0; i < 5; i++) {
			
			String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			double[] notas = new double[3];
			
			for(int j = 0; j < 3; j++) {
				
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + j+1 + "º nota"));
				
				if(nota > 10 || nota < 0) {
					System.out.println("Nota inválida");
				} else {
					notas[j] = nota;
				}
				
			}
			
			mapa.put(nome, notas);
			
		}
	}
	
}
