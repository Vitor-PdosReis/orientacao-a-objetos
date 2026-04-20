package com.orientacaoaobjetos.exercicio08.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Vitor
 */
public class Album {
    private String nome;
    private int anoLançamento;
    private List<Musica> musicas;

    public Album(){
        this.nome = "";
        this.anoLançamento = 0;
        
        this.musicas = new ArrayList<>();
    }
    public Album(String nome, int anoLançamento) {
        this.nome = nome;
        this.anoLançamento = anoLançamento;
        
        this.musicas = new ArrayList<>();
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Album {");
        sb.append("Nome: ").append(nome).append(", ");
        sb.append("Ano de lançamento: ").append(anoLançamento).append(", ");
        sb.append("Musicas: (").append(this.musicas.size()).append(")\n");
        
        for(int i = 0; i< musicas.size(); i++){
            sb.append(musicas.get(i).toString());
        }
        sb.append("}");
        return sb.toString();
    }
    
    public void adicionarMusica(Musica musica){
        musicas.add(musica);
        System.out.println("Musica adicionada!");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + this.anoLançamento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Album other = (Album) obj;
        if (this.anoLançamento != other.anoLançamento) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.musicas, other.musicas);
    }
    
    
}
