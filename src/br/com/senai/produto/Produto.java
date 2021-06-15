package br.com.senai.produto;


public class Produto {
	
		//ATRIBUTOS\\
		private String nomeDoProduto;
		private double valorUntProd;
		private int quantidadeProduto;
		private double valorTotalProd;

		//CONSTRUTOR\\
		public Produto() {
		}

		public Produto(String nomeDoProduto, double valorUntProd, int quantidadeProduto, double valorTotalProd) {
			super();
			this.nomeDoProduto = nomeDoProduto;
			this.valorUntProd = valorUntProd;
			this.quantidadeProduto = quantidadeProduto;
			this.valorTotalProd = valorTotalProd;
		}

		//METODOS\\
		public String getNomeDoProduto() {
			return nomeDoProduto;
		}

		public void setNomeDoProduto(String nomeDoProduto) {
			this.nomeDoProduto = nomeDoProduto;
		}

		public double getValorUntProd() {
			return valorUntProd;
		}

		public void setValorUntProd(double valorUntProd) {
			this.valorUntProd = valorUntProd;
		}

		public int getQuantidadeProduto() {
			return quantidadeProduto;
		}

		public void setQuantidadeProduto(int quantidadeProduto) {
			this.quantidadeProduto = quantidadeProduto;
		}

		public double getValorTotalProd() {
			return valorTotalProd;
		}

		public void setValorTotalProd(double valorTotalProd) {
			this.valorTotalProd = valorTotalProd;
		}

		public static int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
		
}
