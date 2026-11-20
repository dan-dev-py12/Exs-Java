package ex19ArrayList;

public class Moto extends Veiculo {

	private int cilindradas;
	
	
	public Moto(String modelo,double consumo) {
		super(modelo,consumo);
	}
	
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	public double calcularConsumo() {
		return getConsumo() * 0.7;
	}
	
	
	
}
