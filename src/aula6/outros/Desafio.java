package aula6.outros;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		List<Evento> eventos = new ArrayList<>();
		TipoDeEvento tipo;
		
		
		while(true) {
			
			eventos.add(new Evento(JOptionPane.showInputDialog("Informe qual vai ser o evento: "),
					LocalDateTime.parse(JOptionPane.showInputDialog("Informe a data e hora do evento: "), formato),
					));
			
		}
		// = Integer.parseInt(JOptionPane.showInputDialog("Tipo de Evento\n1 - Social\n2 - Lazer\n3 - Profissional\n4 - Outros: ")
	}
	
}
