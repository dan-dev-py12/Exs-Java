package setimo;

public abstract class ContaBancaria {

	
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numeroConta,String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
		
	}
	
	public int getNumeroConta() {
		return numeroConta;
		
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	protected void alterarSaldo(double valor) {
	    saldo += valor;
	}
	
	public abstract void sacar(double valor);
	
	public double consultarSaldo() {
		System.out.println("Saldo na conta: ");
		return saldo;
	}
	
	
}
