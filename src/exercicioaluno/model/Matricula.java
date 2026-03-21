package exercicioaluno.model;

public class Matricula {
	private static int ultimaMatricula = 20261000;
	private int matricula;
	
	public Matricula() {
		matricula = gerarMatricula();
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public static int getUltimaMatricula() {
		return ultimaMatricula;
	}
	
	private static int gerarMatricula() {
		ultimaMatricula += 1;
		return ultimaMatricula;
	}
	
	
}
