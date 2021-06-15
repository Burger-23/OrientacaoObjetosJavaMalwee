package br.com.burger;

import java.util.ArrayList;
import java.util.List;

import br.com.burger.pessoa.Pessoa;
import br.com.burger.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		
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
					produtos.add(produtoController.cadastrarProduto());
					break;
					
				case 4:
					produtoController.listarProdutos(produtos);
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

	}
}