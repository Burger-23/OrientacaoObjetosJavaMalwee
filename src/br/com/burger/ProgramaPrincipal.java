package br.com.burger;

import java.util.ArrayList;
import java.util.List;

import br.com.burger.pessoa.Pessoa;
import br.com.burger.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto = new Produto(
				"Abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);
		
		Pessoa pessoa = new Pessoa(
				"Gabriel",
				2004,
				1.75,
				"Brasil",
				"BR",
				"Santa Catarina",
				"SC",
				"Jaraguá do Sul",
				"Pastor H Willians",
				"Jaraguá 99",
				35,
				"Casa"
				);
		pessoas.add(pessoa);
				
		
		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		
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
				
				case 0:
					sair = true;
					break;
					
				default:
				System.out.println("Opção Inválida!");
				break;
			
					
			}
			
		}while(!sair);
		
		
		System.out.println("Sistema Finalizado!");
		System.out.println("Programa By: Burger :)");
	}
}