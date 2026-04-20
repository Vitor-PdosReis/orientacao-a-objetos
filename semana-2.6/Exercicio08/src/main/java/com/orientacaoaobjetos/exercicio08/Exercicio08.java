package com.orientacaoaobjetos.exercicio08;

import com.orientacaoaobjetos.exercicio08.classes.Album;
import com.orientacaoaobjetos.exercicio08.classes.Artista;
import com.orientacaoaobjetos.exercicio08.classes.Musica;
import com.orientacaoaobjetos.exercicio08.gerenciadores.Gerenciador;

/**
 *
 * @author Vitor
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Artista artista1 = new Artista("Artista 1");
        Album album1 = new Album("Álbum 1", 2020);
        Album album2 = new Album("Álbum 2", 2021);
        
        artista1.adicionarAlbum(album1);
        artista1.adicionarAlbum(album2);
        
        Musica musica1 = new Musica("Música 1", 3.30);
        Musica musica2 = new Musica("Música 2", 4.00);
        
        artista1.adicionarMusica(album1.getNome(), musica1);
        artista1.adicionarMusica(album1.getNome(), musica2);
        
        Gerenciador gerenciador = new Gerenciador();
        gerenciador.adicionarArtista(artista1);
        
        Artista artistaComMaisAlbuns = gerenciador.artistaComMaisAlbuns();
        System.out.println("Artista com mais álbuns: " + artistaComMaisAlbuns.getNome());
        
        Album albumComMaisMusicas = gerenciador.albumComMaisMusicas();
        System.out.println("Album com mais músicas: " + albumComMaisMusicas.getNome());
    }
    
}
