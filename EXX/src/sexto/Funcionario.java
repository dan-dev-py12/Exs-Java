package sexto;

public abstract class Funcionario {
	
	private String nome;
	private int matricula;
	
	public Funcionario(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	public abstract double calcularSalario();
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
	}
	

	
}
