package br.com.prova.aluno;

import java.util.List;
import java.util.Scanner;

import br.com.pessoa.Pessoa;

public class AlunoController {
	
	private static Scanner tec;
	
	public AlunoController(){
		tec = new Scanner(System.in);
	}
	
	public static int lerOpcao(){
		System.out.print ("Informe a opção desejada -> ");
		return tec.nextInt();
	}
	
	public void menu(List<Aluno>alunos) {
		
		System.out.print("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> CADASTRAR ALUNOS              |");
		System.out.println("|2 -> LISTAR ALUNOS CADASTRADOS     |");
		System.out.println("|3 -> EDITAR ALUNOS                 |");
		System.out.println("|4 -> EXCLUIR ALUNOS                |");
		System.out.println("|---------------------------------- |");
		System.out.print("Informe a Opção Desejada -> ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		case 1:
			alunos.add(cadastrarAlunos());
			break;
		
		case 2:
			listarAlunos(alunos);
			break;
			
		case 3:
			editarAlunos(alunos);
			break;
			
		case 4:
			excluirAlunos(alunos);
			default:
				break;
			
		}
		
	}
	
	public Aluno cadastrarAlunos() {
		Aluno aluno = new Aluno();
		System.out.print("\n");
		System.out.println("----CADASTRAR--ALUNOS----");
		System.out.print("\n");
		
		System.out.println("Informe o nome do Aluno: ");
		tec.nextLine();
		aluno.setNomeDoAluno(tec.nextLine());
		
		System.out.println("Informe a idade do Aluno: ");
		aluno.setIdadeDoAluno(tec.next());
		
		System.out.println("Informe em qual Pais o Aluno mora: ");
		aluno.setNomeDoPais(tec.next());
		
		System.out.println("Informe a Silga do Pais: ");
		aluno.setSiglaDoPais(tec.next());
		
		
	}
	
}

