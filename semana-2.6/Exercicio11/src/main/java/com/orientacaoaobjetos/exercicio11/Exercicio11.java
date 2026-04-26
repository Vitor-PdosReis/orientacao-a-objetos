/*
 *
 */

package com.orientacaoaobjetos.exercicio11;

import com.orientacaoaobjetos.exercicio11.classes.Banco;
import com.orientacaoaobjetos.exercicio11.classes.Conta;
import com.orientacaoaobjetos.exercicio11.classes.Transacao;

/**
 *
 * @author Vitor
 */
public class Exercicio11 {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco Digital");

        Conta conta1 = new Conta("123", "Ana", 500.0);
        Conta conta2 = new Conta("456", "Carlos", -150.0);
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        Transacao transacao1 = new Transacao("T001", "Depósito", 300.0, "2023-03-15", conta1);
        banco.adicionarTransacao(transacao1);

        System.out.println("Conta com maior saldo: " + banco.contaMaiorSaldo().getTitular());
        System.out.println("Conta com menor saldo (maior devedor): " + banco.contaMenorSaldo().getTitular());
        System.out.println("Total de devedores do banco: " + banco.totalDevedores());
        System.out.println("Total de credores do banco: " + banco.totalCredores());
    }
}
