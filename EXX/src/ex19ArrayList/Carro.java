package ex19ArrayList;

public class Carro extends Veiculo{

	private int cavalos;
	
	public Carro(String modelo,double consumo) {
		super(modelo,consumo);
	}
	
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	
	@Override
	public double calcularConsumo() {
		return getConsumo() * 1.0;
	}
	

	
	
}
