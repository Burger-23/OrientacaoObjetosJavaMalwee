package br.com.burger;

public class ProgramaPrincipal {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();

		pessoa1.setNome("Gabriel");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("Masculino");
		
		pessoa2.setNome("Victor");
		pessoa2.setAnoDeNascimento(2004);
		pessoa2.setSexo("Masculino");
		
		pessoa3.setNome("Carlos");
		pessoa3.setAnoDeNascimento(2001);
		pessoa3.setSexo("Masculino");
		
		pessoa4.setNome("Marlon");
		pessoa4.setAnoDeNascimento(2004);
		pessoa4.setSexo("Masculino");
		
		
		System.out.println("----------");
		System.out.println("|1º Aluno|");
		System.out.println("----------");
		System.out.println(pessoa1.getNome()); 
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());
		
		System.out.print("\n");
		
		System.out.println("----------");
		System.out.println("|2º Aluno|");
		System.out.println("----------");
		System.out.println(pessoa2.getNome()); 
		System.out.println(pessoa2.getAnoDeNascimento());
		System.out.println(pessoa2.getSexo());
		
		System.out.print("\n");

		System.out.println("----------");
		System.out.println("|3º Aluno|");
		System.out.println("----------");
		System.out.println(pessoa3.getNome()); 
		System.out.println(pessoa3.getAnoDeNascimento());
		System.out.println(pessoa3.getSexo());
		
		System.out.print("\n");
		
		System.out.println("----------");
		System.out.println("|4º Aluno|");
		System.out.println("----------");
		System.out.println(pessoa4.getNome()); 
		System.out.println(pessoa4.getAnoDeNascimento());
		System.out.println(pessoa4.getSexo());

		
		
		
		
	}
}
