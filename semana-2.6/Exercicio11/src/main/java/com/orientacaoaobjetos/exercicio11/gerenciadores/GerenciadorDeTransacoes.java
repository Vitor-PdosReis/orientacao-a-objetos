package com.orientacaoaobjetos.exercicio11.gerenciadores;

import com.orientacaoaobjetos.exercicio11.classes.Transacao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class GerenciadorDeTransacoes {
    private List<Transacao> lst;
    
    public GerenciadorDeTransacoes() {
        this.lst = new ArrayList<>();
    }
    
    public void listarTransacoes() {
        if (lst.isEmpty()){
            System.out.println("Lista vazia.");
            return;
        }
        for (Transacao transacao : lst) {
            System.out.println(transacao);
        }
    }

    public void add(Transacao transacao) {
        if(transacao != null){
            lst.add(transacao);
        }
        
    }

    public void remove(String idTransacao) {
        lst.removeIf(transacao -> transacao.getID().equalsIgnoreCase(idTransacao)); // mesmo caso do gerenciador de contas
    }
    public List<Transacao> getTransacoes() {
        return lst;
    }
}
