package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {

		Map<Character, List<String>> mapa = new HashMap<>();

		for (char c : new char[] { 'a', 'e', 'i', 'o', 'u' }) {
			mapa.put(c, new ArrayList<>());
		}

		while (true) {
			String palavra = JOptionPane.showInputDialog("Informe uma palavra: ");

			if (palavra.equalsIgnoreCase("fim")) {
				break;
			}

			if (palavra.contains("a")) {
				mapa.get('a').add(palavra);
			}

			if (palavra.contains("e")) {
				mapa.get('e').add(palavra);
			}

			if (palavra.contains("i")) {
				mapa.get('i').add(palavra);
			}

			if (palavra.contains("o")) {
				mapa.get('o').add(palavra);
			}

			if (palavra.contains("u")) {
				mapa.get('u').add(palavra);
			}

		}
		
		Collections.sort(mapa.get('a'));
		Collections.sort(mapa.get('e'));
		Collections.sort(mapa.get('i'));
		Collections.sort(mapa.get('o'));
		Collections.sort(mapa.get('u'));
		
		for(Map.Entry<Character, List<String>> entry: mapa.entrySet()) {		
			
			System.out.println(entry.getKey() + " - " + entry.getValue());
			
		}

	}
}
