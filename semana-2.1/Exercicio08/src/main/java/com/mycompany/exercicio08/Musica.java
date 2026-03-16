package com.mycompany.exercicio08;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Musica {
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;
    
    public Musica(){
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    public Musica(String titulo, String artista, double duracao, double preco){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getArtista(){
        return this.artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }
    public double getDuracao(){
        return this.duracao;
    }
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void copiar(Musica outro){
        this.titulo = outro.getTitulo();
        this.artista = outro.getArtista();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }
    
    public void fill(){
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Insira os dados da musica: ");
        
        System.out.print("titulo: ");
        this.titulo = leitor.nextLine();
        
        System.out.print("artista: ");
        this.artista = leitor.nextLine();
        
        System.out.print("duracao: ");
        this.duracao = leitor.nextFloat();
        
        System.out.print("preco: ");
        this.preco = leitor.nextFloat();
       
    }
    @Override
    public String toString(){
        return "Musica { Titulo: " + this.titulo 
                + ", Artista: " + this.artista
                + ", Duracao: " + this.duracao
                + ", Preco: " + this.preco + "}";
    }
    
    //Metodos mockados
    public void tocarMusica(){
        System.out.println("A música "+ this.titulo + " está tocando!");
    }
    public void desligarMusica(){
        System.out.println("A música "+ this.titulo + " foi desligada!");
    }
}
