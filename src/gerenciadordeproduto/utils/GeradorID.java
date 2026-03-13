package gerenciadordeproduto.utils;

public class GeradorID {
	
	private static int ultimoID = 0;
	
	public static int getId() {
		return ultimoID;
	}
	
	public static void reiniciarId(){
		ultimoID = 0;
	}
	
	public static void gerarId() {
		ultimoID += 1;
	}

}
