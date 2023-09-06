package animais;

public class Mamiferos extends Animal {

	private String pelos;
	private int glandulas;

	public Mamiferos(int pernas, String cabeca, String nome, int idade, String pelos, int glandulas) {
		super(pernas, cabeca, nome, idade);
		this.pelos = pelos;
		this.glandulas = glandulas;
	}
	//Método de ação do animal (Expesífico de um mamifero)
	public void Amamentar() {
		System.out.println("Está amamentando");
	}

	public String getPelos() {
		return pelos;
	}

	public void setPelos(String pelos) {
		this.pelos = pelos;
	}

	public int getGlandulas() {
		return glandulas;
	}

	public void setGlandulas(int glandulas) {
		this.glandulas = glandulas;
	}

	

}
