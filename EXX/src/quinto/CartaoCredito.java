package quinto;

public class CartaoCredito extends Transacao implements Pagamento {

	private double limite = 1000;
	
	public double getLimite() {
		return limite;
	}

	
	public void setLimite(double limite) {
		this.limite = limite;
	}



	public CartaoCredito(double valor, int codigo) {
		super(valor,codigo);

	}
	
	@Override
	public  boolean validarTransacao() {
		
		if (getValor() > limite) {
			return false;
		}
		return true;
		
	}
	
	
	public void cancelarPagamento() {
		System.out.println("Pagamento Cancelado!");
	}
	
	public void realizarPagamento(double valor) {
		
		setValor(valor);
		
		if (validarTransacao()) {
			System.out.println("Pagamento ralizado com sucesso!");
			limite -= valor;
		} else {
			System.out.println("Você nao tem limite sufuciente para ralizar o Pagamento");
			cancelarPagamento();
		}
		
		
		
	}

	
}
