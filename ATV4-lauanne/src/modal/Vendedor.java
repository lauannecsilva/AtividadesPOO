package modal;

import java.util.List;
import java.util.ArrayList;


public class Vendedor extends Funcionario{

	private Gerente gerente;
	protected List<Vendas> vendas = new ArrayList<>();
	protected double totalVendas;
	protected double comissaoVendedor;
	protected double totalComissaoVendedor;
	
	
	
	
	
	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Vendas> getVendas() {
		return vendas;
	}


	public void setVendas(List<Vendas> vendas) {
		this.vendas = vendas;
	}

	public double getTotalVendas() {
		for(int i=0; i< vendas.size(); i++) {
			totalVendas += vendas.get(i).valorVenda;
		}
		return totalVendas;
	}


	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}


	public double getComissaoVendedor() {
		return comissaoVendedor;
	}


	public void setComissaoVendedor(double comissaoVendedor) {
		this.comissaoVendedor = comissaoVendedor;
	}

	public double getTotalComissaoVendedor() {
		totalComissaoVendedor = totalVendas * comissaoVendedor;
		return totalComissaoVendedor;
	}

	public void setTotalComissaoVendedor(double totalComissaoVendedor) {
		this.totalComissaoVendedor = totalComissaoVendedor;
	}

	@Override
	public double getSalario() {
		salario += totalComissaoVendedor;
		return salario;
	}

	public Vendedor(String nome, String cpf, int idade, double salario, String cargo, double totalVendas, double comissaoVendedor, double totalComissaoVendedor, Gerente gerente) {
		super(nome, cpf, idade, salario, cargo);
		this.idade = idade;
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
		this.gerente = gerente;
		this.totalVendas = totalVendas;
		this.comissaoVendedor = comissaoVendedor;
		this.totalComissaoVendedor = totalComissaoVendedor;
	}

}
