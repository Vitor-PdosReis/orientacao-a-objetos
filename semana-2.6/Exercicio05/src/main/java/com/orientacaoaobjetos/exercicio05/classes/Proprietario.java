package com.orientacaoaobjetos.exercicio05.classes;

import com.orientacaoaobjetos.exercicio05.classes.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitor
 */
public class Proprietario {
    private String nome;
    private String cpf;
    private String email;
    private List<Carro> carros;

    public Proprietario(){
        this.nome = "";
        this.cpf = "";
        this.email = "";
        
        this.carros = new ArrayList<>();
    }
    
    public Proprietario(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        
        this.carros = new ArrayList<>();
    }
    
    public void adicionarCarro(Carro carro){
        carros.add(carro);
        System.out.println("Carro adicionado!");
    }
    
    public void removerCarro(String modelo){
        for (Carro carro : carros) {
            if(carro.getModelo().equalsIgnoreCase(modelo)){
                carros.remove(carro);
                System.out.println("Remoção feita com sucesso");
                return;
            }
        }
        System.out.println("Modelo não encontrado!");
    }
    public void pesquisaCarroPorFabricante(String fabricante){
        boolean encontrou = false;
        for(Carro carro : this.carros){
            if(carro.getFabricante().equalsIgnoreCase(fabricante)){
                System.out.println("Carro encontrado: - modelo:  " + carro.getModelo());
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Não foram encontrados modelos de carro com esse fabricante");
        }
    }
    public void pesquisaCarroPorModelo(String modelo){
         boolean encontrou = false;
        for(Carro carro : this.carros){
            if(carro.getModelo().equalsIgnoreCase(modelo)){
                System.out.println(carro);
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Nenhum carro neste modelo encontrado");
        }
    }
    public void pesquisaCarroPorCor(String cor){
         boolean encontrou = false;
        for(Carro carro : this.carros){
            if(carro.getCor().equalsIgnoreCase(cor)){
                System.out.println(carro);
                encontrou = true;
            }
        }
        if(!encontrou){
            System.out.println("Nenhum carro nesta cor encontrado");
        }
    }
    
    public void verificaFabricantes(Proprietario p2){
        for(Carro carro : this.carros){
            for(Carro carro2 : p2.carros){
                if(carro.getFabricante().equals(carro2.getFabricante())){
                    System.out.println("Os proprietários possuem pelo menos 1 carro com o mesmo fabricante");
                    return;
                }
            }
        }
        System.out.println("Os proprietários não possuem carros em comum!");
    }
    
}
