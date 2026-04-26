package com.orientacaoaobjetos.exercicio16.gerenciadores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class GerenciadorDeEscala {
    private List<String> lst;
    
    public GerenciadorDeEscala(){
        this.lst = new ArrayList<>();
    }
    public void add(String escala){
        if(escala!=null){
            lst.add(escala);
        }
    }
    public void remove(String escala){
        if(escala != null){
            lst.remove(escala);
        }
    }

    public void listar(){
        System.out.println("Lista da escala:");
        for(String nome : lst){
            System.out.println(nome);
        }
    }
    
}
