package ex18ArrayList;

public class Livro {

	
	private String autor;
	private String titulo;
	private boolean disponivel;
	
	public Livro(String autor,String titulo,boolean disponivel) {
		this.autor = autor;
		this.titulo = titulo;
		this.disponivel = disponivel;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void emprestar() {
		if(getDisponivel()) {
			setDisponivel(false);
			System.out.println("Emprestei: " + getTitulo());
		}
	}
	
	public void devolver() {
		if(!getDisponivel()) {
			setDisponivel(true);
			System.out.println("Me devolveram: " + getTitulo());
		}
	}
	
	public void exibirInformacoes() {
		System.out.println("Autor (a): " + autor);
		System.out.println("Titulo: "+ titulo);
		System.out.println("Disponivel: "+ disponivel);
	}
	

	
}
