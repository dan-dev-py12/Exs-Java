package segundo;

public class Desenvolvedor extends Funcionario {
	int horasExtras;
	
	public Desenvolvedor (String nome, double salario, int matricula) {
		super(nome,salario,matricula);
	}
	
	public int getHorasExtras() {
		return horasExtras;	
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	@Override
	public double calcularSalario() {
		return getSalario() + (getHorasExtras()*30);
	}

	
}
