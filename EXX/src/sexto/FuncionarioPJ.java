package sexto;

public class FuncionarioPJ extends Funcionario implements Bonificacao {

	private int valorPorProjeto = 400;
	private int quantidadeProjetos;
	//private double salario = calcularSalario() + calcularBonus();
	
	

	
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
		
		return calcularSalario()* 0.05;
	}
	
	@Override
	public double calcularSalario() {
		
		return (valorPorProjeto * quantidadeProjetos);
		
	}
	
	public double salarioTotal() {
		return calcularSalario() + calcularBonus();
	}
	
}
