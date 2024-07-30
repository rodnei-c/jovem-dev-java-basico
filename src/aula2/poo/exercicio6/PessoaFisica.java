package aula2.poo.exercicio6;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa{
	private String cpf;

	public PessoaFisica() {
		super();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = JOptionPane.showInputDialog("Informe o cpf: ");
	}
	
	public String dados() {
		return this.getNome();
		
	}
	
}
