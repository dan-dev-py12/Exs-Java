package ex13Array;

public class Livro {

	
	private String titulo;
	private String autor;
	private boolean disponivel;
	
	public Livro(String titulo,String autor,boolean disponivel) {
		this.titulo = titulo;
		this.autor  = autor;
		this.disponivel = disponivel;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public boolean getDisponivel(){
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	public void emprestar() {
		if (getDisponivel()) {
			System.out.println("Emprestei: " + titulo);
			setDisponivel(false);
		}else {
			System.out.println("Ja emprestei: " + titulo);
		}
	}
	public void devolver() {
		if (!getDisponivel()) {
			System.out.println("Devolveram: " + titulo);
			setDisponivel(true);
		} else {
		    System.out.println("Ja me devolveram: " + titulo);
		}
		
	}
	
	public void infoLivros() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Autor(a): " + autor);
		System.out.println("Disponivel: " + disponivel);
	}
	
}
