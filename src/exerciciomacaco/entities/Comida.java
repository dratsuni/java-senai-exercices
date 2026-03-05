package exerciciomacaco.entities;

public enum Comida {
	BANANA("Banana", 142);
	
	private String desc;
	private int calorias;
	
	Comida(String desc, int calorias){
		this.calorias = calorias;
	}
	
	public int getCalorias() {
		return this.calorias;
	}
	
	@Override
	public String toString() {
		return this.desc;
	}
	
	
}
