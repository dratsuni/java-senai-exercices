package exerciciocontabancaria.view;
import java.util.Scanner;

public class Inputs {
	public static String stringInput(Scanner sc, String msg) {
		System.out.print(msg);
		return sc.nextLine();
	}
	
   public static double doubleInput(Scanner sc, String msg) {
	   System.out.print(msg);
	   double n = sc.nextDouble();
	   limparBuffer(sc);
	   
	   return n;
   }
   
   public static int intInput(Scanner sc, String msg) {
	   System.out.print(msg);
	   int n = sc.nextInt();
	   limparBuffer(sc);
	   
	   return n;
   }
   
   private static void limparBuffer(Scanner sc) {
	   sc.nextLine();
   }
}
