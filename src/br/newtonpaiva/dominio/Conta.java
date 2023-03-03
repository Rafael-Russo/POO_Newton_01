package br.newtonpaiva.dominio;

public class Conta {
    private Integer numero;
    private Double saldo;

    public Conta() {
        this.numero = null;
        this.saldo = null;
    }

    public Conta(Integer numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    //    sobrecarga de métodos
    public Conta(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double sacar(Double valor) {

        saldo -= valor;

        return saldo;
    }

    public Double depositar(Double valor) {

        saldo += valor;

        return saldo;
    }

    // Getter and Setter - Numero
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        if (numero == null || numero < 0)
            throw new IllegalArgumentException("Erro, número inválido");

        this.numero = numero;
    }

    // Getter and Setter - Saldo
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
