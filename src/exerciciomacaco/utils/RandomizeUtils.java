package exerciciomacaco.utils;

import java.util.List;
import java.util.Random;

import exerciciomacaco.entities.Alimentacao;
import exerciciomacaco.entities.Macaco;
import exerciciomacaco.manager.GerenciadorMacacos;

public class RandomizeUtils {
	
	public static Alimentacao randomizeDieta() {
		Random r = new Random();
		Alimentacao[] alimentacao = Alimentacao.values();
		return alimentacao[r.nextInt(alimentacao.length - 1)];
	}
	
	public static void randomizeCanibalismo() {
		List<Macaco> macacos = GerenciadorMacacos.getListaMacacos();
	}
}
