package ex13Array;

public class Main {

	public static void main(String[] args) {
		
		Livro[] livros = {new Livro("Verity","Colleen Hoover",true),
						  new Livro("E ASSIM QUE ACABA","Colleen Hoover",true),
						  new Livro("E ASSIM QUE COMECA","Collen Hoover",true),
						  new Livro("O Lado feio do amor","Collen Hoover",true)
				
		};
		
		livros[0].emprestar();
		livros[0].devolver();
		
		
		
		for(Livro livro : livros) {
			livro.infoLivros();
			System.out.println("-=-=-=-=-=-=-");
			
		}
		


	}

}
