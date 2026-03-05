package exerciciofuncionario.utils;

public class GeradorId {
	private static int ultimoID = 0;
	
	public static void resetUltimoID() {
		ultimoID = 0;
	}
	
	public static int getUltimoID() {
		return ultimoID;
	}
	
	public static int gerarID() {
		ultimoID++;
		return ultimoID;
	}
}
