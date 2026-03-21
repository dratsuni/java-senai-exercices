package exercicioaluno.model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Notas {
	private List<Double> notas;
	private final double divisor = 3;
	private final double criterioAprovacao = 7;
	
	public Notas() {
		notas = new ArrayList<>();
	}
	
	public List<Double> getNotas(){
		return List.copyOf(notas);
	}
	
	public void adicionarNotas(double nota) {
		if (nota >= 0) {
			notas.add(nota);
		}
	}
	
	public double media() {
	    return notas.stream().collect(Collectors.summingDouble(m -> m)) / divisor;
	}
	
	public boolean situacaoAprovacao() {
		return media() > criterioAprovacao;
	}
	

	
}
