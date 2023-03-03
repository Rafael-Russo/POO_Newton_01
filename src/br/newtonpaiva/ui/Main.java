package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.Conta;

public class Main {
    public static void main(String[] args) {
        Conta c = new Conta(10);
//        c.setNumero(10);
        c.setSaldo(100.0);

        c.depositar(50.0);
//        c.depositar(-20.0);

        Conta c2 = new Conta(90);
//        c2.setNumero(90);
        c2.setSaldo(500.0);

        Conta c3 = new Conta(0);
        if (c.equals(c2)){
            System.out.println("Conta ja criada");
        }else {
            System.out.println("Contas diferentes");
        }

        System.out.println(
                "numero conta c: " + c.getNumero() + "\n" +
                        "saldo conta c: " + c.getSaldo() + "\n" +
                        "numero conta c2: " + c2.getNumero() + "\n" +
                        "saldo conta c2: " + c2.getSaldo() + "\n" +
                        "numero conta c3: " + c3.getNumero() + "\n" +
                        "saldo conta c3: " + c3.getSaldo()
        );
    }
}
