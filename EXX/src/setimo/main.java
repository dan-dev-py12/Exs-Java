package setimo;

public class main {

	public static void main(String[] args) {
		
		
		ContaCorrente C1 = new ContaCorrente(1001,"Daniel",1000);
		ContaPoupanca C2 = new ContaPoupanca(1002,"Vitor",2000);
		
		
		C1.depositar(960);
		
		/*
		C2.sacar(20000);
		C1.sacar(10000);
		*/
		
		double saldo_Corrente_Taxa = C1.calcularTaxa();
		
		double saldo_Corrente = C1.getSaldo();
		double saldo_Poupanca = C2.getSaldo();
		
		System.out.printf("Saldo conta corrente: R$ %.2f%n", saldo_Corrente);
		System.out.printf("Taxa da conta corrente: R$ %.2f%n",saldo_Corrente_Taxa);
		System.out.printf("Saldo conta poupanca: R$ %.2f%n",saldo_Poupanca);
		
	}

}
