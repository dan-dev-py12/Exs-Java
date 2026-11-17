package ex9;

public class PagamentoCartao extends Pagamento implements Descontavel {

	public PagamentoCartao(double valor, String codigoTransacao) {
		super(valor,codigoTransacao);
	}
	
	@Override
	public double calcularDesconto() {
		return 0.03 * getValor();
	}
	
	@Override
	public  void processarPagamento() {
		System.out.println("Pagamento via Cartão foi realizado: ");
		
	}
	
	public double valorFinalPagamento() {
		return getValor() - calcularDesconto();
	}
	
}
