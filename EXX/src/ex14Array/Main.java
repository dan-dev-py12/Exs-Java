package ex14Array;

public class Main {

	public static void main(String[] args) {
		
		Veiculo[] veiculos = {new Carro("Honda","Civic",10),
							  new Carro("Ferrari","fusca Azul",2),
							  new Moto("Honda","CD650f",9),
							  new Moto("Bajaj","Dominar400",10)
				
		};

	
		
	
	double menorConsumo = veiculos[0].calcularConsumo();
	String veiculoNome = veiculos[0].getModelo();
	double consumo;
		
		
		
	for(Veiculo veiculo : veiculos) {
		consumo = veiculo.calcularConsumo();
		veiculo.info();
		System.out.println("Consumo em L a cada 100km: " + consumo);
		if(veiculo.calcularConsumo() < menorConsumo) {
			menorConsumo = veiculo.calcularConsumo();
			veiculoNome = veiculo.getModelo();
		}
		System.out.println("==-=-=-=-=-=");
	}
	System.out.println("Menor Consumo: " + menorConsumo);
	System.out.println("Veículo mais econômico: " + veiculoNome);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
