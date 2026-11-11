package terceiro;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 10: ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=10; i++ ) {
			System.out.println(num + " x "+ i +" = "+ (num*i));
		}
		

	}

}
