package br.com.burger;

import java.util.ArrayList;
import java.util.List;

import br.com.burger.pessoa.Pessoa;
import br.com.burger.pessoa.PessoaController;
import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();
		
		boolean sair = false;
		
		do {
			
			pessoaController.menu();
			produtoController.menu();
			
			int opcao = pessoaController.lerOpcao();
			
			
			switch(opcao){
			
				case 1:
					pessoas.add(pessoaController.cadastrarPessoa());
					break;
					
				case 2:
					pessoaController.listarPessoas(pessoas);
					break;
					
				case 3: 
					pessoaController.editarPessoas(pessoas);
					break;
					
				case 4:
					pessoaController.excluirPessoa(pessoas);
					break;
					
				case 5:
					produtos.add(produtoController.cadastrarProduto());
					break;
					
				case 6:
					produtoController.listarProdutos(produtos);
					break;
					
				case 7:
					produtoController.editarProduto(produtos);
					break;
					
				case 8: 
					produtoController.excluirProduto(produtos);
					break;
				
					
				case 9:
					vendaController.listarVenda(vendas);
					break;
					
				case 10:
					vendas.add(vendaController.cadastrarVenda(produtos, pessoas));
					break;
					
				case 0:
					sair = true;
					break;
					
				default:
				System.out.println("Opção Inválida!");
				break;
			
					
			}
			
		}while(!sair);
		
		System.out.print("\n");
		System.out.println("Sistema Finalizado!");
		System.out.println("Programa By: Burger :)");
	}
}