package segundo;

public class Gerente extends Funcionario {

	private double bonus;
	
	

	public Gerente (String nome, double salario, int matricula) {
		super(nome,salario,matricula);
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	@Override
	public double calcularSalario() {
		return getSalario() + getBonus();
		
	}

	
}
