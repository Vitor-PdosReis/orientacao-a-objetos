/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exercicio01;

import classes.GerenciadorDeReservas;
import classes.Reserva;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio01 {
    
    public static int imprimirMenu(){
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("-----------------------");
        System.out.println("1- Adicionar reserva");
        System.out.println("2- Cancelar reserva");
        System.out.println("3- Listar reservas");
        System.out.println("4- Buscar reserva");
        System.out.println("0- Sair");
        System.out.println("-----------------------");
        System.out.println("Escolha uma opção");
        
        int opcao = leitor.nextInt();
        leitor.nextLine();
        return opcao;

    }

    public static void main(String[] args) {
        GerenciadorDeReservas gerente = new GerenciadorDeReservas();
        Scanner leitor = new Scanner(System.in);
        int opcao;
        
        do {
            opcao = imprimirMenu();
            switch (opcao) {
                case 1: {
                    Reserva novaReserva = new Reserva();
                    novaReserva.fill();
                    gerente.adicionarReserva(novaReserva);
                    break;
                }
                case 2: {
                    System.out.println("Insira o nome da reserva a ser cancelada: ");
                    String nomeReserva = leitor.nextLine();
                    
                    if(gerente.cancelarReserva(nomeReserva)){
                        System.out.println("Reserva cancelada com sucesso.");
                    } else {
                        System.out.println("Reserva não encontrada.");
                    }
                    break;
                }
                case 3: {
                    gerente.listarReservas();
                    break;
                }
                case 4: {
                    String nomeReserva;
                    System.out.println("Insira o nome da reserva que deseja buscar: ");
                    nomeReserva = leitor.nextLine();
                    gerente.buscarReserva(nomeReserva);
                    break;
                }
                case 0: {
                    System.out.println("Encerrando programa.");
                }
                default: {
                    System.out.println("opção inválida, insira novamente o valor!");
                    break;
                }
            }
        } while(opcao != 0);
        
        leitor.close();
    }
}
