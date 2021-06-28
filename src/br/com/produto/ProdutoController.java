package br.com.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("Informe a Opção Desejada -> ");
		return tec.nextInt();
	}

	public void menu(List<Produto>produtos) {
		System.out.print("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> CADASTRAR PRODUTOS            |");
		System.out.println("|2 -> LISTAR PRODUTOS               |");
		System.out.println("|3 -> EDITAR PRODUTO                |");
		System.out.println("|4 -> EXCLUIR PRODUTO               |");
		System.out.println("|-----------------------------------|");
		System.out.print("Informe a Opção Desejada -> ");

		int opcao = tec.nextInt();
		switch(opcao) {
		
		case 1:
			produtos.add(cadastrarProduto());
			break;
		
		case 2:
			listarProdutos(produtos);
			break;
		
		case 3:
			editarProduto(produtos);
			break;
			
		case 4:
			excluirProduto(produtos);
			break;
		
		default:
			break;
		
		
		}
	}

	public Produto cadastrarProduto() {
		Produto produto = new Produto();
		System.out.println("\n");
		System.out.println("---CADASTRAR--PRODUTOS---");

		System.out.print("Informe o nome do produto: ");
		produto.setNomeDoProduto(tec.next());

		System.out.print("Informe o valor unitário do produto: R$ ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.print("Informe a quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto()*produto.getQuantidadeDoProduto());
		
		System.out.println("\n");

		return produto;
	}

	public List<Produto> listarProdutos(List<Produto> produtos){
		
		if (produtos.isEmpty()) {
			System.out.println("\n");
			System.out.println("Não tem produtos cadastrados");
			System.out.println("\n");
			return null;
		}
		
		System.out.println("\n");
		System.out.println("----------------- PRODUTOS CADASTRADOS ---------------");
		System.out.println("\n");
		
		System.out.printf("| %2s | %10s | %10s | %13s | %11s | \n" ,
				"ID" , "Produto" , "Valor Unitário" , "Quantidade" , "Total");
		
		for(int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %10s | R$ %11s | %13d | R$ %8.2f | \n" , 
					i + 1,
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		System.out.println("\n");
		
		return produtos;
	}
	
	public List<Produto> editarProduto(List<Produto> produtos) {
		
		Produto produto = new Produto();
		listarProdutos(produtos);
		
		
		if(produtos.isEmpty()) {
			System.out.println("\n");
			System.out.println("Não tem pessoas cadastrados");
			System.out.println("\n");
			return null;
		}
		
		
		
		System.out.print("Informe o ID do produto para editar -> ");
		int idProduto = tec.nextInt() - 1;
		System.out.println("\n");
		
		System.out.println("|--------------------------------|");
		System.out.println("|1 -> NOME DO PRODUTO            |");
		System.out.println("|2 -> VALOR UNITÁRIO DO PRODUTO  |");
		System.out.println("|3 -> QUANTIDADE                 |");
		System.out.println("|--------------------------------|");
		System.out.println("\n");
		System.out.print("Informe o campo que deseja editar -> ");
		int opcao = tec.nextInt();
		System.out.println("\n");
		
		switch (opcao) {
		
		case 1:
			System.out.println("---EDITAR--NOME--DO--PRODUTO---");
			System.out.println("\n");
			System.out.print("Informe novamente  o novo do produto -> ");
			produto.setNomeDoProduto(tec.next());
			
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
			
			produtos.set(idProduto, produto);
			
			System.out.println("\n");
			break;
			
		case 2:
			System.out.println("---EDITAR--VALOR--UNITÁRIO---");
			System.out.println("\n");
			System.out.print("Informe novamente o valor unitário do produto -> R$ ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto()*produto.getQuantidadeDoProduto());

			produtos.set(idProduto, produto);
			
			System.out.println("\n");
			break;
			
		case 3:
			System.out.println("---EDITAR--QUANTIDADE---");
			System.out.println("\n");
			System.out.print("Informe novamente a quantidade do produto -> ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto()*produto.getQuantidadeDoProduto());
			
			produtos.set(idProduto, produto);
			
			System.out.println("\n");
			break;

		default:
			System.out.println("Opção Inválida!!!!");
			break;
		}
		
		return produtos;
	}
	
	public void excluirProduto(List<Produto> produtos) {
		
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return;
		}
		
		System.out.println("---EXCLUIR--PRODUTO---");
		
		System.out.println("Informe o Id do produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto não cadastrado");
			return;
		}
		
		produtos.remove(idProduto);
		
		
	}
	
}