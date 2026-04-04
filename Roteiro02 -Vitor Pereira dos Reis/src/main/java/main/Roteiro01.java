/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import classes.Ponto;
import classes.Quadrado;
import classes.Triangulo;

/**
 *
 * @author Vitor
 */
public class Roteiro01 {

    public static void main(String[] args) {
        Ponto ptoA = new Ponto(4, 7);        
        Ponto ptoB = new Ponto(7,9);        
        Ponto ptoC = new Ponto(5,6);
        
        Triangulo triangulo = new Triangulo(ptoA, ptoB, ptoC);
        
        System.out.println("A distancia entre A e B: "+ triangulo.distancia(ptoA, ptoB));
        System.out.println("A distancia entre A e C: "+ triangulo.distancia(ptoA, ptoC));
        System.out.println("A distancia entre B e C: "+ triangulo.distancia(ptoB, ptoC));
        
        System.out.println("Área do triagulo é: "+ triangulo.area());
        
        Ponto q1 = new Ponto(0, 0);
        Ponto q2 = new Ponto(0, 2);
        Ponto q3 = new Ponto(2, 2);
        Ponto q4 = new Ponto(2, 0);
        
        Quadrado quadrado = new Quadrado(q1, q2, q3, q4);
        
        System.out.println("\n=== QUADRADO ===");
        System.out.println(quadrado);
        System.out.println("É quadrado? " + quadrado.tipo());
        
        if (quadrado.isQuadrado()) {
            System.out.println("Lado: " + quadrado.lado());
            System.out.println("Perímetro: " + quadrado.perimetro());
            System.out.println("Área: " + quadrado.area());
        }
    }
}


