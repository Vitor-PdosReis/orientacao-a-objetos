package com.orientacaoaobjetos.exercicio16.gerenciadores;

import com.orientacaoaobjetos.exercicio16.classes.Voo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class GerenciadorDeVoo {
    private List<Voo> lst;
    
    public GerenciadorDeVoo(){
        this.lst = new ArrayList<>();
    }
    
    public void add(Voo voo){
        lst.add(voo);
    }
    public void remove(Voo voo){
        lst.remove(voo);
    }
    public void listar(){
        for(Voo voo : lst){
            System.out.println(voo);
        }
        
    }
    public void verifPrejuizo(){
        for(Voo voo : lst){
            if(voo.abaixoCapMin() == true){
                System.out.println("O vôo de número " + voo.getNumero()+ "terá prejuízo");
            }
        }
    }
    public void iniciarVoo(int numero, String estado){
        if(numero < 0){
            return;
        }
        else {
            for(Voo voo : lst){
                if(voo.getNumero() == numero){
                    voo.changeState(estado);
                }
            }
        }
        
    }
    
}
