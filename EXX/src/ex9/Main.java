package ex9;

public class Main {

	public static void main(String[] args) {
		
		Pagamento P1 = new PagamentoPix(5000,"1024");
		Pagamento P2 = new PagamentoCartao(2000,"1025");
		
		((PagamentoCartao)(P2)).processarPagamento();
		((PagamentoPix)(P1)).processarPagamento();
		
		((PagamentoCartao)(P2)).calcularDesconto();
		((PagamentoPix)(P1)).calcularDesconto();
		
		double valorPix = ((PagamentoPix)(P1)).valorFinalPagamento();
		double valorCartao = ((PagamentoCartao)(P2)).valorFinalPagamento();
		
		System.out.println("Valor final Pix: " + valorPix);
		System.out.println("Valor final Cartão: " + valorCartao);
		
		/*
		PagamentoPix P1 = new PagamentoPix(1000,"1021");
		PagamentoCartao P2 = new PagamentoCartao(1000,"1022");
		PagamentoBoleto P3 = new PagamentoBoleto(1000,"1023");
		
		P1.exibirResumo();
		P2.exibirResumo();
		P3.exibirResumo();
		
		P1.processarPagamento();
		P2.processarPagamento();
		P3.processarPagamento();
		
		P1.calcularDesconto();
		P2.calcularDesconto();
		
		
		double valorPix = P1.valorFinalPagamento();
		double valorCartao = P2.valorFinalPagamento();
		
		System.out.println("Valor final Pix: " + valorPix);
		System.out.println("Valor final Cartão: " + valorCartao);
		
		*/
		
		/*1. 


Desafio extra — Polimorfismo
Utilize referências do tipo Pagamento para instanciar os três tipos de pagamento.

Lembre-se: calcularDesconto() não estará disponível diretamente na referência Pagamento, pois pertence à interface Descontavel.

Uma dica: não tente resolver tudo de uma vez. Comece pela classe abstrata Pagamento e me envie seu código para revisarmos.

Quero ver se você consegue aplicar sozinho os conceitos que trabalhamos nos três exercícios anteriores!





qual*/

	}

}
