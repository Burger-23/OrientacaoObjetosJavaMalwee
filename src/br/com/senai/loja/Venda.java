package br.com.senai.loja;

import br.com.burger.pessoa.Pessoa;
import br.com.senai.produto.Produto;

public class Venda {

	//ATRIBUTOS\\
	private Pessoa pessoa;
	private Produto produto;
	private int Qtnd;
	private double valor;
	
	//METODOS\\
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
	public int getQtnd() {
		return Qtnd;
	}
	public void setQtnd(int qtnd) {
		Qtnd = qtnd;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	
}
