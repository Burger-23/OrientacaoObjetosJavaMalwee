package br.com.burger_exemplos;

public class Pessoa {
	
	//ATRIBUTOS\\
	private String nome;
	private int anoDeNascimento;
	private String sexo;
	
	//METODOS\\
		public String getNome() {
			return nome; 
		}
	    
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getSexo() {
			return sexo;
		}
		
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		
		public int getAnoDeNascimento() {
			return anoDeNascimento;
		}
		
		public void setAnoDeNascimento(int anoDeNascimento) {
			this.anoDeNascimento = anoDeNascimento;
			
		}

		@Override
		public String toString() {
			return "Nome: " + nome + " \nAno De Nascimento: " + anoDeNascimento + " \nSexo: " + sexo ;
		}

	
			
		}