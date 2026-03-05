package exerciciomacaco.entities;

public enum Alimentacao {
	HERBIVORO("Herbivoro"),
	CARNIVORO("Carnivoro"),
	ONIVORO("Onivoro");
	
	private String disc;

	Alimentacao(String disc){
		this.disc = disc;
	}
	
	@Override
	public String toString() {
		return this.disc;
	}
}
