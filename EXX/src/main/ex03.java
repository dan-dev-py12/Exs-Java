package main;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
				
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += altura[i];
		}
		double mediaAltura = soma / n;
		System.out.println(" ");
		System.out.printf("Altura media das Alturas: %.2f%n", mediaAltura);
		
		int cont = 0;
		for(int i=0; i <n; i++) {
			if (idade[i] < 16) {
				cont = cont + 1;
			}
		}
		
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 ano: %.1f%%%n", percent);
		
		for(int i=0; i<n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
