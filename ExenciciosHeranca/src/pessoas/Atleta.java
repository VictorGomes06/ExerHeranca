package pessoas;

public class Atleta extends pessoa {
	private String esporte;
	private String equipe;

	public Atleta(String nome, int idade, double tamanho, String etinia, String esporte, String equipe) {
		super(nome, idade, tamanho, etinia);
		this.esporte = esporte;
		this.equipe = equipe;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

}
