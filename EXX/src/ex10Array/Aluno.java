package ex10Array;

public class Aluno {

	String nome;
	double nota;
	
	public Aluno(String nome,double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public void info() {
		System.out.println("Nome: " + nome);
		System.out.println("Nota: " + nota);
	}
}
