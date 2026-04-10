/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Vitor
 */
public class Pedido {
    private String numero;
    private String data;
    private double quantidade;
    private Produto produto;

    public Pedido(String numero, String data, double quantidade, Produto produto) {
        this.numero = numero;
        this.data = data;
        this.quantidade = quantidade;
        
        this.produto = new Produto(produto);
    }
    public double calcularTotal(){
        return produto.getPreco()* quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", data=" + data + ", quantidade=" + quantidade + ", produto=" + produto + '}';
    }
    
    
    
    public Produto getProduto() {
        return new Produto(produto);
    }

    public void setProduto(Produto produto) {
        this.produto = new Produto(produto);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    
}
