/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Vitor
 */
public class Quadrado {
    private Ponto p1, p2, p3, p4;

    public double lado(){
        return p1.distancia(p2);
    }

    public Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public Quadrado(Quadrado outro){
        this.p1 = new Ponto(outro.getP1());
        this.p2 = new Ponto(outro.getP2());
        this.p3 = new Ponto(outro.getP3());
        this.p4 = new Ponto(outro.getP4());
    }
    private boolean saoIguais(double a, double b){
            return Math.abs(a - b) < 0.000001;
    }
    
    private double produtoEscalar(Ponto a, Ponto b, Ponto c){
        double ux = b.getX() - a.getX();
        double uy = b.getY() - a.getY();
    
        double vx = c.getX() - b.getX();
        double vy = c.getY() - b.getY();
    
        return ux * vx + uy * vy;
    }
    public boolean isQuadrado(){
        double l1 = p1.distancia(p2);
        double l2 = p2.distancia(p3);
        double l3 = p3.distancia(p4);
        double l4 = p4.distancia(p1);
        
        double d1 = p1.distancia(p3);
        double d2 = p2.distancia(p4);
        
        return saoIguais(l1,l2) &&
               saoIguais(l2,l3) &&
               saoIguais(l3,l4) &&
               saoIguais(d1, d2) &&
               saoIguais(produtoEscalar(p1,p2,p3), 0);
    }
    
    public String tipo(){
        if (isQuadrado())
            return "Os pontos formam um quadrado :)";
        else
            return "Os pontos não formam um quadrado :C";
    }
    @Override
    public String toString() {
        return "Quadrado: " + p1 + ", " + p2 + ", " + p3 + ", " + p4;
    }
    
    public double perimetro(){
       return 4 * lado();
    }
    
    public double area(){
        double l = lado();
        return l * l;
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

    public Ponto getP4() {
        return p4;
    }
}
