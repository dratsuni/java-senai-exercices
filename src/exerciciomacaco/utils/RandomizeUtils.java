package exerciciomacaco.utils;

import java.util.List;
import java.util.Random;

import exerciciomacaco.entities.Alimentacao;
import exerciciomacaco.entities.Macaco;
import exerciciomacaco.manager.GerenciadorMacacos;

public class RandomizeUtils {
	private static Random r = new Random();
	
	public static Alimentacao randomizeDieta() {
	
		Alimentacao[] alimentacao = Alimentacao.values();
		return alimentacao[r.nextInt(alimentacao.length - 1)];
	}
	
	public static void randomizeCanibalismo() {
		
		List<Macaco> macacos = GerenciadorMacacos.getListaMacacos();
		int canibal = r.nextInt(macacos.size());
		int comida = r.nextInt(macacos.size());
		
		Macaco macacoCanibal = macacos.get(canibal);
		Macaco macacoComida = macacos.get(comida);
		
		if (macacoCanibal.getDieta() == Alimentacao.CARNIVORO) {
			if (macacoCanibal != macacoComida) {
				macacoCanibal.canibalizar(macacoComida);
				GerenciadorMacacos.apagarMacacos(comida);
			}
		}
	}
}
