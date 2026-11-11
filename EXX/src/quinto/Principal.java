package quinto;

public class Principal {

	public static void main(String[] args) {
		
		
		CartaoCredito P1 = new CartaoCredito(0,01);
		P1.setLimite(500);
		P1.realizarPagamento(1000);
		double limite = P1.getLimite();
		System.out.println(limite);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		Pix P2 = new Pix(1000,02);
		P2.setChavePix("111222333");
		String chave = P2.getChavePix();
		System.out.println("CHAVE PIX: " + chave);
		P2.realizarPagamento(500);
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=");
		 
		
		Boleto P3 = new Boleto(1000,03);
		P3.setCodigoBarras("1000-002-3003-04");
		String codigoDeBarras = P3.getCodigoBarras();
		
		System.out.println("Codigo de barras do boleto: " + codigoDeBarras);
		P3.realizarPagamento(100);
		

	}

}
