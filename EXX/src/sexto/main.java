package sexto;

public class main {

	public static void main(String[] args) {
		
		
		FuncionarioCLT F1 = new FuncionarioCLT("Marcelo", 01);
		FuncionarioPJ F2 = new FuncionarioPJ("Vitor", 02);
		
		F2.setQuantidadeProjetos(8);
		double sal1 =F1.calcularSalario();
		double sal2 = F2.salarioTotal();
		
		
		
		F1.exibirDados();
		System.out.printf("Salário CLT: R$ %.2f%n", sal1);
		F2.exibirDados();
		System.out.printf("Salário PJ: R$ %.2f%n", sal2);
		

	}

}
