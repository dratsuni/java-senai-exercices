package exerciciofuncionario.manager;
import java.util.Scanner;

import exerciciofuncionario.entities.Funcionario;
import exerciciofuncionario.view.MenuView;


public class MenuManager {
	
	public static boolean menu(Scanner sc, int op) {
		switch(op) {
			case 1:
				GerenciadorDeFuncionarios.addFuncionario(MenuView.cadastrarFuncionario(sc));
				return true;
			case 2:
				funcionarioMenu(MenuView.pesquisarFuncionario(sc), sc);
				return true;
			case 3:
				GerenciadorDeFuncionarios.mostrarFuncionarios();
				return true;
			case 4:
				System.out.println("Saindo...");
				return false;
			default:
				System.out.println("Essa opcao nao existe. Tente novamente.");
				return true;
		}
	}
	
	public static void funcionarioMenu(Funcionario funcionario, Scanner sc) {
		boolean quit = false;
		
		while (!quit) {
			switch(MenuView.opcoesFuncionario(sc, funcionario)) {
				case 1:
					if (MenuView.confirmarEscolha(sc)) {
						MenuView.adicionarAumento(sc, funcionario);
					}
					break;
				case 2:
					 if (MenuView.confirmarEscolha(sc)) {
						GerenciadorDeFuncionarios.removeFuncionario(funcionario);
						System.out.println("Funcionario removido com sucesso!");
						quit = true;
					 }
					 break;
				case 3: 
					if (MenuView.confirmarEscolha(sc)) {
						MenuView.mudarCargoFuncionario(sc, funcionario);
					}
					break;
				case 4:
					System.out.println("Saindo...");
				    quit = true; 
					break;
				default:
					System.out.println("Essa opcao nao exite. Tente novamente.");
					break;
			}
		}
	}
}
