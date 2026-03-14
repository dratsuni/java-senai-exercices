package exerciciocontabancaria.view;
import java.util.Scanner;
import exerciciocontabancaria.entities.Conta;

public class ContaView {
	public static Conta criarConta(Scanner sc) {
		System.out.println("============Criar conta==========");
		String titular = Inputs.stringInput(sc, "Digite o seu nome");
		double saldo = 0;

		if (confirmarAcao(sc, "Deseja realizar um deposito inicial? [s/n] ")) {
			saldo = Inputs.doubleInput(sc, "Valor a ser depositado: R$");
			System.out.printf("Valor inicial de R$%.2f depositado com sucesso!\n", saldo);
		}
		
		System.out.println("Conta criada com sucesso!");
		System.out.println("=================================");
		
		return new Conta(titular, saldo);
	}
	public static int menuConta(Scanner sc, Conta conta) {
		System.out.println("=============Conta bancária=============");
		System.out.println("[1]Depositar\n[2]Sacar\n[3]Sair");
		int n = Inputs.intInput(sc, "Escolha > ");
		System.out.println("========================================");
		
		return n;
	}
	private static boolean confirmarAcao(Scanner sc, String msg) {
		char input = Inputs.stringInput(sc, msg).toLowerCase().charAt(0);
		if (input == 's') {
			return true;
		}
	
		return false;
	}

}
