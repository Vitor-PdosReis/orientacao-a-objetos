
package com.orientacaoaobjetos.exercicio05.classes;

import java.util.Objects;

/**
 *
 * @author Vitor
 */
public class Roda {
    private double raio;
    private String material;
    private String cor;

    public Roda(double raio, String material, String cor) {
        this.raio = raio;
        this.material = material;
        this.cor = cor;
    }

    public Roda() {
        this.raio = 0;
        this.material = "";
        this.cor = "";
    }

    public void copiar(Roda outro){
        this.raio = outro.getRaio();
        this.material = outro.getMaterial();
        this.cor = outro.getCor();
    }
    
    @Override
    public String toString() {
        return "Roda{" + "raio=" + raio + ", material=" + material + ", cor=" + cor + '}';
    }

    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.raio) ^ (Double.doubleToLongBits(this.raio) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.material);
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
        final Roda other = (Roda) obj;
        if (Double.doubleToLongBits(this.raio) != Double.doubleToLongBits(other.raio)) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        return Objects.equals(this.cor, other.cor);
    }
    
    
}
