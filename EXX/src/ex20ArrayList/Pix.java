package ex20ArrayList;

public class Pix extends Transacao implements Pagamento {

    public Pix(int codigo, double saldo) {
        super(codigo, saldo);
    }

    @Override
    public void validarTransacao() {
        System.out.println("Pix validado!");
    }

    @Override
    public double realizarPagamento(double valor) {

        if (valor <= 0 || valor > getSaldo()) {
            System.out.println("Saldo insuficiente!");
            return 0;
        }

        setSaldo(getSaldo() - valor);

        System.out.println("Pagamento via Pix realizado!");

        return valor;
    }

    @Override
    public void cancelarPagamento() {
        System.out.println("Cancelando Pix...");
    }
}