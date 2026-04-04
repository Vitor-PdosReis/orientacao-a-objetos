/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Vitor
 */
public class Triangulo {
    private Ponto p1, p2, p3;

    public Triangulo() {
    }

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public Triangulo(Triangulo outro){
        this.p1 = new Ponto(outro.getP1());
        this.p2 = new Ponto(outro.getP2());
        this.p3 = new Ponto(outro.getP3());
    }
    
    public Double Determinante(){
        return p1.getX() * (p2.getY() - p3.getY()) +
           p2.getX() * (p3.getY() - p1.getY()) +
           p3.getX() * (p1.getY() - p2.getY());
    }
    
    public boolean isColinear(){
        if(this.Determinante() == 0)
            return true;
        else
            return false;
    }
    
    public double area(){
        if(this.isColinear())
            return 0.0;
        else
            return Math.abs(this.Determinante()/2.0);
    }
    
    public double distancia(Ponto a , Ponto b){
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2)
                         + Math.pow(b.getY()- a.getY(), 2));
    }
    
    public double perimetro(){
        return distancia(p1,p2) +
                distancia(p2,p3) +
                distancia (p3, p1);
    }
    
    public String tipo() {
        if(isColinear())
            return "Não forma triângulo";
        
        double l1 = distancia(p1,p2);
        double l2 = distancia(p2,p3);
        double l3 = distancia (p3,p1);
        
        if(l1 == l2 && l2 == l3) 
            return "Equilátero";
            
        else if(l1 == l2 || l2 == l3 || l1 ==l3)
             return "Isósceles";
        
        else
            return "Escaleno";
 
    }
    
    @Override
    public String toString() {
        return "Triângulo: " + p1 + ", " + p2 + ", " + p3;
    }
    
    
    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public Ponto getP3() {
        return p3;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public void setP3(Ponto p3) {
        this.p3 = p3;
    }
  
    
}
