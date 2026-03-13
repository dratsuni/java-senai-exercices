package gerenciadordeproduto.controller;

import java.util.Scanner;

import gerenciadordeproduto.entities.Produto;
import gerenciadordeproduto.model.Estoque;
import gerenciadordeproduto.view.MenuView;
import gerenciadordeproduto.view.ProdutoView;

public class Menu {
	public static boolean menu(Scanner sc, int op) {
		switch(op) {
			case 1:
				Estoque.addProduto(ProdutoView.criarProduto(sc));
				return true;
			case 2:
				Produto produto = pesquisarMenu(sc);
				if (produto != null) {
					produtoMenu(sc, produto);
				} 
				return true;
			case 3:
				ProdutoView.listarProdutos(Estoque.getListaProdutos());
				return true;
			case 4:
				ProdutoView.valorTotalEmEstoque();
				return true;
			case 5:
				MenuView.menuMsg("Saindo...");
				return false;
			default: 
				MenuView.menuMsg("Essa opção não existe");
				return true;
				
		}
	}
	
	private static Produto pesquisarMenu(Scanner sc) {
		int n = 0;
		boolean quit = false;
		Produto produto = null;
		
		while (!quit) {
			n = MenuView.pesquisarProdutoMenu(sc);
			
			switch(n) {
				case 1:
					produto = ProdutoView.pesquisarPorId(sc);
					quit = true;
					break;
				case 2:
					produto = ProdutoView.pesquisarPorNome(sc);
					quit = true;
					break;
				case 3:
					quit = true;
					break;
				default:
					MenuView.menuMsg("Essa opção não existe.");
					break;
			}	
		}
		
		return produto;
	}
	
	private static void produtoMenu(Scanner sc, Produto produto) {
		boolean quit = false;
		while (!quit) {
			switch(ProdutoView.produtoMenu(produto, sc)) {
				case 1:
					atualizarProdutoMenu(sc, produto);
					break;
				case 2:
					Estoque.removeProduto(produto);
					quit = true;
					break;
				case 3:
					quit = true;
					break;
				default:
					MenuView.menuMsg("Essa opção não existe.");
					break;				
			}
		}
	}
	
	private static void atualizarProdutoMenu(Scanner sc, Produto produto) {
		boolean quit = false;
		
		while (!quit) {
			switch(ProdutoView.produtoAtualizarMenu(produto, sc)) {
				case 1:
					produto.setNome(ProdutoView.atualizarNomeProduto(sc));
					break;
				case 2:
					produto.setPreco(ProdutoView.atualizarPrecoProduto(sc));
					break;
				case 3:
					produto.setQuantidade(ProdutoView.atualizarQuantidadeProduto(sc));
					break;
				case 4:
					quit = true;
					break;
				default:
					MenuView.menuMsg("Essa opção não existe.");
					break;
			}
		}
	}
}
