package exerciciofuncionario;
import java.util.Scanner;

import exerciciofuncionario.manager.MenuManager;
import exerciciofuncionario.view.MenuView;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(MenuManager.menu(sc, MenuView.opcoesMenu(sc)));
		sc.close();
	}
}
