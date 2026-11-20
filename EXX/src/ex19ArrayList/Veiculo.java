package ex19ArrayList;

public abstract class Veiculo {

	private String modelo;
	private double consumo;
	
	public Veiculo(String modelo,double consumo) {
		this.modelo = modelo;
		this.consumo = consumo;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo =modelo;
	}
	
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	
	public abstract double calcularConsumo();
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Consumo: " + consumo);
		System.out.println("Consumo calculado: " + calcularConsumo());
	}
	
	
	
}
