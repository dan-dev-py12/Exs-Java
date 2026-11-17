package ex9;

public abstract class Pagamento {

	private double valor;
	private String codigoTransacao;
	
	
	public Pagamento(double valor, String codigoTransacao) {
		this.valor = valor;
		this.codigoTransacao = codigoTransacao;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		if(valor < 0 || valor == 0) {
			System.out.println("Não é permitido inserir valores negativos ou igual a zero");
		}else {
			this.valor = valor;
		}
	}

	
	public String getCodigoTransacao() {
		return codigoTransacao;
	}
	
	public void setCodigoTransacao(String codigoTransacao) {
		if (codigoTransacao == null) {
			System.out.println("O codigo da transação não pode estar vazio");
		}else {
			this.codigoTransacao = codigoTransacao;
		}
		
	}
	
	public abstract void processarPagamento();
	
	public void exibirResumo() {
		System.out.println("Valor: " + valor);
		System.out.println("Codiso da Transação: " + codigoTransacao);
	}
	
	
	
}
