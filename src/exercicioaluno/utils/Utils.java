package exercicioaluno.utils;

import java.util.List;

public class Utils {
	public static double sumDoubleList(List<Double> list) {
		int sum = 0;
		for (Double n : list) {
			sum += n;
		}
		return sum;
	}
}
