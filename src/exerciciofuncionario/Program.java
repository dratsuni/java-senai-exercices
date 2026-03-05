package exerciciofuncionario;
import java.util.Scanner;

import exerciciofuncionario.manager.MenuManager;
import exerciciofuncionario.view.MenuView;

public class Program {
	
	public static void main(String[] args) {

		int op = 0;
		Scanner sc = new Scanner(System.in);
		
		while(op != 4) {
			System.out.println("[Gerenciador de funcionarios]");
			op = MenuView.opcoesMenu(sc);
			MenuManager.menu(sc, op);
		}
		
		sc.close();
	}
}
