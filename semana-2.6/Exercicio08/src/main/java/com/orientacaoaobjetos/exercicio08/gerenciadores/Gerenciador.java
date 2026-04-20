package com.orientacaoaobjetos.exercicio08.gerenciadores;

import com.orientacaoaobjetos.exercicio08.classes.Album;
import com.orientacaoaobjetos.exercicio08.classes.Artista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class Gerenciador {
    private List<Artista> artistas;

    public Gerenciador() {
        this.artistas = new ArrayList<>();
    }
    
    public void adicionarArtista(Artista artista){
        artistas.add(artista);
        System.out.println("Artista adicionado!");
    }
    public Artista artistaComMaisAlbuns(){
        if(artistas.isEmpty()){
            return null;
        }
        Artista maior = artistas.get(0);
        for(Artista a : artistas){
            if(a.getAlbuns().size()> maior.getAlbuns().size()){
                maior = a;
            }
        }
        return maior;
    }
    public Album albumComMaisMusicas(){
        if(artistas.isEmpty()){
            return null;
        }
        Album maior = null;
        for(Artista a : artistas){
            for(Album al : a.getAlbuns()){
                if(maior == null || al.getMusicas().size() > maior.getMusicas().size()){
                    maior = al;
                }
            }
        }
        
        return maior;
    }
    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
    
    
    
    
}
