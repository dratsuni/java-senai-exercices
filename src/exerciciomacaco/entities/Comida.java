package exerciciomacaco.entities;

public enum Comida {
	BANANA("Banana", Alimentacao.HERBIVORO, 1), 
	GAFANHOTO("Gafanhoto", Alimentacao.CARNIVORO, 3);

	private String desc;
	private Alimentacao  tipo;
	private int saciacao;

	
	Comida(String desc, Alimentacao tipo, int saciacao){
		this.desc = desc;
		this.tipo = tipo;
		this.saciacao = saciacao;
	}
	
	public int getSaciacao() {
		return this.saciacao;
	}
	
	public Alimentacao getTipo() {
		return this.tipo;
	}
	
	@Override
	public String toString() {
		return this.desc;
	}
	
	
}
