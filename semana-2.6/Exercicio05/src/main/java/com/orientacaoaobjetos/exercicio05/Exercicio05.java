/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.orientacaoaobjetos.exercicio05;

import com.orientacaoaobjetos.exercicio05.classes.Carro;
import com.orientacaoaobjetos.exercicio05.classes.Proprietario;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira os dados do primeiro proprietario: ");
        Proprietario p1 = criarProprietarioComCarros(leitor);
        System.out.println("Insira os dados do segundo proprietario: ");
        Proprietario p2 = criarProprietarioComCarros(leitor);

        System.out.println("\n------ Verificando fabricantes ------");
        p1.verificaFabricantes(p2);
    }
    
     public static Proprietario criarProprietarioComCarros(Scanner leitor) {
        System.out.print("Nome: ");
        String nome = leitor.nextLine();

        System.out.print("CPF: ");
        String cpf = leitor.nextLine();

        System.out.print("Email: ");
        String email = leitor.nextLine();

        Proprietario proprietario = new Proprietario(nome, cpf, email);

        for (int i = 1; i <= 2; i++) {
            System.out.println("\n--- Cadastro do carro " + i + " ---");
            Carro carro = criarCarro(leitor);
            proprietario.adicionarCarro(carro);
        }

        return proprietario;
    }

    public static Carro criarCarro(Scanner leitor) {
        System.out.print("Fabricante: ");
        String fabricante = leitor.nextLine();

        System.out.print("Modelo: ");
        String modelo = leitor.nextLine();

        System.out.print("Cor: ");
        String cor = leitor.nextLine();

        return new Carro(fabricante, modelo, cor);
    }
}
