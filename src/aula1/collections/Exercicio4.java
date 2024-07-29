package aula1.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");

		Map<Character, Integer> mapa = new HashMap<>();
		
		char[] strVetor = frase.toCharArray();
		
		for(char c: strVetor) {
			
			if(mapa.containsKey(c)) {
				mapa.put(c, mapa.get(c) + 1);
			} else {
				mapa.put(c, 1);
			}
			
		}
		
		for(Entry<Character, Integer> m: mapa.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
	}
	
}
