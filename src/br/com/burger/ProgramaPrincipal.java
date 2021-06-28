package br.com.burger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.loja.Venda;
import br.com.loja.VendaController;
import br.com.pessoa.Pessoa;
import br.com.pessoa.PessoaController;
import br.com.produto.Produto;
import br.com.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();

		Produto produto = new Produto ("Abacate",2.5,35,2.5*35);
		
		produtos.add(produto);
				
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();

		boolean sair = false;

		do {
				System.out.print("\n");
				System.out.println("|-------------- MENU ---------------|");
				System.out.println("|1 -> MENU PESSOAS                  |");
				System.out.println("|2 -> MENU PRODUTOS                 |");
				System.out.println("|3 -> MENU VENDAS                   |");
				System.out.println("|0 -> SAIR                          |");
				System.out.println("|-----------------------------------|");
				System.out.print("Informe a Opção Desejada -> ");
				
				int opcao= tec.nextInt();
			switch (opcao) {
			
			case 1:
				pessoaController.menu(pessoas);
				break;
				
			case 2:
				produtoController.menu(produtos);
				break;
			case 3:
				vendaController.menu(produtos, pessoas);
				break;
			case 0:
				sair = true;
				
				break;

			default:
				System.out.println("\n");
				System.out.println("Opção Inválida!!");
				
				break;

			}
		} while (!sair);

		System.out.println("\n");
		System.out.println("Sistema Finalizado!!!");
	}
}