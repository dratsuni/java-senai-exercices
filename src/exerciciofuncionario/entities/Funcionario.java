package exerciciofuncionario.entities;

import exerciciofuncionario.utils.GeradorId;

public class Funcionario {
	private int id;
	private String name;
	Cargo cargo;
	double aumento;
	
	public Funcionario(String name, Cargo cargo) {
		id = GeradorId.gerarID();
		this.name = name;
		this.cargo = cargo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCargo() {
		return cargo.getDisc();
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
		aumento = 0;
	}
	public double getSalario() {
		return cargo.getSalario() + aumento;
	}
	public int getId() {
		return this.id;
	}
	public void adicionarAumento(double porcentualDeAumento) {
		aumento = (Math.abs(porcentualDeAumento) / 100.00) * cargo.getSalario();
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d\nNome: %s\nCargo: %s\nSalario: R$ %.2f\n", id, name, cargo, getSalario());
	}
	
	
}
