package contasBancarias;

public class ContaPoupanca extends ContaBancaria {
	private double juros;

	public ContaPoupanca(String titular, double saldo, double juros) {
		super(titular, saldo);
		this.juros = juros;
	}
	
	//Método de calcular juros
	public void CalculoDejuros() {
		double taxajuros = getSaldo() * (juros / 100);
		Depositar(taxajuros);
	}
}
