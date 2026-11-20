package ex19ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		veiculos.add(new Carro("Civic",10));
		veiculos.add(new Carro("Fiesta",22));
		veiculos.add(new Carro("Fusca",4));
		
		veiculos.add(new Moto("CB300",6));
		veiculos.add(new Moto("Jet50c",5));
		veiculos.add(new Moto("Bros",7));
		
		double somaDoConsumoVeiculos = 0;
		double maiorConsumo = veiculos.get(0).calcularConsumo();
		String veiculoMaiorConsumo = veiculos.get(0).getModelo();
		
		
		for(Veiculo veiculo : veiculos) {
			veiculo.exibirInformacoes();
			somaDoConsumoVeiculos += veiculo.calcularConsumo();
			if (veiculo.calcularConsumo() > maiorConsumo) {
				maiorConsumo = veiculo.calcularConsumo();
				veiculoMaiorConsumo = veiculo.getModelo();
			}
			System.out.println("--------------------------");
		}
		
		
		double mediaConsumo = somaDoConsumoVeiculos / veiculos.size();
		System.out.println("Media do Consumo dos veiculos: " + mediaConsumo);
		System.out.println("-------------------------------");
		System.out.println("Veiculo com maior consumo:");
		System.out.println("Modelo do veiculo: " + veiculoMaiorConsumo);
		System.out.println("Consumo : " + maiorConsumo);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n----------------------------------");
		System.out.println("Pesquise um  veiculo pelo modelo: ");
		String pesquisa = sc.nextLine();
		
		boolean encontrado  = false;
		
		for(Veiculo veiculo : veiculos) {
			if(veiculo.getModelo().equalsIgnoreCase(pesquisa)) {
				System.out.println("Encontrado:");
				veiculo.exibirInformacoes();
				encontrado = true;
				break;
			}
		}
		
		if(!encontrado) {
			System.out.println("Veiculo nao encontrado!");
		}
		
		sc.close();
		
		
		
		

	}

}



