package oitavo;

public class Caminhao extends Veiculo implements Manutencao {


	private double custoComDesconto = calcularDesconto();
	
	public double getCustoComDesconto() {
		return custoComDesconto;
	}
	
	public Caminhao(String marca, String modelo, int ano) {
		super(marca,modelo,ano);
	}
	
	@Override
	public void realizarManutencao() {
		System.out.println("Caminhão esta em manutenção");
	}
	
	@Override
	public double calcularCustoManutencao() {
		return 1500;
	}
	
	@Override
	public double calcularDesconto() {
		return 1500 - (0.15 * 1500);
	}
	



}
