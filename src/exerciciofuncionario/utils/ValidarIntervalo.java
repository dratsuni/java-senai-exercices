package exerciciofuncionario.utils;
import java.util.Scanner;

public class ValidarIntervalo {
	
	public static int validarIntervalo(Scanner sc, int valor, int menorNumero, int maiorNumero) {
		int n = valor;
		
		while (n < menorNumero || n > maiorNumero) {
			System.out.println("Essa opção não exite. Tente novamente!");
			System.out.printf("[%d - %d] > ", menorNumero, maiorNumero);
			n = sc.nextInt();
		} 
		
		return n;
	}
	
}
