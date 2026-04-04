/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Vitor
 */
public class Ponto {
    private double x;
    private double y;
    
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Ponto(Ponto outro){
        this.x = outro.getX();
        this.y = outro.getY();
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", "+ this.y + ")";
    }
    
    public double distancia(Ponto outro){
        double dist = 0.0;
        
        double dx = this.x - outro.getX();
        double dy = this.y - outro.getY();
        
        dist = Math.sqrt(dx*dx + dy*dy);
        
        return dist;
    }
    
    
    
    
    
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
}
