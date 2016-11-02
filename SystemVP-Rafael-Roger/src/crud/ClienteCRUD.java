/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.Database;
import static database.Database.lstClientes;
import domain.Cliente;
import java.util.ArrayList;

/**
 *
 * @author rafaelrocha
 */
public class ClienteCRUD {
    
    public void inserir(Cliente cliente){
        Database.lstClientes.add(cliente);
    }
    
    public ArrayList<Cliente> ler(){
        return Database.lstClientes;
    }
    
    public void alterar(String cpf, Cliente cliente){
        for(Cliente c: lstClientes){
            if(c.getCpf().contains(cpf)){
                c.setEndereco(cliente.getEndereco());
                c.setTelefone(cliente.getTelefone());
                break;
            } 
        }  
    }
    
    public void remover(Cliente cliente){
        Database.lstClientes.remove(cliente);
    }
    
}
