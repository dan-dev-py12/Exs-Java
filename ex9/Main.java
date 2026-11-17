package ex9;

public class Main {

	public static void main(String[] args) {
		/*1. Classe abstrata Pagamento
Atributos privados:
- valor (double)
- codigoTransacao (String)
Métodos:
- Construtor.
- Getters e setters (com validação para impedir valores negativos).
- Método abstrato processarPagamento().
- Método exibirResumo().
2. Interface Descontavel
Crie o método:
double calcularDesconto();


3. Classe PagamentoPix
Deve herdar de Pagamento e implementar Descontavel.

Regras:
- Desconto de 10%.
- Ao processar, exiba uma mensagem informando que o pagamento via Pix foi realizado.
4. Classe PagamentoCartao
Deve herdar de Pagamento e implementar Descontavel.

Regras:
- Desconto de 3%.
- Ao processar, exiba uma mensagem informando que o pagamento via cartão foi realizado.
5. Classe PagamentoBoleto
Deve herdar de Pagamento.

Regras:
- Não implementa Descontavel.
- Não possui desconto.
- Ao processar, exiba uma mensagem informando que o boleto foi gerado.
6. Classe Principal
Crie um objeto de cada tipo e:
1. Informe um valor e um código de transação para cada pagamento.
2. Exiba o resumo de cada pagamento.
3. Processe os três pagamentos.
4. Calcule o desconto do Pix e do cartão.
5. Exiba o valor final de cada pagamento.
Desafio extra — Polimorfismo
Utilize referências do tipo Pagamento para instanciar os três tipos de pagamento.

Lembre-se: calcularDesconto() não estará disponível diretamente na referência Pagamento, pois pertence à interface Descontavel.

Uma dica: não tente resolver tudo de uma vez. Comece pela classe abstrata Pagamento e me envie seu código para revisarmos.

Quero ver se você consegue aplicar sozinho os conceitos que trabalhamos nos três exercícios anteriores!

















qual*/

	}

}
