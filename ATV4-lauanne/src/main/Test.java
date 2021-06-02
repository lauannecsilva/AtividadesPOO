package main;

import modal.Gerente;
import modal.Vendas;
import modal.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Paulo Henrique", "844.367.167-41",31, 3500, "Gerente", 0.10, 0 );
		Vendedor vendedor = new Vendedor("Laura Silva", "278.984.364-65",27, 1400, "Vendedor",0, 0.06,0, gerente );
		
		
		List<Vendas> vendas = new ArrayList<>();//lista de vendas do vendedor
		List<Vendedor> vendedores = new ArrayList<>();// lista de vendedores do gerente
		
		vendedores.add(vendedor);//adicionando um vendedor a lista de vendedores do gerente
		
		gerente.setVendedores(vendedores);//Associando um vendedor a um gerente

		Vendas primeiraVenda = new Vendas(100);
		Vendas segundaVenda = new Vendas(490);
		Vendas terceiraVenda = new Vendas(800);
		Vendas quartaVenda = new Vendas(1000);
		
		vendas.add(primeiraVenda);
		vendas.add(segundaVenda);
		vendas.add(terceiraVenda);
		vendas.add(quartaVenda);
		
		vendedor.setVendas(vendas);//lista de vendas do vendedor
		
		vendedor.getTotalVendas();//chamando o metodo que calcula o total de vendas
		vendedor.getTotalComissaoVendedor();//chamando o metodo que calcula o total de comissao de vendas do vendedor
		gerente.getComissaoTotal();//chamando o metodo que calcula o total de comissao do gerente
	
	
		System.out.println();
		System.out.println(vendedor.getNome()+ " " + vendedor.getTotalVendas()+ " " + vendedor.getSalario());
		System.out.println();
		System.out.println(gerente.getNome()+ " " + gerente.getSalario());
		
	}

}
