/*
 2. **Classe `Voo`:**
    - Atributos: número do voo, destino, capacidade máxima de passageiros,
    lista de passageiros (objetos da classe `Passageiro`),
    lista de escalas (cidades ou aeroportos intermediários- pode fazer uma lista de string),
    estado do voo (por exemplo, aguardando decolagem, voando, concluído).
    - Métodos: construtores, adicionar e remover passageiros, adicionar e remover escalas,
    alterar o estado do voo, verificar se o voo está abaixo da capacidade mínima.
 */
package com.orientacaoaobjetos.exercicio16.classes;

import com.orientacaoaobjetos.exercicio16.gerenciadores.GerenciadorDeEscala;
import com.orientacaoaobjetos.exercicio16.gerenciadores.GerenciadorDePassageiro;
import java.util.Objects;

/**
 *
 * @author Vitor
 */
public class Voo {
    private int numero;
    private String destino;
    private int capacidade;
    private GerenciadorDePassageiro passageiros;
    private GerenciadorDeEscala escalas;
    private String estado;

    public Voo(int numero, String destino, int capacidade, String estado) {
        this.numero = numero;
        this.destino = destino;
        this.capacidade = capacidade;
        this.passageiros = new GerenciadorDePassageiro();
        this.escalas = new GerenciadorDeEscala();
        this.estado = estado;
    }
    public Voo(){
        this.numero = -1;
        this.destino = "";
        this.capacidade = -1;
        this.passageiros = new GerenciadorDePassageiro();
        this.escalas = new GerenciadorDeEscala();
        this.estado = "";
    }
    public void changeState(String state){
        this.estado = state;
    }
    public boolean abaixoCapMin(){
        if(passageiros.getTotalPassageiros() < (capacidade/2)){
            return true;
        } else {
            return false;
        }
        
    }

    @Override
    public String toString() {
        return "Voo{" + "numero=" + numero + ", destino=" + destino + ", capacidade=" + capacidade + ", total de passageiros= " + passageiros.getTotalPassageiros() +  "estado=" + estado + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.numero;
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
        final Voo other = (Voo) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.capacidade != other.capacidade) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }

   
    
    public void addPassageiro(Passageiro passageiro){
        passageiros.add(passageiro);
    }
    public void removePassageiro(String CPF){
        passageiros.remove(CPF);
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public GerenciadorDePassageiro getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(GerenciadorDePassageiro passageiros) {
        this.passageiros = passageiros;
    }

    public GerenciadorDeEscala getEscalas() {
        return escalas;
    }

    public void setEscalas(GerenciadorDeEscala escalas) {
        this.escalas = escalas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
