package exerciciocontabancaria.view;
import java.util.Scanner;
import exerciciocontabancaria.entities.Conta;
import exerciciocontabancaria.entities.TipoTransacao;

public class ContaView {
	public static Conta criarConta(Scanner sc) {
		System.out.println("==============Criar Conta===============");
		String titular = Inputs.stringInput(sc, "Digite o seu nome: ");
		double saldo = 0;

		if (confirmarAcao(sc, "Deseja realizar um deposito inicial? [s/n] ")) {
			saldo = Inputs.doubleInput(sc, "Valor inicial do deposito: R$");
			System.out.printf("Valor inicial de R$%.2f depositado com sucesso!\n", saldo);
		}
		
		System.out.println("Conta criada com sucesso!");
		System.out.println("========================================");
		
		return new Conta(titular, saldo);
	}
	
	public static int menuConta(Scanner sc, Conta conta) {
		System.out.println("=============Conta bancária=============");
		System.out.println(conta);
		System.out.println("[1]Depositar\n[2]Sacar\n[3]Sair");
		System.out.println("========================================");
		int n = Inputs.intInput(sc, "Escolha > ");
		
		return n;
	}
	
	public static double transacaoInput(Scanner sc, TipoTransacao tipo) {
		String msg1 = (tipo == TipoTransacao.SAQUE) ? "sacar" : "depositar";
		String msg2 = (tipo == TipoTransacao.SAQUE) ? "sacado" : "depositado";
		
		double valor = Inputs.doubleInput(sc, String.format("Digite o valor a ser %s: R$", msg2));
		
		if (confirmarAcao(sc, String.format("Deseja mesmo %s? [s/n] ", msg1))) {
			System.out.printf("Valor de R$%.2f foi %s com sucesso.\n", valor, msg2);
			return valor;
		} 
	
		return 0;
	}
	
	private static boolean confirmarAcao(Scanner sc, String msg) {
		char input = Inputs.stringInput(sc, msg).toLowerCase().charAt(0);
		if (input == 's') {
			return true;
		}
	
		return false;
	}

}
