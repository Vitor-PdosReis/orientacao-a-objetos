/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.orientacaoaobjetos.exercicio16;


import com.orientacaoaobjetos.exercicio16.classes.Aeroporto;
import com.orientacaoaobjetos.exercicio16.classes.Passageiro;
import com.orientacaoaobjetos.exercicio16.classes.Voo;

/**
 *
 * @author Vitor
 */
public class Exercicio16 {

    public static void main(String[] args) {

        Aeroporto aeroporto = new Aeroporto("Aeroporto Internacional de Brasília", "Brasilia");

        Voo voo1 = new Voo(123, "Nova York", 100);

        Passageiro passageiro1 = new Passageiro("João Silva", "12345678900");

        // Adicionando escalas ao voo
        voo1.addEscala("Miami");
        voo1.addEscala("Orlando");
        
        aeroporto.addVoo(voo1);

        voo1.addPassageiro(passageiro1);

        // Passageiro acumula pontos após completar um voo
        passageiro1.getFidelidade().adicionarPontos(500);

        // Iniciar voo
        aeroporto.iniciarVoo(123, "decolando");

        // Verificar voos com prejuízo
        System.out.println("Voos com prejuízo:");

        aeroporto.calculaVooComPrejuizo();

    }
}