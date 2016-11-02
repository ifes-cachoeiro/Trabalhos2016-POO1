/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import database.database;
import domain.Cliente;
import java.util.ArrayList;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class ClienteCRUD {
    public static void cadastrar(Cliente c){
        database.lstCliente.add(c);
    }

    public static ArrayList<Cliente> listar(){
        return database.lstCliente;
    }
    
    public static void excluir(Cliente cliente){
        database.lstCliente.remove(cliente);
    }
    
    public static Cliente listar(String nome){
        for(Cliente c: database.lstCliente){
            if(c.getNome_cliente().equals(nome)){
                return c;
            }
        }  
        return null;
    }
    
    public static Cliente listar(int cod){
        for(Cliente c: database.lstCliente){
            if(c.getCod_cliente() == cod){
                return c;
            }
        }  
        return null;
    }


}