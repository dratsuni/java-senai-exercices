package gerenciadordeproduto.view;
import java.util.List;
import java.util.Scanner;

import gerenciadordeproduto.entities.Produto;
import gerenciadordeproduto.model.Estoque;
import gerenciadordeproduto.utils.LimparBuffer;

public class ProdutoView {
	public static void listarProdutos(List<Produto> produtos) {
		System.out.println("=============Produtos=============");
		
		if (produtos.size() > 0) {
			for (Produto p : produtos) {
				System.out.println(p);
			}
		} else {
			System.out.println("Nenhum produto cadastrado.");
		}
		
		System.out.println("==================================");
	}
	
	public static void valorTotalEmEstoque() {
		int quantidade = Estoque.quantidadeTotal();
		double valorTotal = Estoque.valorTotal();
		
		System.out.println("==========Valor de estoque========");
		System.out.printf("Valor total em estoque: R$%.2f\nQuantidade de produtos em estoque: %d\n", valorTotal, quantidade);
		System.out.println("==================================");
	}
	
	public static Produto criarProduto(Scanner sc) {
		System.out.println("==========Cadastrar produto==========");
		String nome = atualizarNomeProduto(sc);
		double preco = atualizarPrecoProduto(sc);;
		int quantidade = atualizarQuantidadeProduto(sc);
		System.out.println("Produto cadastrado!");
		
		return new Produto(nome, preco, quantidade);
	}
	
	public static int produtoMenu(Produto produto, Scanner sc) {
		int n = 0;
		if (produto != null) {
			System.out.println("=============Produto Selecionado=============");
			System.out.println(produto);
			System.out.println("[1]Atualizar produto\n[2]Remover produto\n[3]Sair");
			System.out.print("Escolha > ");
			n = sc.nextInt();
			LimparBuffer.limpaBuffer(sc);
		}
		
		return n;
		
	}
	
	public static int produtoAtualizarMenu(Produto produto, Scanner sc) {
		System.out.println("===========Atualizar produto============");
		System.out.println(produto);
		System.out.println("[1]Atualizar nome\n[2]Atualizar preço\n[3]Atualizar quantidade\n[4]Sair");
		System.out.print("Escolha > ");
		int n = sc.nextInt();
		LimparBuffer.limpaBuffer(sc);
			
		return n;
	}
	
	public static String atualizarNomeProduto(Scanner sc) {
		System.out.print("Digite o  nome do produto: ");
		return sc.nextLine();
	}
	
	public static double atualizarPrecoProduto(Scanner sc) {
		System.out.print("Digite o  preço do produto: ");
		double n = sc.nextDouble();
		LimparBuffer.limpaBuffer(sc);
		
		return n;
	}
	
	public static int atualizarQuantidadeProduto(Scanner sc) {
		System.out.print("Digite a quantidade de produto: ");
		int n = sc.nextInt();
		LimparBuffer.limpaBuffer(sc);
		
		return n;
	}
	
	public static Produto pesquisarPorNome(Scanner sc) {
		Produto produto;
		System.out.print("Digite o nome do produto: ");
		String nome = sc.nextLine();
		produto = Estoque.pesquisarProdutoNome(nome);
		produtoExiste(produto);
		
		return produto;
	}
	
	public static Produto pesquisarPorId(Scanner sc) {
		Produto produto;
		System.out.print("Digite o id do produto: ");
		int id = sc.nextInt();
		LimparBuffer.limpaBuffer(sc);
		produto = Estoque.pesquisarProdutosPorID(id);
		produtoExiste(produto);
		
		return produto;
	}
	
	private static void produtoExiste(Produto produto) {
		if (produto == null) {
			System.out.println("Produto não encontrado");
		}
	}
	

}
