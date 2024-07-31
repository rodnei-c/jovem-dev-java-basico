package aula2.poo.exercicio8;

public class Automovel extends Veiculo{
	
	public Automovel(String nome, String cor, double velocidade) {
		super(nome, cor, velocidade);
	}
	
	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "Vrum";
	}

}
