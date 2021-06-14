package br.com.senai.produto;


public class Produto {
	
		//ATRIBUTOS\\
		private String nomeDoProduto;
		private int valorDoProduto;
		private double valortotaldoproduto;
		private double valorUntProd;
		
		//CONSTRUTOR\\
		public Produto() {
		}
		
			
		public Produto(String nomeDoProduto, int valorDoProduto, double valortotaldoproduto, double valorUntProd) {
			super();
			this.nomeDoProduto = nomeDoProduto;
			this.valorDoProduto = valorDoProduto;
			this.valortotaldoproduto = valortotaldoproduto;
			this.valorUntProd = valorUntProd;
		}

		//METODOS\\
		public String getNomeDoProduto() {
			return nomeDoProduto;
		}
		public void setNomeDoProduto(String nomeDoProduto) {
			this.nomeDoProduto = nomeDoProduto;
		}
		public double getValorDoProduto() {
			return valorDoProduto;
		}
		public void setValorDoProduto(int valorDoProduto) {
			this.valorDoProduto = valorDoProduto;
		}
		public double getValortotaldoproduto() {
			return valortotaldoproduto;
		}
		public void setValortotaldoproduto(double valortotaldoproduto) {
			this.valortotaldoproduto = valortotaldoproduto;
		}
		public int getValorUntProd() {
			return (int) valorUntProd;
		}
		public void setValorUntProd(int valorUntProd) {
			this.valorUntProd = valorUntProd;
		}
		
		
		
}
