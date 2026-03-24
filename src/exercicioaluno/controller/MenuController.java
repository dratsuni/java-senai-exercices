package exercicioaluno.controller;

import java.util.List;
import java.util.Scanner;

import exercicioaluno.exceptions.LimiteAvaliacoesExcedidosException;
import exercicioaluno.model.Aluno;
import exercicioaluno.model.ListaAluno;
import exercicioaluno.model.Notas;
import exercicioaluno.model.SituacaoAluno;
import exercicioaluno.utils.Utils;
import exercicioaluno.view.Inputs;
import exercicioaluno.view.MenuView;

public class MenuController {
	public static boolean menu(Scanner sc, int op, ListaAluno listaAluno) {
		Aluno aluno;
		
		switch(op) {
			case 1:
				listaAluno.addAluno(new Aluno(Inputs.stringInput(sc, "Digite o nome do aluno: ")));
				MenuView.menuMsg("Aluno cadastrado com sucesso!\n");
				return true;
			case 2:
				aluno = menuPesquisa(sc, Inputs.intInput(sc, "Escolha o modo de pesquisa: [1]Pesquisar por nome [2]Pesquisar por matricula > "), listaAluno);
				if (aluno != null) {
					adicionarNotaAluno(sc, aluno);
				} else {
					MenuView.menuMsg("Este aluno não existe.\n");
				}
				return true;
			case 3:
				 listarAlunosAcordoSituacao(SituacaoAluno.APROVADO, listaAluno);
				return true;
			case 4:
				listarAlunosAcordoSituacao(SituacaoAluno.REPROVADO, listaAluno);
				return true;
			case 5:
				aluno = menuPesquisa(sc, Inputs.intInput(sc, "Escolha o modo de pesquisa: [1]Pesquisar por nome [2]Pesquisar por matricula > "), listaAluno);
				if (aluno != null) {
					MenuView.menuMsg("===========Status do aluno===========\n");
					MenuView.menuMsg(aluno.toString());
					MenuView.menuMsg("=====================================\n");
				} else {
					MenuView.menuMsg("Este aluno não existe.\n");
				}
				return true;
			case 6:
				MenuView.menuMsg("==========Alunos cadastrados==========\n");
				Utils.mostrarItensLista(listaAluno.getListaAluno());
				MenuView.menuMsg("=====================================\n");
				return true;
			case 7:
				MenuView.menuMsg("Saindo...\n");
				return false;
			default:
				MenuView.menuMsg("Opção inexiste.\n");
				return true;
				
		}
	}
	
	private static Aluno menuPesquisa(Scanner sc, int op, ListaAluno listaAluno) {
		switch(op) {
			case 1:
				return listaAluno.pesquisarAlunoNome(Inputs.stringInput(sc, "Digite o nome do aluno: "));
			case 2:
				return listaAluno.pesquisarAlunoMatricula(Inputs.intInput(sc, "Digite o num de matricula do aluno: "));
			default:
				MenuView.menuMsg("Opção inexistente.\n");
				return null;
		}
	}
	
	private static void adicionarNotaAluno(Scanner sc, Aluno aluno) {
		try {
			Notas listaNotas = aluno.getNotas();
			listaNotas.adicionarNotas(Inputs.doubleInput(sc, String.format("Digite a nota de %s: ", aluno.getNome())));
		} catch (LimiteAvaliacoesExcedidosException e) {
			MenuView.menuMsg("Limite de avaliações excedido. ");
		} catch (IllegalArgumentException e) {
			MenuView.menuMsg("Limite de notas excedido. Digite algo entre [0-10].\n");
		} 
	}

	private static void listarAlunosAcordoSituacao(SituacaoAluno situacao, ListaAluno listaAluno) {
		MenuView.menuMsg(String.format("============Lista de alunos %s============\n", situacao));
		List<String> lista = listaAluno.listarAlunos(situacao);
		if (lista.size() > 0) {
			Utils.mostrarItensLista(lista);
		} else {
			MenuView.menuMsg(String.format("Não há alunos %ss\n", situacao));
		}
		MenuView.menuMsg("==========================================\n");
	}
}
