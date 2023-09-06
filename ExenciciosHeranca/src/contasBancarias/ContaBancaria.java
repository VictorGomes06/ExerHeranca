package contasBancarias;

public class ContaBancaria {
	protected String titular;
	protected double saldo;

	public ContaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	// Método de depóstito
	public void Depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " Realizado com sucesso ");
		} else {
			System.out.println("Valor do depósito inválido");
		}
	}

	// Método de saque
	public void Sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque no valolr de R$" + valor + " Realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	// Método para consultar saldo
	public void ConsultarSaldo() {
		System.out.println("Saldo da conta R$ : " + saldo);
	}
}
