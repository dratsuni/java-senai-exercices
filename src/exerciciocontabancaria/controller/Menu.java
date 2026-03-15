package exerciciocontabancaria.controller;

import java.util.Scanner;

import exerciciocontabancaria.entities.Conta;
import exerciciocontabancaria.entities.TipoTransacao;
import exerciciocontabancaria.view.ContaView;

public class Menu {
	public static boolean menu(int op, Scanner sc, Conta conta) {
		switch(op) {
			case 1:
				conta.depositar(ContaView.transacaoInput(sc, TipoTransacao.DEPOSITO));
				return true;
			case 2:
				conta.sacar(ContaView.transacaoInput(sc, TipoTransacao.SAQUE));
				return true;
			case 3:
				System.out.println("Saindo...");
				return false;
			default:
				System.out.println("Essa opção não existe.");
				return true;
		}
	}
}
