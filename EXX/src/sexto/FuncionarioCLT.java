package sexto;

public class FuncionarioCLT extends Funcionario implements Bonificacao{
	
	private double salarioFixo = 1621.70;
	
	public FuncionarioCLT(String nome, int matricula) {
		super(nome,matricula);
	}
	
	@Override
	public double calcularBonus() {
		System.out.println("Bonus de 10% do salario fixo");
		return salarioFixo * 0.10;
	}
	
	@Override
	public double calcularSalario() {
		System.out.println("Salario CLT: valor fixo e a bonificação: ");
		return salarioFixo + calcularBonus();
	}

}
