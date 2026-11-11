package segundo;

public abstract class Funcionario {

	private String nome;
	private double salario;
	private int maricula;
	
	
	public Funcionario(String nome, double salario, int maricula) {
		this.nome = nome;
		this.salario = salario;
		this.maricula = maricula;
	}
	
	public abstract double calcularSalario();

		


	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getMaricula() {
		return maricula;
	}
	
	public void setMaricula(int maricula) {
		this.maricula = maricula;
	}

	
}
