package exercicioproduto.entities;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotal() {
		return preco * quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("Nome do produto: %s\nPreço: R$%.2f\nQuantidade: %d\nValor total em estoque: %.2f", nome, preco, quantidade, valorTotal());
	}
}
