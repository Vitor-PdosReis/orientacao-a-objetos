
package com.mycompany.exercicio11;

import java.util.Scanner;

/**
 *
 * @author vitor
 */
public class Ativo {
    
    private String nomeEmpresa;
    private double precoAcao;
    private double qtdAcoes;
    private double variacaoDiaria;

    public Ativo() {
        this.nomeEmpresa = "";
        this.precoAcao = 0.0;
        this.qtdAcoes = 0.0;
        this.variacaoDiaria = 0.0;
    }
    
    public Ativo(Ativo outro) {
        this.nomeEmpresa = outro.getNomeEmpresa();
        this.precoAcao = outro.getPrecoAcao();
        this.qtdAcoes = outro.getQtdAcoes();
        this.variacaoDiaria = outro.getVariacaoDiaria();
    }
 
    public Ativo(String nomeEmpresa, double precoAcao, double qtdAcoes, double variacaoDiaria) {
        this.nomeEmpresa = nomeEmpresa;
        this.precoAcao = precoAcao;
        this.qtdAcoes = qtdAcoes;
        this.variacaoDiaria = variacaoDiaria;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public double getPrecoAcao() {
        return precoAcao;
    }

    public double getQtdAcoes() {
        return qtdAcoes;
    }

    public double getVariacaoDiaria() {
        return variacaoDiaria;
    }
    
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setPrecoAcao(double precoAcao) {
        this.precoAcao = precoAcao;
    }

    public void setQtdAcoes(double qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public void setVariacaoDiaria(double variacaoDiaria) {
        this.variacaoDiaria = variacaoDiaria;
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira os dados do ativo:");
        
        System.out.print("Nome da empresa: ");
        nomeEmpresa = leitor.nextLine();
        
        System.out.print("Preço da ação: ");
        precoAcao = leitor.nextDouble();
        
        System.out.print("Quantidade de ações: ");
        qtdAcoes = leitor.nextDouble();
        
        System.out.print("Variação diária: ");
        variacaoDiaria = leitor.nextDouble();
            
        
    }
    
    @Override
    public String toString() {
        return "Ativo { Nome da Empresa: " + nomeEmpresa
                + ", Preço: R$" + precoAcao
                + ", Qtd: " + qtdAcoes
                + ", Variação: " + variacaoDiaria + "%";
    }
    
    public double calcularPosicaoDoAtivo(){
        return precoAcao * qtdAcoes;
    }
    
    public String exibirResumo(){
        return toString() + ", Posiçao: R$" + calcularPosicaoDoAtivo();
    }

}
