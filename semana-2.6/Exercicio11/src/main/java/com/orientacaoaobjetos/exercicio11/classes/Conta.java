/*
 1. Classe `Conta`:
    - Atributos: número da conta, titular da conta, saldo atual.
    - Métodos: construtores, getters e setters, toString, métodos para depositar e sacar, atualizar saldo após transações.
*/
package com.orientacaoaobjetos.exercicio11.classes;

import java.util.Objects;

/**
 *
 * @author Vitor
 */
public class Conta {

    private String numero;
    private String titular;
    private double saldo;

    public Conta() {
        this.numero = "";
        this.titular = "";
        this.saldo = 0.0;
    }

    public Conta(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void copiar(Conta outro) {
        this.numero = outro.getNumero();
        this.titular = outro.getTitular();
        this.saldo = outro.getSaldo();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                "}\n";
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            this.saldo += deposito;
        }
    }

    public double sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return 0;
        } else if (valor > 0) {
            this.saldo -= valor;
        }
        return valor;
    }

    public boolean transferencia(double valorTransferido, Conta aTransferir) {
        double valorSacado = sacar(valorTransferido);
        if (valorSacado >0) {
            aTransferir.depositar(valorSacado);
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        final Conta other = (Conta) obj;

        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return Objects.equals(this.titular, other.titular);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}