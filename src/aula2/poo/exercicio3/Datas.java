package aula2.poo.exercicio3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Datas {
	private LocalDate data;
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Datas() {
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		try {
		this.data = LocalDate.parse(JOptionPane.showInputDialog("Informe uma data válida: "), formato);
		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "Formato inválido, digite no formato dd/mm/aaaa");
		}
	}
	
	public DayOfWeek diaSemana() {
		return this.data.getDayOfWeek() ;
	}
	
	
	
}
