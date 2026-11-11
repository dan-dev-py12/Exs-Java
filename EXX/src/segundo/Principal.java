package segundo;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario F1 = new Gerente("Vitor",3000,100);
		Funcionario F2 = new Desenvolvedor("Daniel", 7000,101);
		F2.setNome("Daniel Vitor");
		String nomedev = F2.getNome();
		F1.setNome("Vitor Silva");
		
		((Gerente)F1).setBonus(800);
		((Desenvolvedor)F2).setHorasExtras(60);
		
		double salarioDev = F2.calcularSalario();
		double salarioGerente = F1.calcularSalario();
		
		System.out.println("Nomde do Desenvolvedor: " + nomedev);
		System.out.println("Salario do Desenvlvedor: " + salarioDev);
		System.out.println("Horas extras do dev: " + ((Desenvolvedor)F2).getHorasExtras());
		System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Nome do Gerente: " + F1.getNome());
		System.out.println("Salario do Gerente: " + salarioGerente);
		System.out.println("Bonus do Gerente: " + ((Gerente)F1).getBonus());

	}

}
