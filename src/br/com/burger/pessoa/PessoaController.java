package br.com.burger.pessoa;

import java.util.List;
import java.util.Scanner;
import br.com.burger.pessoa.Pessoa;

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
		System.out.println("|----------------MENU-----------------|");
		System.out.println("|01 -> MENU PESSOAS                   |");
		System.out.println("|02 -> MENU PRODUTOS                  |");
		System.out.println("|03 -> MENU VENDAS                    |");
		System.out.println("|04 -> SAIR DO SISTEMA                |");
		System.out.println("|-------------------------------------|");
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
		
		if(pessoas.size() <=  0) {
			System.out.println("\n");
			System.out.println("Você não possui nenhuma pessoa cadastrada.");
			return null;
		}
		
		System.out.println("\n");
		System.out.println("-----------PESSOAS---CADASTRADAS-----------");

		
		System.out.printf ("| %2s | %15s | %20s | %20s | %20s | %20s| %21s | %23s | %20s | %30s | %30s | %30s | %21s | %30s |\n", "ID", "Nome", "Ano De Nascimento", "Idade", "Altura", "Pais", "Sigla do Pais", "Nome do Estado", "Sigla do Estado",
				"Nome da Cidade", "Nome da Rua", "Bairro", "Número da Casa", "Complemento");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %2d | %15s | %20d | %20d | %20s | %19s | %21s | %23s | %20s | %30"
					+ "s | %30s | %30s | %21s | %30s |\n", 
					i + 1,
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
	
	public List<Pessoa> editarPessoas(List<Pessoa> pessoas) {
		
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		}
		System.out.println("\n");
		System.out.print("Informe o Id da Pessoa: ");
		int idPessoa = tec.nextInt() -1;
		
		System.out.println("\n");
		System.out.println(" 1 -> Nome da Pessoa           ");
		System.out.println(" 2 -> Ano de Nascimento        ");
		System.out.println(" 3 -> Altura                   ");
		System.out.print("Informe o Campo a ser Editado: ");
		
		int opcao = tec.nextInt();
		switch (opcao) {
		
		case 1:
			System.out.println("---EDITAR--NOME---");
			System.out.print("Informe o nome da Pessoa: ");
			pessoa.setNome(tec.next());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
		case 2:
			System.out.println("---EDITAR--ANO--DE--NASCIMENTO---");
			System.out.print("Informe o ano de nascimento: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
		case 3:
			System.out.println("---EDITAR--ALTURA---");
			System.out.print("Informe sua altura: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
			
		}
		
		return pessoas;
	}
 	
	public void excluirPessoa (List<Pessoa> pessoas) {
		
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return;}
		System.out.println("\n");
		System.out.println("---EXCLUIR--PESSSOAS---");
		
		System.out.println("Informe o ID que deseja excluir: ");
		int idPessoa = tec.nextInt() - 1;
		
		if(pessoas.size() <= idPessoa ) {
			System.out.println("Pessoa não encontrada");
			return;
		}
		pessoas.remove(idPessoa);
	}
}	