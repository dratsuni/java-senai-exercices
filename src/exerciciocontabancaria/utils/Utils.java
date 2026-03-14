package exerciciocontabancaria.utils;

import java.util.Random;

public class Utils {
	
	public static int gerarNumero(int numMax) {
		Random r = new Random();
		return r.nextInt(numMax);
	}
}
