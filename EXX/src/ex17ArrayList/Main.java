package ex17ArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Celular",1900,6));
		produtos.add(new Produto("Notebook",3000,8));
		produtos.add(new Produto("Teclado",240,6));
		produtos.add(new Produto("Mouse",200,8));
		produtos.add(new Produto("Mouse Pad",20,22));
		
		produtos.remove(4);
		int totalQuantidade = 0;
		double totalEstoque = 0;
		
		
		for(Produto produto : produtos ) {
			produto.infoProdutos();
			totalQuantidade += produto.getQuantidade();
			totalEstoque += produto.getPreco() * produto.getQuantidade();
			System.out.println("-=-=-=-=-=-=");
		}

		
		System.out.println("Total de produtos em estoque: " + totalQuantidade);
		System.out.println("Valor total do estoque: " + totalEstoque);
		
		System.out.println("----------------------------------");
		
		produtos.get(1).setQuantidade(100);
		System.out.printf("Novo estoque do %s: %d",produtos.get(1).getNome(),produtos.get(1).getQuantidade());

		
		
	}

}
