package exercicioaluno.model;

import java.util.ArrayList;
import java.util.List;

public class ListaAluno {
	private List<Aluno> alunos;
	
	public ListaAluno() {
		alunos = new ArrayList<>();
	}
	
	public List<Aluno> getListaAluno(){
		return List.copyOf(alunos);
	}
	public int getQuantidadeAluno() {
		return alunos.size();
	}
	public void addAluno(Aluno aluno) {
		if (aluno != null) {
			alunos.add(aluno);
		}
	}
	
	public Aluno pesquisarAlunoMatricula(int matricula) {
		return alunos.stream().filter(x -> x.getMatricula() == matricula).findFirst().orElse(null);
	}
	
	public Aluno pesquisarAlunoNome(String nome) {
		return alunos.stream().filter(x -> x.getNome().equals(nome)).findFirst().orElse(null);
	}
	
	public double mediaGeral() {
		return alunos.stream().mapToDouble(p -> p.getNotas().media()).average().getAsDouble();
	}
	
	public List<String> listarAlunos(SituacaoAluno situacao){
		return alunos.stream().filter(a -> a.getNotas().getSituacao() == situacao).map(a -> a.getNome()).toList();
	}
	
}
