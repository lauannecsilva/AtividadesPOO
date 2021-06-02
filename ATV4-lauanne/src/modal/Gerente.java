package modal;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario {

	List<Vendedor> vendedores = new ArrayList<>();
	protected double comissaoGerente;
	protected double comissaoTotal;

	public List<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(List<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public double getComissaoGerente() {
		return comissaoGerente;
	}

	public void setComissaoGerente(double comissaoGerente) {
		this.comissaoGerente = comissaoGerente;
	}

	//o for vai pecorrer pela lista de vendedores
	//size serve para ver o tamanho da lista
	public double getComissaoTotal() {
		for(int i = 0; i < vendedores.size(); i++) {
			comissaoTotal += vendedores.get(i).totalVendas * comissaoGerente;
		}
		return comissaoTotal;
	}

	public void setComissaoTotal(double comissaoTotal) {
		this.comissaoTotal = comissaoTotal;
	}

	public Gerente(String nome, String cpf, int idade, double salario, String cargo, double comissaoGerente, double comissaoTotal) {
		super(nome, cpf, idade, salario, cargo);
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.cargo = cargo;
		this.comissaoGerente = comissaoGerente;
		this.comissaoTotal = comissaoTotal;
		this.salario = salario;
	}
	
	// override é para sobreescrever um metodo
	@Override
	public double getSalario() {
		salario += comissaoTotal;
		return salario;
	}
	

	@Override
	public String toString() {
		return "Gerente [vendedores=" + vendedores + ", comissaoGerente=" + comissaoGerente + ", comissaoTotal="
				+ comissaoTotal + "]";
	}
	
	

}
