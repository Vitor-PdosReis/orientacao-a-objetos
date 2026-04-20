package com.orientacaoaobjetos.exercicio05.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Vitor
 */
public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private List<Roda> rodas;

    public Carro(String fabricante, String modelo, String cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        
        rodas = new ArrayList<>();
    }
    public Carro(){
        this.fabricante = "";
        this.modelo = "";
        this.cor = "";
        
        rodas = new ArrayList<>();
    }
    
    public void copiar(Carro outro){
        this.fabricante = outro.getFabricante();
        this.modelo = outro.getModelo();
        this.cor = outro.getCor();
        
        this.rodas = new ArrayList<>();
        for(Roda roda_i : outro.getRodas()){
            Roda nova = new Roda();
            nova.copiar(roda_i);
            this.rodas.add(nova);
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.fabricante);
        hash = 37 * hash + Objects.hashCode(this.modelo);
        hash = 37 * hash + Objects.hashCode(this.cor);
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
        final Carro other = (Carro) obj;
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.cor, other.cor);
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro{ ");
        sb.append("Fabricante: ").append(fabricante).append(", ");
        sb.append("Modelo: ").append(modelo).append(", ");
        sb.append("Cor: ").append(cor).append(", ");
        sb.append("Rodas : (").append(this.rodas.size()).append("):\n");
        
        for(int i = 0; i< rodas.size(); i++){
            sb.append(rodas.get(i).toString());
        }
        sb.append("}");
        return sb.toString();
    }
    
    

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Roda> getRodas() {
        return rodas;
    }
    
    
}
