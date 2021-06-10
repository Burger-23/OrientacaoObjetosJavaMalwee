package br.com.burger.pessoa;

public class Endereco extends Cidade{

	//ATRIBUTOS\\
	private String NomeRua;
	private int Numero;
	private String Bairro;
	private String Complemento;
	
	//MÉTODOS\\
	public String getNomeRua() {
		return NomeRua;
	}
	public void setNomeRua(String nomeRua) {
		NomeRua = nomeRua;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getComplemento() {
		return Complemento;
	}
	public void setComplemento(String complemento) {
		Complemento = complemento;
	}
	

}