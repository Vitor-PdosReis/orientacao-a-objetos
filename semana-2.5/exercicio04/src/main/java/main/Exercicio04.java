/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import classes.Tecnico;
import classes.Time;

/**
 *
 * @author Vitor
 */
public class Exercicio04 {

    public static void main(String[] args) {
       // Cria técnicos
    Tecnico t1 = new Tecnico("Dorival Júnior", "Brasileiro", 1962);
    Tecnico t2 = new Tecnico("Abel Ferreira", "Português", 1978);

    // Cria times e escala técnicos
    Time time1 = new Time("Flamengo", "Rio de Janeiro", 1895);
    time1.escalarTecnico(t1);

    Time time2 = new Time("Palmeiras", "São Paulo", 1914);
    time2.escalarTecnico(t2);

    System.out.println(time1);
    System.out.println(time2);

    // Troca o técnico do time1
    Tecnico t3 = new Tecnico("Tite", "Brasileiro", 1961);
    time1.escalarTecnico(t3);

    // time2 não deve ser afetado
    System.out.println("Após a troca:");
    System.out.println(time1);
    System.out.println(time2);
    }
}
