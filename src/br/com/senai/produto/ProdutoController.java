package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {
	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	

	public int lerOpcao1() {
		System.out.println("Informe a Opção Desejada: ");
		return tec.nextInt();
		
	}

	public void menu() {
		
	System.out.println("\n");
	System.out.println("|----------------MENU----------------|");
	System.out.println("|3 -> CADASTRAR PRODUTOS             |");
	System.out.println("|4 -> LISTAR PRODUTOS CADASTRADOS    |");
	System.out.println("|0 -> SAIR DO SISTEMA                |");
	System.out.println("|------------------------------------|");
	System.out.print("\n");
		
	}
	
	public Produto cadastrarProduto() {
		Produto produto = new produto();
		
		System.out.println("---CADASTRAR--PRODUTOS---");
		System.out.println("Informe o Nome do Produto: ");
		tec.nextLine();
		produto.setValorDoProduto(tec.next());
		
		System.out.println("Informe a Quantidade:  ");
		produto.setNomeDoProduto(tec.nextInt());
		
		System.out.println("Informe o Valor Unitário do Produto: ");
		produto.setValorUntProd(tec.nextInt());
		
		return produto;
	
	}


	public void listarProdutos(List<Produto> produtos) {
	
		
	}
	

}
