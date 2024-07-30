package exemplo;

public abstract class Animal {

	public int tamanho;
	public String nome;
	
	protected void metodoProtected() {
		
	}
	
	public void andar() {
		System.out.println("animal andando");
	}
	
	public abstract void fazerBarulho();
	
}
