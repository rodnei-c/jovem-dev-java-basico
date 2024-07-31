package exemplo.exception;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		try {
		double d = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
		System.out.println(d);
		} catch(NumberFormatException e) {
			System.err.println("O valor digitado é inválido");
			e.printStackTrace();
		} catch(NullPointerException e) {
			System.err.println("Valor nulo");
		}
	}
	
}
