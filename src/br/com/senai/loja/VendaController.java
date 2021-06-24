package br.com.senai.loja;

import java.util.List;
import java.util.Scanner;

import br.com.burger.pessoa.Pessoa;
import br.com.burger.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class VendaController {
	private Scanner tec;
	private ProdutoController produtoController;
	private PessoaController pessoaController;
	
	public VendaController() {
		tec = new Scanner (System.in);
		produtoController = new ProdutoController();
		pessoaController = new PessoaController();
	}

	public int LerOpcao() {
		
		System.out.print("> ");
		return tec.nextInt();
	}
		
		public int lerOpcao() {
			System.out.print("Informe a Opção Desejada: ");
			return tec.nextInt();
			
	}
		
	public void menu() {
		
		System.out.println("\n");
		System.out.println("|----------------MENU-----------------|");
		System.out.println("|01 -> CADASTRAR VENDAs               |");
		System.out.println("|02 -> LISTAR VENDAS                  |");
		System.out.println("|-------------------------------------|");
		System.out.print("\n");
		
	}
	
	public List<Venda> listarVenda(List<Venda> vendas) { 
	
		System.out.println("---VENDAS--REALIZADAS---");
		
		System.out.printf("| %20s | %20s | %20s | %20s |\n", 
				"Cliente", "Produto", "Quantidade", "Valor" );
						
		for (int i = 0; i < vendas.size(); i++) {
			
			System.out.printf("| %20s | %20s | %20s | %20s |\n",
					vendas.get(i).getPessoa().getNome(),
					vendas.get(i).getProduto().getNomeDoProduto(),
					vendas.get(i).getQtnd(),
					vendas.get(i).getValor()
			);
		}
		
		return vendas;
	}
	
	public Venda cadastrarVenda (List<Produto> produtos, List<Pessoa> pessoas) {
		
		if(produtos.isEmpty() || pessoas.isEmpty()) {
			System.out.println("\n");
			System.out.println("Você não possui nenhum cadastro.");
			return null;
		}
			
		produtoController.listarProdutos(produtos);
		pessoaController.listarPessoas(pessoas);
		
		
		Venda venda = new Venda();
		Produto produto = new Produto();
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Informe o ID da Pessoa: ");
		int idPessoa = tec.nextInt() - 1;
		
		pessoa.setNome(pessoas.get(idPessoa).getNome());
		pessoa.setAltura(pessoas.get(idPessoa).getAltura());
		pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
		
		
		venda.setPessoa(pessoa);
		
		System.out.print("Informe o ID do produto: ");
		int idProduto = tec.nextInt() - 1;
		
		produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
		produto.setQuantidadeProduto(produtos.get(idProduto).getQuantidadeProduto());
		produto.setValorUntProd(produtos.get(idProduto).getValorUntProd());
		produto.setValorTotalProd(produtos.get(idProduto).getValorTotalProd());
		
		venda.setProduto(produto);
		
		System.out.print("Informe a quantidade desejada: ");
		venda.setQtnd(tec.nextInt());
		
		venda.setValor(produto.getValorUntProd()* venda.getQtnd());

		
		return venda;
	}
	

}