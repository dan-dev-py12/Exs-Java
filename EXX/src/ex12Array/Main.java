package ex12Array;

public class Main {

	public static void main(String[] args) {
		
		Funcionario[] funcionarios = {new Funcionario("Daniel",10000),
									  new Funcionario("Jose",5000),
									  new Funcionario("Marcelo",4000),
									  new Funcionario("Julia",5500),
									  new Funcionario("Eduarda",80000)
				
		};
		
		double salarios = 0;
		double maiorSalario = funcionarios[0].getSalario();;
		String nomeMaiorSalario = funcionarios[0].getNome();
		
		
		for(Funcionario funcionario : funcionarios) {
			funcionario.exibirInformacoes();
			salarios += funcionario.getSalario();
			if (funcionario.getSalario() > maiorSalario) {
				maiorSalario = funcionario.getSalario();
				nomeMaiorSalario = funcionario.getNome();
			}
			System.out.println("-=-=-=-=-=-=-=-=");
			
		}
		System.out.println("Soma do salario de geral: " + salarios);
		System.out.println("=-=-=-=-=-=-=-=-=-=");
		System.out.println("Maior Salario: " + maiorSalario);
		System.out.println("Nome do portador(a) do maior salario: " + nomeMaiorSalario);
		System.out.println("=-=-=-=-=-=-=-=-=-=");
	
		double mediaSalarial = salarios / funcionarios.length;
		System.out.println("Media salarial: " + mediaSalarial);
		


	}

}
