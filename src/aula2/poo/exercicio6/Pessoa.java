package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private LocalDate dataNasc;
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	
	public Pessoa() {
		this.nome = nome;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = JOptionPane.showInputDialog(null, "Informe o nome: ");
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		try {
			this.dataNasc = LocalDate.parse(JOptionPane.showInputDialog("Informe uma data de nascimento válida: "), formato);
			LocalDate dataAtual = LocalDate.now();
			if(this.dataNasc.isAfter(dataAtual)) {
				JOptionPane.showMessageDialog(null, "Data inválida");
				setDataNasc(dataNasc);
			}
			} catch(Exception e){
				JOptionPane.showMessageDialog(null, "Formato inválido, digite no formato dd/mm/aaaa");
			}
	}
	
	public String dados() {
		return "Nome: " + this.getNome() + "\nData de nascimento: " + this.getDataNasc();
	}
	
	
}
