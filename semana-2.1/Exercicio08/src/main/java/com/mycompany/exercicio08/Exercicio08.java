package com.mycompany.exercicio08;

/**
 *
 * @author vitor
 */
public class Exercicio08 {

    public static void main(String[] args) {
        
        Musica musica = new Musica();
        
        musica.fill();
        System.out.println(musica.toString());
        
        musica.tocarMusica();
        musica.desligarMusica();
        
    }
}
