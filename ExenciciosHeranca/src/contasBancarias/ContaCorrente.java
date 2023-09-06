package contasBancarias;

public class ContaCorrente extends ContaBancaria {
	private double taxaManutencao;

	public ContaCorrente(String titular, double saldo, double taxaManutencao) {
		super(titular, saldo);
		this.taxaManutencao = taxaManutencao;
	}

	// Método de taxa de manutenção
	public void taxaManutencao() {
		Sacar(taxaManutencao);
		System.out.println("Taxa de manutenção no valor de R$ " + taxaManutencao + " cobrada");
	}

}
