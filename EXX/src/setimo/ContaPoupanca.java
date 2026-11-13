package setimo;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(int numeroConta, String titular, double saldo) {
		super(numeroConta,titular,saldo);
	}
	

	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= getSaldo()) {
			alterarSaldo(-valor);
			System.out.println("Saque realizado!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	

}
