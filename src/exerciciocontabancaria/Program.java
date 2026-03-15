package exerciciocontabancaria;
import java.util.Scanner;
import exerciciocontabancaria.controller.Menu;
import exerciciocontabancaria.entities.Conta;
import exerciciocontabancaria.view.ContaView;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta = ContaView.criarConta(sc);
		while(Menu.menu(ContaView.menuConta(sc, conta), sc, conta));
		sc.close();
	}
}
