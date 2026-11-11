package terceiro;

import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		
		
		var scanner = new Scanner(System.in);
		
		System.out.println("Digite sua altura em 'M' ");
		float altura = scanner.nextFloat();
		System.out.println("Digte seu peso em KG");
		float peso = scanner.nextFloat();
		double IMC = peso/(altura * altura);
		
		System.out.println("Seu indice de massa corporea é: " + IMC);
		if (IMC <= 18.5) {
			System.out.println("Abaixo do peso");
			
		}
		if (IMC >= 18.6 && IMC <=24.9) {
			System.out.println("Peso ideal");
			
		}
		if (IMC >= 25 && IMC <=29.9) {
			System.out.println("Levemente acima do peso");
			
		}
		if (IMC >= 30.0 && IMC <=34.0) {
			System.out.println("Obesidade grau 1");
			
		}
		if (IMC >= 35.0 && IMC <=39.9) {
			System.out.println("Obesidade grau 2 (severa)");
			
		}
		
		if (IMC >= 40) {
			System.out.println("Obesidade morbida");
			
		}
		

	}

}
