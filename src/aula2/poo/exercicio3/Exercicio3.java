package aula2.poo.exercicio3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		String dataStr = JOptionPane.showInputDialog("Informe uma data no formato dd/MM/yyyy: ");
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = LocalDate.MIN;
		try {
			data = LocalDate.parse(dataStr,formato);
			System.out.println(data.getDayOfWeek());
			} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Formato inválido, digite no formato dd/MM/aaaa");
		}

	}
}
