package setimo;

public class ContaCorrente extends ContaBancaria implements Tributavel {

	public ContaCorrente(int numeroConta, String titular, double saldo) {
		super(numeroConta,titular,saldo);
	}
	
	
	@Override
	public void sacar(double valor) {
	    if (valor > 0 && valor <= getSaldo()) {
	        alterarSaldo(-valor);
	        System.out.println("Saque realizado!");
	    } else {
	        System.out.println("Saldo insuficiente!");
	    }
	}
	
	@Override
	
	public double calcularTaxa() {
		return (getSaldo() * 0.02);
	}

}
