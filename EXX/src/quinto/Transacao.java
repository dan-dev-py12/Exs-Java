package quinto;

public abstract class Transacao {
	
	
	private double valor;
	private int codigo;
	
	
	public Transacao(double valor, int codigo) {
		this.valor = valor;
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	public abstract boolean validarTransacao();
	
	public double exibirValor() {
		return valor;
	}
	

}
