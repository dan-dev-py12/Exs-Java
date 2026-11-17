package oitavo;

public class Carro extends Veiculo implements Manutencao{

	private double custoComDesconto = calcularDesconto();
	
	public double getCustoComDesconto() {
		return custoComDesconto;
	}
	
	public Carro(String marca, String modelo, int ano) {
		super(marca,modelo,ano);	
	}
	
	@Override
	public double calcularCustoManutencao() {
		return 500.00;
	}
	@Override
	public void realizarManutencao() {
		System.out.println("Carro esta em manutenção");
		
	}
	
	@Override
	public double calcularDesconto() {
		return 500 - (0.1 * 500);
	}
	


}

