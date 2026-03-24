package exercicioaluno.model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import exercicioaluno.exceptions.LimiteAvaliacoesExcedidosException;

public class Notas {
	private List<Double> notas;
	private SituacaoAluno situacao;
	private int avaliacoesRealizadas; 
	
	private final double limiteAvaliacoes = 3;
	private final double criterioAprovacao = 7;
	
	public Notas() {
		notas = new ArrayList<>();
		avaliacoesRealizadas = 0;
		situacao = SituacaoAluno.EM_CURSO;
	}
	
	public List<Double> getNotas(){
		return List.copyOf(notas);
	}
	
	public SituacaoAluno getSituacao() {
		return situacao;
	}
	
	public void adicionarNotas(double nota) throws LimiteAvaliacoesExcedidosException {
		if (nota >= 0 && nota <= 10.00) {
			if (avaliacoesRealizadas < limiteAvaliacoes) {
				notas.add(nota);
				avaliacoesRealizadas++;
				if (avaliacoesRealizadas == limiteAvaliacoes) {
					situacaoAprovacao();
				}
			} else {
				throw new LimiteAvaliacoesExcedidosException("Limite de avaliação excedido.");
			}
		} else {
			throw new IllegalArgumentException("Limite de nota excedido.");
		}
		
	}
	
	public double media() {
	    return notas.stream().collect(Collectors.summingDouble(m -> m)) / limiteAvaliacoes;
	}
	

	public void situacaoAprovacao() {
		if (media() >= criterioAprovacao) {
			situacao = SituacaoAluno.APROVADO;
		} else {
			situacao = SituacaoAluno.REPROVADO;
		}
	}
	
	
	public String toString() {
		return String.format("Notas: %s\nMedia: %.2f\nSituacao: %s", notas, media(), situacao);
	}
}
