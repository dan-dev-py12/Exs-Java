package sexto;

public class FuncionarioCLT extends Funcionario implements Bonificacao{
	
	private double salarioFixo = 1621.70;
	
	public FuncionarioCLT(String nome, int matricula) {
		super(nome,matricula);
	}
	
	@Override
	public double calcularBonus() {
		
		return salarioFixo * 0.10;
	}
	
	@Override
	public double calcularSalario() {
		
		return salarioFixo + calcularBonus();
	}

}
