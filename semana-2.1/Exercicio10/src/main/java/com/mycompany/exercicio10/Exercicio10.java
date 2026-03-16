/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10;


public class Exercicio10 {

    public static void main(String[] args) {
        Casa casa1 = new Casa("Rua das flores, 123", 200, 3, 950000);
        Casa casa2 = new Casa("Av. Paulista, 456", 120, 2, 780000);
        Casa casa3 = new Casa("Rua do lago, 78", 350, 4, 1400000);
        
        Casa melhor = calculaMenorPreco(casa1, casa2);
        melhor = calculaMenorPreco(melhor, casa3);
        
        casa1.exibirResumo();
        casa2.exibirResumo();
        casa3.exibirResumo();
        
        System.out.println("Casa com menor preço por m²: " + melhor.getEndereco() + " - " + melhor.calcularPrecoPorM2());
        
 
    }
    static Casa calculaMenorPreco(Casa casaA, Casa casaB){
      if (casaA.calcularPrecoPorM2() > casaB.calcularPrecoPorM2()){
        return casaB;
      } else {
        return casaA;
       }
    }

}
    
