package exercicioaluno.entities;
import exerciciofuncionario.entities.Matricula;

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
	
	public Matricula getMatricula(){
		return matricula;
	}
	
	public Notas getNotas() {
		return notas;
	}
}
