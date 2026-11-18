package ex11Array;

public class Main {

	public static void main(String[] args) {
		
		Produto[] produtos = {new Produto("Notebook",2000,5),
						      new Produto("Mouse",150,4),
						      new Produto("Monitor",800,7),
						      new Produto("Teclado",200,9)
				
		};
		
		double estoqueTotal = 0;
		
		for(Produto produto : produtos) {
			produto.info();
			double valor = produto.calcularEstoque();
			System.out.println("Total em estoque: " + valor);
			estoqueTotal += valor;
			System.out.println("-=-=-=-=-=-=-");
		}System.out.println("Total em estoque: " + estoqueTotal );


	}

}
