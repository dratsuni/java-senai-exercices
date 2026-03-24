package exercicioaluno;

import java.util.Scanner;

import exercicioaluno.controller.MenuController;
import exercicioaluno.model.ListaAluno;
import exercicioaluno.view.Inputs;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaAluno alunos = new ListaAluno();
		String menuMsg = "[1]Adicionar aluno\n[2]Adicionar nota\n[3]Lista Alunos aprovados\n[4]Listar alunos reprovados\n[5]Ver status do aluno\n[6]Listar todos os alunos\n[7]Sair\nescolha > ";
		boolean quit = true;
		while(quit) {
			System.out.println("=============gerenciador de alunos=============");
			quit = MenuController.menu(sc, Inputs.intInput(sc, menuMsg), alunos);
		}
		sc.close();
	}
}
