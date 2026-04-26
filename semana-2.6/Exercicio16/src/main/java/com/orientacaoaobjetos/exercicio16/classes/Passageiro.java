/*
 1. **Classe `Passageiro`:**
    - Atributos: nome, CPF (ou outro identificador único).
    - Métodos: construtores, getters e setters conforme necessário.
    - Integração com o sistema de fidelidade: cada passageiro possui uma instância da classe
    `SistemaFidelidade` para gerenciar seus pontos acumulados.
 */
package com.orientacaoaobjetos.exercicio16.classes;

/**
 *
 * @author Vitor
 */
public class Passageiro {
    private String nome;
    private String CPF;
    private SistemaFidelidade fidelidade;
    
    public Passageiro(){
        this.nome = "";
        this.CPF = "";
        this.fidelidade = new SistemaFidelidade();
    }
    public Passageiro(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
        this.fidelidade = new SistemaFidelidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public SistemaFidelidade getFidelidade() {
        return fidelidade;
    }
    
    public int getPontos(){
        return fidelidade.getSaldoPontos();
    }
    public void addPontos(int ponto){
        fidelidade.adicionarPontos(ponto);
    }
    
    
    
}
