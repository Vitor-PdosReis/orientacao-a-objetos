package com.orientacaoaobjetos.exercicio08.classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class Artista {
    private String nome;
    private List<Album> albuns;

    public Artista() {
        this.nome = "";
        
        this.albuns = new ArrayList<>();
    }
    
    public Artista(String nome) {
        this.nome = nome;
        
        this.albuns = new ArrayList<>();
    }
    
    
    public void adicionarAlbum(Album album){
        albuns.add(album);
        System.out.println("Album adicionado");
    }
    public void adicionarMusica(String nomeAlbum, Musica musica){
        for(Album album : this.albuns){
            if(album.getNome().equals(nomeAlbum)){
                album.adicionarMusica(musica);
                System.out.println("Musica adicionada no album!");
                return;
            }
        }
        System.out.println("Album não encontrado.");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
        this.albuns = albuns;
    }
    
    
}
