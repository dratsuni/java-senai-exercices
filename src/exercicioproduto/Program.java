package exercicioproduto;

import exercicioproduto.entities.Produto;

public class Program {
	public static void main(String[] args) {
		Produto produto = new Produto("Café", 55.50, 100);
		System.out.println(produto);
	}
}
