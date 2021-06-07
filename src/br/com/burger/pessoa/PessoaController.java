package br.com.burger.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {
	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);
	}
	
	public int lerOpcao() {
		System.out.print("Informe a opção desejada: ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("\n");
		System.out.println("|----------------MENU----------------|");
		System.out.println("|1 -> CADASTRAR PESSOAS              |");
		System.out.println("|2 -> LISTAR PESSOAS CADASTRADAS     |");
		System.out.println("|0 -> SAIR DO SISTEMA                |");
		System.out.println("|------------------------------------|");
		System.out.print("\n");
	
	}
	
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("---CADASTRAR--PESSOA---");
		System.out.print("Informe seu nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe sua altura: ");
		pessoa.setAltura(tec.nextDouble());
		System.out.println("\n");
		
	
		return pessoa;
		
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("\n");
		System.out.println("---PESSOAS--CADASTRADAS---");
		
		System.out.printf ("| %15s | %4s | %5s | %6s |\n", "Nome", "Ano", "Idade", "Altura");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %15s | %4d | %5d | %6.2f |\n", 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura());
		}
		
		return pessoas;
	}
 	
}
