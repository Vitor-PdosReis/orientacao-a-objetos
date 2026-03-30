/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Reserva {
    private String nomeReserva;
    private int numPessoas;
    private String dataHora;
    
    public Reserva(){
        this.nomeReserva = "";
        this.numPessoas = 0;
        this.dataHora = "";
    }
    public Reserva(Reserva outro){
        this.nomeReserva = outro.getNomeReserva();
        this.numPessoas = outro.getNumPessoas();
        this.dataHora = outro.getDataHora();
    }

    public Reserva(String nomeReserva, int numPessoas, String dataHora) {
        this.nomeReserva = nomeReserva;
        this.numPessoas = numPessoas;
        this.dataHora = dataHora;
    }
    
    public void copiar(Reserva outro){
        this.nomeReserva = outro.getNomeReserva();
        this.numPessoas = outro.getNumPessoas();
        this.dataHora = outro.getDataHora();
    }
    
    public void fill(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira os dados da reserva: ");
        
        System.out.println("Nome da reserva: ");
        this.nomeReserva = leitor.nextLine();
        
        System.out.println("Número de pessoas: ");
        this.numPessoas = leitor.nextInt();
        leitor.nextLine();
        
        System.out.println("Data e hora (dd/MM/yyyy HH:mm): ");
        this.dataHora = leitor.nextLine();
    }
    
    @Override
    public String toString(){
        return "Reserva{"
                + "nomeReserva= " + nomeReserva
                + ", numPessoas= " + numPessoas
                + ", dataHora= " + dataHora
                + "}";
    }

    public String getDataHora() {
        return dataHora;
    }

    public String getNomeReserva() {
        return nomeReserva;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public void setNomeReserva(String nomeReserva) {
        this.nomeReserva = nomeReserva;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }
    
    
    
}
