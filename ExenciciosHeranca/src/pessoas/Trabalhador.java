package pessoas;

public class Trabalhador extends pessoa {
	private double salario;
	private String cargo;

	public Trabalhador(String nome, int idade, double tamanho, String etinia, double salario, String cargo) {
		super(nome, idade, tamanho, etinia);
		this.salario = salario;
		this.cargo = cargo;
	}

	// Método para exibir o cargo do trabalhador
	public void ExibirCargo() {
		System.out.println("Esse trabalhador trabalha como " + cargo);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
