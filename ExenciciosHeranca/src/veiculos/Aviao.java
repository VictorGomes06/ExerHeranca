package veiculos;

public class Aviao extends Veiculo {
	private int quantidadeDeAssentos;
	private double tamanhaDaAsa;
	private int quantidadeDeTurbinas;

	public Aviao(String marca, String modelo, int ano, int quantidadeDeAssentos, double tamanhaDaAsa,
			int quantidadeDeTurbinas) {
		super(marca, modelo, ano);
		this.quantidadeDeAssentos = quantidadeDeAssentos;
		this.tamanhaDaAsa = tamanhaDaAsa;
		this.quantidadeDeTurbinas = quantidadeDeTurbinas;
	}

	public int getQuantidadeDeAssentos() {
		return quantidadeDeAssentos;
	}

	public void setQuantidadeDeAssentos(int quantidadeDeAssentos) {
		this.quantidadeDeAssentos = quantidadeDeAssentos;
	}

	public double getTamanhaDaAsa() {
		return tamanhaDaAsa;
	}

	public void setTamanhaDaAsa(double tamanhaDaAsa) {
		this.tamanhaDaAsa = tamanhaDaAsa;
	}

	public int getQuantidadeDeTurbinas() {
		return quantidadeDeTurbinas;
	}

	public void setQuantidadeDeTurbinas(int quantidadeDeTurbinas) {
		this.quantidadeDeTurbinas = quantidadeDeTurbinas;
	}

}
