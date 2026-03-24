package exercicioaluno.model;

public class Aluno {
	private String nome;
	private Matricula matricula;
	private Notas notas;

	
	public Aluno(String nome) {
		this.nome = nome;
		matricula = new Matricula();
		notas = new Notas();
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula(){
		return matricula.getMatricula();
	}
	
	public Notas getNotas() {
		return notas;
	}
	
	@Override
	public String toString() {
		return String.format("Matricula: %d\nNome: %s\n%s\n", getMatricula(), nome, notas);
	}
}
