package br.com.burger.pessoa;

public class Estado extends Pais {
	
	//ATRIBUTOS\\
	private String NomeEstado;
	private String UF;

	//MÉTODOS\\
	public String getNomeEstado() {
		return NomeEstado;
	}
	public void setNomeEstado(String nomeEstado) {
		NomeEstado = nomeEstado;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	

}
