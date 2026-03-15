package gerenciadordeproduto;

import java.util.Scanner;

import gerenciadordeproduto.controller.Menu;
import gerenciadordeproduto.view.MenuView;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (Menu.menu(sc,MenuView.menuView(sc)));
		sc.close();
	}
}
