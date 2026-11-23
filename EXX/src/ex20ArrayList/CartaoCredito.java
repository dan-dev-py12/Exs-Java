package ex20ArrayList;

public class CartaoCredito extends Transacao implements Pagamento {

    public CartaoCredito(int codigo, double saldo) {
        super(codigo, saldo);
    }

    @Override
    public void validarTransacao() {
        System.out.println("Cartão validado!");
    }

    @Override
    public double realizarPagamento(double valor) {

        if (valor <= 0 || valor > getSaldo()) {
            System.out.println("Limite insuficiente!");
            return 0;
        }

        setSaldo(getSaldo() - valor);

        System.out.println("Pagamento via cartão realizado!");

        return valor;
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando pagamento no cartão...");
    }
}