package animais;

public class Ave extends Animal {
	private double tamanhoDaAsa;
	private String tipoDoBico;

	public Ave(int pernas, String cabeca, String nome, int idade, double tamnhoDaAsa, String tipodoBico) {
		super(pernas, cabeca, nome, idade);
		this.tamanhoDaAsa = tamnhoDaAsa;
		this.tipoDoBico = tipodoBico;
	}

	public void Voar() {
		System.err.println("O animal está voando !!");
	}

	public double getTamanhoDaAsa() {
		return tamanhoDaAsa;
	}

	public void setTamanhoDaAsa(double tamanhoDaAsa) {
		this.tamanhoDaAsa = tamanhoDaAsa;
	}

	public String getTipoDoBico() {
		return tipoDoBico;
	}

	public void setTipoDoBico(String tipoDoBico) {
		this.tipoDoBico = tipoDoBico;
	}

}
