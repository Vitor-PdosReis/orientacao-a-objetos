/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exercicio06;

import classes.ControleDeEstoque;
import classes.Produto;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio06 {
    
    public static int imprimirMenu(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-----------------------");
        System.out.println("1- Adicionar produto");
        System.out.println("2- Remover produto");
        System.out.println("3- Atualizar quantidade");
        System.out.println("4- Listar produtos");
        System.out.println("5- Buscar produtos");
        System.out.println("0- Sair");
        System.out.println("-----------------------");
        System.out.println("Escolha uma opção");
        
        int opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;
    }
    
    public static Produto criarProduto(){
        Scanner leitor = new Scanner(System.in);
        
        Produto produto = new Produto();
        
        System.out.println("Insira o código do produto");
        produto.setCodigo(leitor.nextLine());
        System.out.println("Insira o nome do produto");
        produto.setNome(leitor.nextLine());
        System.out.println("insira a quantidade do produto em estoque");
        produto.setQuantidadeEmEstoque(leitor.nextInt());
        leitor.nextLine();
        
        return produto;
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ControleDeEstoque controleDeEstoque = new ControleDeEstoque();
        int opcao;
        String codigo;
        int quantidade;
        Produto buscado;
        
        do {
            opcao = imprimirMenu();
            
            switch (opcao) {
                case 0: {
                    System.out.println("Encerrando...");
                    break;
                }
                case 1: {
                    controleDeEstoque.adicionarProduto(criarProduto());
                    System.out.println("Produto adicionado, nova lista: ");
                    controleDeEstoque.listarProdutos();
                    break;
                }
                case 2:  {
                    System.out.println("Insira o código do produto a ser removido: ");
                    codigo = leitor.nextLine();
                    controleDeEstoque.removerProduto(codigo);
                    System.out.println("Produto removido, listagem após remoção: ");
                    controleDeEstoque.listarProdutos();
                    break;
                }
                case 3: {
                    System.out.println("Insira o código do produto: ");
                    codigo = leitor.nextLine();
                    System.out.println("Insira a nova quantidade: ");
                    quantidade = leitor.nextInt();
                    leitor.nextLine();
                    
                    controleDeEstoque.atualizarQuantidade(codigo, quantidade);
                    break;
                }
                case 4: {
                    System.out.println("Listando produtos: ");
                    controleDeEstoque.listarProdutos();
                    break;
                }
                case 5: {
                    System.out.println("Insira o codigo do produto a ser pesquisado: ");
                    codigo = leitor.nextLine();
                    buscado = controleDeEstoque.buscarProduto(codigo);
                    
                    if (buscado != null) {
                        System.out.println("\nProduto buscado: " + buscado);
                    } else {
                        System.out.println("\nProduto não encontrado.");
                    }
                    break;
                }
                default: {
                    System.out.println("opção inválida, tente novamente: ");
                    break;
                }
            }
            
            
        } while (opcao != 0);

    }
}