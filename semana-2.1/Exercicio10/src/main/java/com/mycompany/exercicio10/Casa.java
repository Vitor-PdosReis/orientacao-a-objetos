
package com.mycompany.exercicio10;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Casa {
    private String endereco;
    private double area;
    private int num_quartos;
    private double preco;
    
    public Casa(){
        this.endereco = "";
        this.area = 0.0;
        this.num_quartos = 0;
        this.preco = 0.0;
    }
    
    public Casa(Casa outro){
        this.endereco = outro.getEndereco();
        this.area = outro.getArea();
        this.num_quartos = outro.getNum_quartos();
        this.preco = outro.getPreco();
    }

    public Casa(String endereco, double area, int num_quartos, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.num_quartos = num_quartos;
        this.preco = preco;
    }
    
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public int getNum_quartos() {
        return num_quartos;
    }
    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void copiar(Casa casa){
        this.endereco = endereco;
        this.area = area;
        this.num_quartos = num_quartos;
        this.preco = preco;
    }
    
    
    
    @Override
    public String toString() {
        return "Casa { endereco: " + this.endereco
                + ", area: " + this.area + "m²"
                + ", num_quartos: " + this.num_quartos
                + ", preco: R$" + this.preco + " }";
    }
    
    public void Fill(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira os dados da casa: ");
        
        System.out.print("Endereço: ");
        this.endereco = leitor.nextLine();
        
        System.out.print("Area: ");
        this.area = leitor.nextDouble();
        
        System.out.print("Numero de quartos: ");
        this.num_quartos = leitor.nextInt();
        
        System.out.println("Preço: ");
        this.preco = leitor.nextDouble();
        
    }
    
    public double calcularPrecoPorM2(){
        return preco/area;
    }
    
    public void exibirResumo() {
        double precoM2 = calcularPrecoPorM2();
        System.out.println(toString() + precoM2 + "/m²");
    }
    
}
