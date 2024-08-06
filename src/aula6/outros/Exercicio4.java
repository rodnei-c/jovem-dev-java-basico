package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		DateTimeFormatter dataF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Pessoa p1 = new Pessoa(JOptionPane.showInputDialog("Nome da primeira pessoa: "),
				JOptionPane.showInputDialog("Telefone da primeira pessoa: "),
				LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento da primeira pessoa: "), dataF));
		
		Pessoa p2 = new Pessoa(JOptionPane.showInputDialog("Nome da segunda pessoa: "),
				JOptionPane.showInputDialog("Telefone da segunda pessoa: "),
				LocalDate.parse(JOptionPane.showInputDialog("Data de Nascimento da segunda pessoa: "), dataF));
		
		if(p1.getDataNasc().isBefore(p2.getDataNasc())) {
			StringBuilder sb = new StringBuilder();
			sb.append("O nome da pessoa mais velha é ").append(p1.getNome())
			.append("\nO telefone da pessoa mais velha é ").append(p1.getTelefone())
			.append("\nA data de nascimento da pessoa mais velha é ").append(p1.getDataNasc());
			
			System.out.println(sb);
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append("O nome da pessoa mais velha é ").append(p2.getNome())
			.append("\nO telefone da pessoa mais velha é ").append(p2.getTelefone())
			.append("\nA data de nascimento da pessoa mais velha é ").append(p2.getDataNasc());
			
			System.out.println(sb);
		}
		
		
	}
	
}
