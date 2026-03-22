/*
 * Exercicio 02 - Crie um `HashMap<String, Double>` que armazene pelo menos 4 produtos e seus preços. Implemente as seguintes operações: 

(a) exiba todos os pares produto/preço; 

(b) atualize o preço de um produto; 

(c) verifique se um produto existe antes de removê-lo
 */

package com.mycompany.exercicio02;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Vitor
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Map<String, Double> produtos = new HashMap<>();
        
        produtos.put("Arroz", 20.00);
        produtos.put("Feijão", 16.00);
        produtos.put("Café", 10.00);
        produtos.put("Iorgute", 12.00);
        
        imprimirLista(produtos); // a
        
        produtos.put("Arroz", 17.00); // b
        System.out.println("Produto atualizado, nova lista: ");
        
        
        if (produtos.containsKey("Feijão")) { // c
            System.out.println("Feijão encontrado, removendo.");
            produtos.remove("Feijão");
        }
        
        System.out.println("\nMostrando listagem após alterações: ");
        imprimirLista(produtos);
    }
    
    public static void imprimirLista(Map<String, Double> produtos){
        System.out.println("Listagem dos produtos: ");
        for(Map.Entry<String, Double>Listagem : produtos.entrySet()) {
            System.out.println("Nome: " + Listagem.getKey()
                    + " Preço: R$" + Listagem.getValue());
        }
        System.out.print("\n");
    }
}
