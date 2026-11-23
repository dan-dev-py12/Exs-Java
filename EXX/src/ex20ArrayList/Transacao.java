package ex20ArrayList;

public abstract class Transacao {

    private int codigo;
    private double valor;
    private double saldo;

    public Transacao(int codigo, double saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void validarTransacao();

}
