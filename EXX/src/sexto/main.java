package sexto;

public class main {

	public static void main(String[] args) {
		
		
		FuncionarioCLT F1 = new FuncionarioCLT("Marcelo", 01);
		FuncionarioPJ F2 = new FuncionarioPJ("Vitor", 02);
		
		F2.setQuantidadeProjetos(8);
		double sal2 = F2.calcularSalario();
		
		double sal1 =F1.calcularSalario();
		
		System.out.println(sal1);
		System.out.println(sal2);
		

	}

}
