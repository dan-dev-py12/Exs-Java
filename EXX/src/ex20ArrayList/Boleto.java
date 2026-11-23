package ex20ArrayList;

public class Boleto extends Transacao implements Pagamento {

    public Boleto(int codigo, double saldo) {
        super(codigo, saldo);
    }

    @Override
    public void validarTransacao() {
        System.out.println("Boleto validado!");
    }

    @Override
    public double realizarPagamento(double valor) {

        if (valor <= 0 || valor > getSaldo()) {
            System.out.println("Saldo insuficiente ou valor inválido!");
            return 0;
        }

        setSaldo(getSaldo() - valor);

        System.out.println("Pagamento via boleto realizado!");

        return valor;
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando boleto...");
    }
}