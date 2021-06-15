package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {
	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	

	public int lerOpcao() {
		System.out.print("Informe a Opção Desejada: ");
		return tec.nextInt();
		
	}

	public void menu() {
		
	}
	
	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		
		System.out.println("\n");
		System.out.println("---CADASTRAR--PRODUTOS---");
		System.out.println("\n");

		System.out.print("Informe o Nome do Produto: ");
		produto.setNomeDoProduto(tec.nextLine());
		System.out.print("Informe a Quantidade:  ");
		produto.setQuantidadeProduto(tec.nextInt());
		
		System.out.print("Informe o Valor Unitário do Produto: ");
		produto.setValorUntProd(tec.nextDouble());
		
		produto.setValorTotalProd(produto.getValorUntProd()*produto.getQuantidadeProduto());
		
		return produto;
	
	}


	public List<Produto> listarProdutos(List<Produto> produtos) {
		System.out.println("\n");
		System.out.println("---PRODUTOS--CADASTRADOS---");
		System.out.println("\n");

		System.out.printf("| %12s | %6s | %6s |\n", "Nome do Produto", "Quantidade", "Valor Unitário");
			
		for(int i = 0; i < produtos.size(); i++) {
			
			System.out.printf("| %12s | %6d | %6,2f |\n ",
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getQuantidadeProduto(),
					produtos.get(i).getValorUntProd());
					
		}
		return produtos;

	}
	

}
