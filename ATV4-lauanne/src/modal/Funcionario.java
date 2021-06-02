package modal;

public class Funcionario extends Pessoa {

	protected double salario;
	protected String cargo;

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

	public Funcionario(String nome, String cpf, int idade, double salario, String cargo) {
		super(nome, cpf, idade);
		this.cargo = cargo;
		this.salario = salario;
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;

	}

	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", cargo=" + cargo + "]";
	}
	
	

}
