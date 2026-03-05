package exerciciomacaco.manager;
import java.util.ArrayList;
import java.util.List;

import exerciciomacaco.entities.Macaco;

public class GerenciadorMacacos {
	private static List<Macaco> macacos = new ArrayList<>();
	
	public static List<Macaco> getListaMacacos(){
		return List.copyOf(macacos);
	}
	
	public static void addMacaco(Macaco macaco) {
		if (macaco != null) {
			macacos.add(macaco);
		}
	}

	public static void apagarMacacos(int index) {
		if (index >= 0 && index <= macacos.size()) {
			macacos.remove(index);
		}
	}
	
	public static void mostrarMacacos() {
		System.out.println("==========macacos========");
		for (Macaco macaco : macacos) {
			System.out.println(macaco);
		}
		System.out.println("=========================");
	}
	
	public static Macaco pesquisarMacaco(int id) {
		for (Macaco macaco : macacos) {
			if (macaco.getID() == id) {
				return macaco;
			}
		}
		return null;
	}
}
