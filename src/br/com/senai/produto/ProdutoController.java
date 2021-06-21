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
		produto.setNomeDoProduto(tec.next());
		
		System.out.print("Informe a Quantidade:  ");
		produto.setQuantidadeProduto(tec.nextInt());
		
		System.out.print("Informe o Valor Unitário do Produto: ");
		produto.setValorUntProd(tec.nextDouble());
		
		produto.setValorTotalProd(produto.getValorUntProd()*produto.getQuantidadeProduto());
		
		return produto;
	
	}


	public List<Produto> listarProdutos(List<Produto> produtos) {
		
		if(produtos.isEmpty()) {
			System.out.println("\n");
			System.out.println("Você não possui produtos cadastrados.");
			return null;
		}
		
		System.out.println("\n");
		System.out.println("---PRODUTOS--CADASTRADOS---");
		System.out.printf("| %2s | %20s | %20s | %23s | %23s |\n", 
				"Id", "Nome do Produto", "Quantidade", "Valor Unitário", "Valor Total");			
		for(int i = 0; i < produtos.size(); i++) {
			
		System.out.printf("| %2s | %20s | %20s | R$ %20s | R$ %20s |\n",
					i + 1,
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getQuantidadeProduto(),
					produtos.get(i).getValorUntProd(),
					produtos.get(i).getValorTotalProd());
					
		}
		return produtos;

	}
	
	public List<Produto> editarProduto(List<Produto> produtos) {
		
		
		Produto produto = new Produto();
		listarProdutos(produtos); 
		
		if(produtos.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id do Produto: ");
		int idProduto = tec.nextInt() -1;
		
		System.out.println("\n");
		System.out.println(" 1 -> Nome do Produto          ");
		System.out.println(" 2 -> Quantidade do Produto    ");
		System.out.println(" 3 -> Valor Unitário do Produto");
		System.out.print("Informe o Campo a ser Editado: ");
		
		int opcao = tec.nextInt();
		
		switch (opcao) {
		
		case 1:
			System.out.println("---EDITAR--NOME--DOS--PRODUTOS---");
			System.out.print("Informe o nome do Produto: ");
			produto.setNomeDoProduto(tec.next());
			
			produto.setQuantidadeProduto(produtos.get(idProduto).getQuantidadeProduto());
			produto.setValorUntProd(produtos.get(idProduto).getValorUntProd());
			produto.setValorTotalProd(produtos.get(idProduto).getValorTotalProd());
			
			produtos.set(idProduto, produto);
			
			break;
			
		case 2:
			System.out.println("---EDITAR--QUANTIDADE--DOS--PRODUTOS---");
			System.out.print("Informe a Quantidade: ");
			produto.setQuantidadeProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorTotalProd(produtos.get(idProduto).getValorTotalProd());
			produto.setValorUntProd(produtos.get(idProduto).getValorUntProd());
			
			produto.setValorTotalProd(produto.getValorUntProd()*produto.getQuantidadeProduto());
			produtos.set(idProduto, produto);
			
			
			break;

			
		case 3:
			System.out.println("---EDITAR--O--VALOR--UNITÁRIO--DOS--PRODUTOS---");
			System.out.print("Informe o Valor Unitário: ");
			produto.setValorUntProd(tec.nextDouble());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorTotalProd(produtos.get(idProduto).getValorTotalProd());
			produto.setQuantidadeProduto(produtos.get(idProduto).getQuantidadeProduto());
			
			produto.setValorTotalProd(produto.getValorUntProd()*produto.getQuantidadeProduto());
			produtos.set(idProduto, produto);
			
			
			
			break;

			
		default:
			System.out.println("Opção Inváida!");
			break;
		}
		
		return produtos;
	}
	
	public void excluirProduto(List<Produto> produtos) {
		
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return;
		}
		System.out.println("\n");
		System.out.println("---EXCLUIR--PRODUTOS---");
		
		System.out.print("Informe o ID que deseja excluir: ");
		int idProduto = tec.nextInt() -1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto não encontrado!");
			return;
		}

		produtos.remove(idProduto);
		
	}

}