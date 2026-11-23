package ex20ArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Transacao> transacoes = new ArrayList<>();

        transacoes.add(new Boleto(101, 2000));
        transacoes.add(new CartaoCredito(1100, 4000));
        transacoes.add(new Pix(1111, 2000));

        double totalPagamentos = 0;

        for (Transacao transacao : transacoes) {

            transacao.validarTransacao();

            double pagamento = ((Pagamento) transacao).realizarPagamento(100);

            totalPagamentos += pagamento;

            System.out.println("Código: " + transacao.getCodigo());
            System.out.println("Saldo restante: " + transacao.getSaldo());

            System.out.println("-------------------------");
        }

        System.out.println("Total de pagamentos: R$ " + totalPagamentos);

    }
}