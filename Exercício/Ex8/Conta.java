package br.inatel.conta;

import br.inatel.excecoes.SaldoInsuficiente;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficiente{
        if(valor <= saldo){
            saldo -= valor;
        }else{
            throw new SaldoInsuficiente("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
