/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Vitor
 */
import java.util.HashMap;

public class ControleDeEstoque {
    private HashMap<String, Produto> estoque;

    public ControleDeEstoque() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        estoque.put(produto.getCodigo(), produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(String codigo) {
        if (estoque.remove(codigo) != null) {
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void atualizarQuantidade(String codigo, int novaQuantidade) {
        Produto produto = estoque.get(codigo);
        if (produto != null) {
            produto.setQuantidadeEmEstoque(novaQuantidade);
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            for (Produto produto : estoque.values()) {
                System.out.println(produto);
            }
        }
    }

    public Produto buscarProduto(String codigo) {
        return estoque.get(codigo);
    }
}
