package ex18ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Livro> livros = new ArrayList<>();
		
		livros.add(new Livro("Colleen Hoover","Verity",true));
		livros.add(new Livro("Colleen Hoover","O lado feio do amor",true));
		livros.add(new Livro("Colleen Hoover","E ASSIM QUE COMECA",true));
		livros.add(new Livro("Colleen Hoover"," E ASSIM QUE ACABA",true));
		livros.add(new Livro("Colleen Hoover","Layla",true));
		livros.add(new Livro("Collen Hoover","Novembro 9",true));
		
		livros.get(2).emprestar();
		livros.get(1).emprestar();
		livros.get(1).devolver();
		
		int disponiveis = 0;
		
		
		for(Livro livro : livros) {
			livro.exibirInformacoes();
			if (livro.getDisponivel()) {
		        disponiveis++;
		    }
			System.out.println("-------------------------");
		}System.out.println("Livros disponíveis: " + disponiveis);

	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o título do livro:");
		String pesquisa = sc.nextLine();

		boolean encontrado = false;

		for (Livro livro : livros) {

		    if (livro.getTitulo().equalsIgnoreCase(pesquisa)) {

		        livro.exibirInformacoes();
		        encontrado = true;
		        break;
		    }
		}

		if (!encontrado) {
		    System.out.println("Livro não encontrado!");
		}

		sc.close();
	
	
	
	
	
	
	
	
	}

}
