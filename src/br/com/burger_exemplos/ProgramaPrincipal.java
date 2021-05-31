package br.com.burger_exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		List<Pessoa> listapessoa = new ArrayList<Pessoa>();
		
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
		
		listapessoa.add(pessoa1);
		listapessoa.add(pessoa2);
		listapessoa.add(pessoa3);
		listapessoa.add(pessoa4);
		
			System.out.println("---PESSOAS--COM--FOREACH---");
			for(Pessoa people : listapessoa) {
			System.out.println(people);
			System.out.println("---------------------------");
			}
			
			System.out.println("---PESSOAS--COM-FOREACH--LAMBDA");
			listapessoa.forEach(Pessoa -> {
				System.out.println(Pessoa.getNome());
				System.out.println(Pessoa.getSexo());
				System.out.println(Pessoa.getAnoDeNascimento());
				System.out.println("---------------------------------");
				
				
			});
				
			Scanner tec = new Scanner(System.in);
			System.out.println("---TABUADA---");
			MetodoController metodoController = new MetodoController();
			metodoController.multiplicar();
			System.out.println("-------------");

			
			System.out.println("\n");
			
			System.out.println("---SOMA--DE--DOIS--VALORES---");
			System.out.println("A soma dá: " + metodoController.somar());
			System.out.println("-----------------------------");

			
			System.out.println("\n");
			
			System.out.println("---SUBTRAÇÃO--DE--VALORES---");
			System.out.print("Infrome o primeiro valor: ");
			int valor1 = tec.nextInt();
			System.out.print("Informe o segundo valor: ");
			int valor2 = tec.nextInt();
			
			System.out.println("A subtração dá: " + metodoController.subtrair(valor1, valor2));
			System.out.println("----------------------------");

						
	}
}