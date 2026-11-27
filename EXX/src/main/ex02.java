package main;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.print("Quantos numeros voce vai digitar: ");
		  int n = sc.nextInt();
		  float[] vec = new float[n];
		  
		  for(int i=0; i<n; i++) {
			  System.out.print("Digite um numeros: ");
			  vec[i] = sc.nextInt();
		  }
		  
		  System.out.print("VALORES = ");
		  for(int i=0; i<n; i++) {
			  System.out.printf("  " + vec[i]);
		  }

	}

}
