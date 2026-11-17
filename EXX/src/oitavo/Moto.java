package oitavo;

public class Moto extends Veiculo implements Manutencao {

	private double custoComDesconto = calcularDesconto();
	
	
	public double getCustoComDesconto() {
		return custoComDesconto;
	}
	
	public Moto(String marca, String modelo, int ano) {
		super(marca,modelo,ano);
	}

	@Override
	public void realizarManutencao() {
		System.out.println("A moto esta em manutenção");
	}
	
	@Override
	public double calcularCustoManutencao(){
		
		return 250.00;
		
	}
	
	@Override
	public double calcularDesconto(){
		return 250 - (0.05 * 250);
	}
	

}