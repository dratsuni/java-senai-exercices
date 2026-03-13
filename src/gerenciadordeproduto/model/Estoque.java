package gerenciadordeproduto.model;

import java.util.ArrayList;
import java.util.List;

import gerenciadordeproduto.entities.Produto;
import gerenciadordeproduto.utils.GeradorID;

public class Estoque {
	private static List<Produto> produtos = new ArrayList<>();

	public static List<Produto> getListaProdutos(){
		return List.copyOf(produtos);
	}
	

	public static double valorTotal() {
		double valorTotal = 0;

		for (Produto p : produtos) {
			valorTotal += p.getTotal();
		}

		return valorTotal;
	}
	
	public static int quantidadeTotal() {
		int quantidade = 0;
		for (Produto p : produtos) {
			quantidade += p.getQuantidade();
		}
		
		return quantidade;
	}
		
	public static void addProduto(Produto produto) {
		if (produto != null) {
			produtos.add(produto);
		}
	}
	
	public static void removeProduto(Produto produto) {
		if (produto != null) {
			produtos.remove(produto);
		}
	}
	
	public static Produto pesquisarProdutosPorID(int id) {
		if (id <= GeradorID.getId()) {
			for (Produto p : produtos) {
				if (id == p.getId()) {
					return p;
				}
			}
		}
		return null;
	}
	
	public static Produto pesquisarProdutoNome(String nome) {
		for (Produto p : produtos) {
			if (nome.equals(p.getNome())) {
				return p;
			}
		}
		return null;
	}
	
	
}
