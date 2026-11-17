package ex9;

public class PagamentoBoleto extends Pagamento {
	
	public PagamentoBoleto(double valor, String codigoTransacao) {
		super(valor,codigoTransacao);
	}
	
	@Override
	public  void processarPagamento() {
		System.out.println("O boleto foi gerado");
		
	}

}
