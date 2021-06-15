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
		System.out.println("|3 -> CADASTRAR PRODUTOS             |");
		System.out.println("|4 -> LISTAR PRODUTOS CADASTRADOS    |");
		System.out.println("|0 -> SAIR DO SISTEMA                |");
		System.out.println("|------------------------------------|");
		System.out.print("\n");
	
	}
	
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		
		System.out.println("\n");
		System.out.println("---CADASTRAR--PESSOA---");
		System.out.println("\n");
		System.out.print("Informe seu nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.print("Informe sua altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o Pais: ");
		tec.nextLine();
		pessoa.setNomePais(tec.nextLine());
		
		System.out.print("Informe a sigla do Pais: ");
		pessoa.setSigla(tec.nextLine());
		
		System.out.print("Informe o nome do seu Estado: ");
		pessoa.setNomeEstado(tec.nextLine());
		
		System.out.print("Informe a sigla do seu Estado: ");
		pessoa.setUF(tec.nextLine());
		
		System.out.print("Informe o nome da sua Cidade: ");
		pessoa.setNomeCd(tec.nextLine());
		
		System.out.print("Informe o nome da Rua: ");
		pessoa.setNomeRua(tec.nextLine());
		
		System.out.print("Informe o Bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Informe o número da casa: ");
		pessoa.setNumero(tec.nextInt());
		
		System.out.print("Informe o Complemento: ");
		tec.nextLine();
		pessoa.setComplemento(tec.nextLine());

		return pessoa;
		
	}
	
	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("\n");
		System.out.println("-----------PESSOAS---CADASTRADAS-----------");
		System.out.println("\n");

		
		System.out.printf ("| %15s | %4s | %5s | %6s | %11s| %4s | %4s | %23s | %30s | %30s | %4s | %30s |\n", "Nome", "Ano De Nascimento", "Idade", "Altura", "Pais", "Sigla do Pais", "Nome do Estado", "Sigla do Estado",
				"Nome da Cidade", "Nome da Rua", "Bairro", "Número da Casa", "Complemento");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %15s | %4d | %5d | %6.2f | %10s | %4s | %15s | %4s | %23s | %30s | %30s | %4s | %30s |\n", 
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomePais(),
					pessoas.get(i).getSigla(),
					pessoas.get(i).getNomeEstado(),
					pessoas.get(i).getUF(),
					pessoas.get(i).getNomeCd(),
					pessoas.get(i).getNomeRua(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getNumero(),
					pessoas.get(i).getComplemento());
		}
		return pessoas;
	}
 	
	
	}	