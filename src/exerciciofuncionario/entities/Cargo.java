package exerciciofuncionario.entities;

public enum Cargo {
   DEV_WEB_FRONT_END("Desenvolvimento Web Front End", 4500, 7),
   DEV_WEB_BACK_END("Desenvolvimento Web Back End", 6500, 8),
   SYS_ADMIN("Administrador de Sistemas", 5060, 6);
	
	private String disc;
	private double salario;
	private int horas;
	
	Cargo(String disc, double salario, int horas){
		this.disc = disc;
		this.salario = salario;
		this.horas = horas;
	}
	
	public double getSalario() {
		return this.salario;
	}
	public int getHoras() {
		return this.horas;
	}
	public String getDisc() {
		return this.disc;
	}
	
	@Override
	public String toString() {
		return this.disc;
	}
}
