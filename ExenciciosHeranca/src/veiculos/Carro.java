package veiculos;

public class Carro extends Veiculo {
	private int quantidadePortas;
	private String tracao;

	public Carro(String marca, String modelo, int ano, int quantidadePortas, String tracao) {
		super(marca, modelo, ano);
		this.quantidadePortas = quantidadePortas;
		this.tracao = tracao;

	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	
}
