/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class GerenciadorDeReservas {
    private List<Reserva> reservas;
    
    public GerenciadorDeReservas(){
        reservas = new ArrayList<>();
    }
    
    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    
    public boolean cancelarReserva(String nomeReserva){
        for (int i = 0; i < reservas.size(); i++){
            Reserva reserva = reservas.get(i);
            if (reserva.getNomeReserva().equals(nomeReserva)){
                reservas.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public void listarReservas(){
        
        if(reservas.isEmpty()){
            System.out.println("Nenhuma reserva cadastrada");
        }
        else {
           for(Reserva reserva : reservas) {
                System.out.println(reserva.toString());
        } 
        }
        
    }
    
    public boolean buscarReserva(String nomeReserva){
        for (int i = 0; i< reservas.size(); i++){
            Reserva reserva = reservas.get(i);
            if (reserva.getNomeReserva().equals(nomeReserva)){
                System.out.println(reserva.toString());
                return true;
            }
        }
        return false;
    }
}
