package com.orientacaoaobjetos.exercicio16.gerenciadores;

import com.orientacaoaobjetos.exercicio16.classes.Passageiro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class GerenciadorDePassageiro {
    private List<Passageiro> lst;
    
    public GerenciadorDePassageiro(){
        this.lst = new ArrayList<>();
    }
    public void add(Passageiro passageiro){
        if(passageiro!=null){
            lst.add(passageiro);
        }
    }
    
    public int getTotalPassageiros(){
        return lst.size();
    }
    public void remove(String CPF){
        if(CPF != null){
            lst.removeIf(passageiro -> passageiro.getCPF().equalsIgnoreCase(CPF));
        }
    }
    public void adicionarPontos(String CPF, int pontos){
        for(Passageiro passageiro : lst){
            if(passageiro.getCPF().equals(CPF)){
                passageiro.addPontos(pontos);
            }
        }
    }
    public void verifPontos(String CPF){
        for(Passageiro passageiro : lst){
            if(passageiro.getCPF().equals(CPF)){
                System.out.println("O passageiro: " + passageiro.getNome() + " , possui " + passageiro.getPontos() + " pontos");           
            }
        }
    }
    public void resgatarPonto(String CPF, int pontos){
        for(Passageiro passageiro : lst){
            if(passageiro.getCPF().equals(CPF)){
                passageiro.getFidelidade().resgatarPontos(pontos);
            }
        }
    }
}
