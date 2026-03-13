package exerciciopessoas.entities;

public class Pessoas {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoas(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		String maioridade = (verificarMaioridade()) ? "Sim" : "Não" ;
		return String.format("Nome: %s\nIdade: %d\nAltura: %.2f\nÉ maior de idade? %s", nome, idade, altura, maioridade);
	}
	
	public boolean verificarMaioridade() {
		if (idade > 18) {
			return true;
		}
		return false;
	}
}
