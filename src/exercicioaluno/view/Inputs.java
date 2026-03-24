package exercicioaluno.view;

import java.util.Scanner;

public class Inputs {
	public static double doubleInput(Scanner sc, String msg) {
		return Double.parseDouble(stringInput(sc, msg));
	}
	public static int intInput(Scanner sc, String msg) {
		return Integer.parseInt(stringInput(sc, msg));
	}
	public static String stringInput(Scanner sc, String msg) {
		System.out.print(msg);
		String n = sc.nextLine();
		return n;
	}
}
