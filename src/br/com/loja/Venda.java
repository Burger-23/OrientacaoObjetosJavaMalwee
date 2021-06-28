package br.com.loja;

import br.com.pessoa.Pessoa;
import br.com.produto.Produto;

//CLASSE
public class Venda {

	//ATRIBUTOS
	private Pessoa pessoa;
	private Produto produto;
	private int quantidade;
	private double valor;

	//MÉTODOS
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
