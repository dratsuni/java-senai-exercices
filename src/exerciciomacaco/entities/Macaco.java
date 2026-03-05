package exerciciomacaco.entities;

import java.util.ArrayList;
import java.util.List;

import exerciciofuncionario.utils.GeradorId;
import exerciciomacaco.utils.RandomizeUtils;

public class Macaco {
	private int id;
	private String nome;
	private Alimentacao dieta;
	private int fome;
	private List<String> estomago;
	
	public Macaco(String nome) {
		id = GeradorId.gerarID();
		this.nome = nome;
		fome = 100;
		estomago = new ArrayList<>();
		dieta = RandomizeUtils.randomizeDieta();
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getNome(){
		return this.nome;
	}
	public int getFome() {
		return this.fome;
	}
	public Alimentacao getDieta() {
		return this.dieta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setFome(int fome) {
		this.fome = fome;
	}

	public void comer(Comida comida) {
		if (fome > 0) {
			if (comida.getTipo() == dieta) {
				addComidaEstomago(comida);
			} else if (dieta == Alimentacao.ONIVORO) {
				addComidaEstomago(comida);
			}
		}
	}
	
	public void digerir() {
		if (estomago.size() > 1) {
			fome += 2;
			estomago.remove(0);			
		}
	}
	
	public void verEstomago() {
		System.out.println("========Estomago do macaco======");
		int i = 0;
		for (String comida : estomago) {
			System.out.printf("[%d] %s%n", i, comida);
			i++;
		}
		System.out.println("================================");
	}
	
	public void canibalizar(Macaco macaco) {
		if (dieta == Alimentacao.CARNIVORO) {
			estomago.add(macaco.getNome());
			fome -= fome;
		}
	}
	
	private  void addComidaEstomago(Comida comida) {
		fome = (comida.getSaciacao() < fome) ? fome - comida.getSaciacao() : fome - 1;
		estomago.add(comida.toString());
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d\nNome: %s\nFome: %d, Dieta: %s%n", id, nome ,fome, dieta);
	}
}

