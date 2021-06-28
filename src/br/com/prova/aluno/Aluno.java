package br.com.prova.aluno;

import br.com.prova.endereco.Cidade;

public class Aluno extends Cidade {
	
	private String NomeDoAluno;
	private String IdadeDoAluno;
	
	
	public String getNomeDoAluno() {
		return NomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		NomeDoAluno = nomeDoAluno;
	}
	public String getIdadeDoAluno() {
		return IdadeDoAluno;
	}
	public void setIdadeDoAluno(String idadeDoAluno) {
		IdadeDoAluno = idadeDoAluno;
	}
	
	

}
