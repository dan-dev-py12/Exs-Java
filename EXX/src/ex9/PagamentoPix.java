package ex9;

public class PagamentoPix extends Pagamento implements Descontavel {

	public PagamentoPix(double valor, String codigoTransacao) {
		super(valor,codigoTransacao);
	}
	
	@Override
	public double calcularDesconto() {
		return 0.10 * getValor();
	}
	
	@Override
	public  void processarPagamento() {
		System.out.println("Pagamento via Pix efetuado");
		
		
	}
	
	public double valorFinalPagamento() {
		return getValor() - calcularDesconto();
	}	
	
}
