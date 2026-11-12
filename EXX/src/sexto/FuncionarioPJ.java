package sexto;

public class FuncionarioPJ extends Funcionario implements Bonificacao {

	private int valorPorProjeto = 400;
	private int quantidadeProjetos;
	private double salario = calcularSalario();
	
	
	public FuncionarioPJ(String nome, int matricula) {
		super(nome,matricula);
	}
	
	public int getValorPorProjeto() {
		return valorPorProjeto;
	}
	
	public int getQuantidadeProjetos() {
		return quantidadeProjetos;
	}
	
	public void setQuantidadeProjetos(int projetos) {
		this.quantidadeProjetos = projetos;
	}
	
	@Override
	public double calcularBonus() {
		System.out.println("Bonus é 5% do salario");
		return salario * 0.05;
	}
	
	@Override
	public double calcularSalario() {
		System.out.println("Salario PJ: valor por porjeto multiplicado pela quantidade e a bonificação: ");
		return (valorPorProjeto * quantidadeProjetos) + calcularBonus();
		
	}
	
}
