package quinto;

public class Pix extends Transacao implements Pagamento {
	
	String chavePix;
	
	public Pix(double valor, int codigo) {
		super(valor,codigo);
	}
	
	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	
	public String getChavePix() {
		return chavePix;
	}
	
	
	
	@Override
	public void cancelarPagamento() {
		System.out.println("Pagamento Cancelado, chave pix incorreta");
	}
	
	public boolean validarTransacao() {
		
		if (chavePix == " " || chavePix ==null) {
			return false;
		}
		return true;
	}
	
	public void realizarPagamento(double valor) {
		
		setValor(valor);
		
		if (validarTransacao()) {
			System.out.println("Pagamento realizado com sucesso, chave PIX valida!");
			
		}else {
			System.out.println("Chave PIX invalida. Pagamento não realizado!");
		}
		
		
	}

}
