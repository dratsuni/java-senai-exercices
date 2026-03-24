package exercicioaluno.utils;

import java.util.List;

public class Utils {
	public static void mostrarItensLista(List<?> lista) {
		lista.stream().forEach(System.out::println);
	}
}
