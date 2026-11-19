package ex14Array;

public class Moto extends Veiculo {

	private double consumoPorKm;
	
	public double getConsumoPorKm() {
		return consumoPorKm;
	}
	
	public Moto(String marca, String modelo, double consumoPorKm) {
		super(marca,modelo);
		this.consumoPorKm = consumoPorKm;
	}
	
	@Override
	public double calcularConsumo() {
		return getConsumoPorKm();
	}
	
}
