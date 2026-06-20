/*
- Atributos: nome, localização, lista de voos.
- Métodos: adicionar e remover voos, listar voos, verificar quais voos terão prejuízo, iniciar um voo.
 */
package com.orientacaoaobjetos.exercicio16.classes;

import com.orientacaoaobjetos.exercicio16.gerenciadores.GerenciadorDeVoo;

/**
 *
 * @author Vitor
 */
public class Aeroporto {
    private String nome;
    private String localizacao;
    private GerenciadorDeVoo voos;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        voos = new GerenciadorDeVoo();
    }
    public Aeroporto(){
        this.nome = "";
        this.localizacao = "";
        voos = new GerenciadorDeVoo();
    }
    public void calculaVooComPrejuizo(){
        voos.verifPrejuizo();
    }
    public void addVoo(Voo voo){
        voos.add(voo);
    }
    public void removeVoo(Voo voo){
        voos.remove(voo);
    }
    public void listarVoos(){
        voos.listar();
    }
    public void verifPreju(){
        voos.verifPrejuizo();
    }
    public void iniciarVoo(int numero, String estado){
        voos.iniciarVoo(numero, estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    
}
