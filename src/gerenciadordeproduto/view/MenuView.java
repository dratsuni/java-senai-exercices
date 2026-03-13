package gerenciadordeproduto.view;

import java.util.Scanner;

import gerenciadordeproduto.utils.LimparBuffer;

public class MenuView {
	public static int pesquisarProdutoMenu(Scanner sc) {
		System.out.println("========modo de pesquisa=======");
		System.out.println("[1]Pesquisa por ID\n[2]Pesquisa por nome\n[3]Sair");
		System.out.print("Escolha >");
		int n = sc.nextInt();
		LimparBuffer.limpaBuffer(sc);
		
		return n;
	}
	
	public static int menuView(Scanner sc) {
		System.out.println("=============Menu=============");
		System.out.println("[1]Adicionar produto\n[2]Selecionar produto\n[3]Listar produtos\n[4]Valor em estoque\n[5]Sair");
		System.out.print("Escolha > ");
		int n = sc.nextInt();
		LimparBuffer.limpaBuffer(sc);
		return n;
	}
	
	public static void menuMsg(String msg) {
		System.out.println(msg);
	}
}
