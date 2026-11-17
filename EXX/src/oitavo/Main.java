package oitavo;

public class Main {

	public static void main(String[] args) {

		/*
		Type cast
		Veiculo V1 = new Moto("Honda", "CD 500", 2026);
		((Moto)V1).realizarManutencao();
		
		 */
		
		Carro V1 = new Carro("BYD","Dolphin mini", 2026);
		Moto V2 = new Moto("Honda","Hornet 650r", 2024);
		Caminhao V3 = new Caminhao("Scania","Scania 2000",2025);
		
		
		V1.exibirdados();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		V2.exibirdados();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		V3.exibirdados();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		V1.realizarManutencao();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
		V2.realizarManutencao();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
		V3.realizarManutencao();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
		
		V1.calcularCustoManutencao();
		V1.calcularDesconto();
		V2.calcularCustoManutencao();
		V2.calcularDesconto();
		V3.calcularCustoManutencao();
		V3.calcularDesconto();
		
		double CustoComDesconto1 = V1.getCustoComDesconto();
		double CustoComDesconto2 = V2.getCustoComDesconto();
		double CustoComDesconto3 = V3.getCustoComDesconto();
		System.out.println("Manutenção do carro com desconto: " + CustoComDesconto1);
		System.out.println("Manutenção do moto com desconto: " + CustoComDesconto2);
		System.out.println("Manutenção do caminhão com desconto: " + CustoComDesconto3);
		
		
		
	}

}

