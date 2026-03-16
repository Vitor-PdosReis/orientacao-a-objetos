
package com.mycompany.exercicio11;

/**
 *
 * @author vitor
 */
public class Exercicio11 {

    public static void main(String[] args) {
        
        Ativo ativo1 = new Ativo("Apple Inc.", 121.99, 225, 1.87);
        Ativo ativo2 = new Ativo ("Tesla Inc.", 242.50, 100, -0.54);
        Ativo ativo3 = new Ativo ("Amazon", 98.75, 400, 3.12);
        
        System.out.println("=== Resumo da Carteira ===");
        
        System.out.println(ativo1.exibirResumo());
        System.out.println(ativo2.exibirResumo());
        System.out.println(ativo3.exibirResumo());
        
        System.out.println("-------------------------------");
        
        double total = ativo1.calcularPosicaoDoAtivo() + ativo2.calcularPosicaoDoAtivo() + ativo3.calcularPosicaoDoAtivo();
        
        System.out.println("Valor total da carteira: R$ " + total);
    }
}
