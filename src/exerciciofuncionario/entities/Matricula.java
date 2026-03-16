package exerciciofuncionario.entities;

public class Matricula {
	private static int ultimaMatricula = 20261000;
	private int matricula;
	
	public Matricula() {
		matricula = gerarMatricula();
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	private static int gerarMatricula() {
		ultimaMatricula += 1;
		return ultimaMatricula;
	}
	
	
}
