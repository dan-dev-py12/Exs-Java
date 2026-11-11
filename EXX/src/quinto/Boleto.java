package quinto;

public class Boleto extends Transacao implements Pagamento {

	
	String codigoBarras;
	
	
	public Boleto(double valor, int codigo) {
		super(valor, codigo);
	}
	
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public String getCodigoBarras() {
		return codigoBarras;
	}
	
	@Override
	public boolean validarTransacao() {
		
		if (codigoBarras == " " || codigoBarras == null) {
			return false;
		}
		return true;
		
	}
	
	public void cancelarPagamento() {
		System.out.println("Boleto Cancelado!");
	}
	
	public void realizarPagamento(double valor) {
		
		setValor(valor);
		
		if (validarTransacao()) {
			System.out.println("Boleto gerado!");
		}else {
			System.out.println("Boleto não pode ser gerado! codigo de barras invalido!");
			cancelarPagamento();
				
			
		}

		
	}
	
	
	
	
	
}
