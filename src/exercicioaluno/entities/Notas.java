package exercicioaluno.entities;
import java.util.ArrayList;
import java.util.List;
import exercicioaluno.utils.Utils;

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
	    return Utils.sumDoubleList(notas) / divisor;
	}
	
	public boolean situacaoAprovacao() {
		if (media() > criterioAprovacao) {
			return true;
		}
		return false;
	}
	

	
}
