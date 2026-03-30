/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.exercicio02;

import classes.Livro;

/**
 *
 * @author Vitor
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", "J.K. Rowling", 4100);
        Livro livro2 = new Livro("One piece", "Oda", 10000);
        Livro livro3 = new Livro("Percy Jackson", "Rick Riordan", 392);
        
        System.out.print("O nome da biblioteca é: ");
        System.out.println(Livro.NomeDaBiblioteca);
        
        livro3.AlterarBiblioteca("Biblioteca Central");
        System.out.print("Novo nome da biblioteca é: ");
        System.out.println(Livro.NomeDaBiblioteca);

    }
}
//        Explique porque o nome da biblioteca muda em todas as instancias:
// Acontece devido ao atributo NomeDaBiblioteca ser estatico, fazendo com que sempre que ele é modificado, altere em todas as demais instancias.
