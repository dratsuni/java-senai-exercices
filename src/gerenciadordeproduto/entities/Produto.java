package gerenciadordeproduto.entities;

import gerenciadordeproduto.utils.GeradorID;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		GeradorID.gerarId();
		id = GeradorID.getId();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = (quantidade > 0) ? quantidade : 1;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	} 
	
	public double getTotal() {
		return preco * quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("ID: %d\nNome do produto: %s\nPreço: R$%.2f\nQuantidade: %d\n", id, nome, preco, quantidade);
	}

}
