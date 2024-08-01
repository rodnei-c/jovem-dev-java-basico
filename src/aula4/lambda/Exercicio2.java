package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<Aluno>();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for(int i = 0; i < 5; i++) {
			lista.add(new Aluno(JOptionPane.showInputDialog("Informe o nome: "),
					Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de chamada: ")), 
					LocalDate.parse(JOptionPane.showInputDialog("Informe a data de nascimento: "), df)));
		}
		
		lista.sort(Comparator.comparing(Aluno::getDataNascimento));
		
		for (Aluno aluno : lista) {
			System.out.println(aluno.dados());
		}
		
	}
	
}
