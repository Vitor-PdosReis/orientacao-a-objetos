package main;

import classes.Pedido;
import classes.Produto;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio01 {

    public static void main(String[] args) {
        // Cria um produto
        Produto p1 = new Produto("Teclado Mecânico", "Informática", 350.00);
    
        // Cria um pedido associado ao produto
        Pedido pedido1 = new Pedido("1001", "16/03/2026", 3, p1);

        // Calcula e exibe o total
        System.out.println(pedido1);
        System.out.println("Total do pedido: R$" + pedido1.calcularTotal());

        // Exemplo preenchido pelo usuário
        Scanner leitor = new Scanner(System.in);
        Pedido pedido2 = criarPedido(leitor);
        System.out.println(pedido2);
        System.out.println("Total do pedido: R$" + pedido2.calcularTotal());    }

    private static Pedido criarPedido(Scanner leitor) {
        
        //produto
        System.out.println("Insira o nome do produto: ");
        String nome = leitor.nextLine();
        System.out.println("Insira a categoria do produto: ");
        String categoria = leitor.nextLine();
        System.out.println("Insira o preço do produto: ");
        double preco = leitor.nextDouble();
        leitor.nextLine();
        
        Produto produto = new Produto(nome, categoria, preco);
        
        //Pedido
        System.out.println("Insira o numero do pedido");
        String numero = leitor.nextLine();
        System.out.println("Insira a data: (dd/mm/year");
        String data = leitor.nextLine();
        System.out.println("Insira a quantidade de " + produto.getNome());
        double quantidade = leitor.nextDouble();
        leitor.nextLine();
        
        return new Pedido(numero, data, quantidade, produto);

    }
}
