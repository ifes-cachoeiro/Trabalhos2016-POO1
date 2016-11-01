/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Cliente;
import database.DataBase;
import java.util.ArrayList;

/**
 *
 * @author Lamon's House
 */
public class ClienteCRUD {
    public void inserir(Cliente cliente){
        DataBase.lstCliente.add(cliente);
    }
    public ArrayList<Cliente> ler(){
        return DataBase.lstCliente;
    }
    public Cliente ler(int cod){
        for(Cliente c: DataBase.lstCliente){
            if(c.getCod_cliente()== cod){
                return c;
            }
        }
        return null;
    }
    public Cliente lerT(int cod){
        for(Cliente c: DataBase.lstCliente){
            if(c.getTurma().getCod_turma()== cod){
                return c;
            }
        }
        return null;
    }
    public void alterar(int cod, Cliente cliente){
        for(Cliente c: DataBase.lstCliente){
            if(c.getCod_cliente()== cod){
                c.setBairro(cliente.getBairro());
                c.setCpf(cliente.getCpf());
                c.setNome_cliente(cliente.getNome_cliente());
                c.setTelefone_cliente(cliente.getTelefone_cliente());
                c.setTurma(cliente.getTurma());
                c.setCod_cliente(cliente.getCod_cliente());
                break;
            }
        }
    }
        
    
    public void remover(Cliente cliente){
        DataBase.lstCliente.remove(cliente);
    }

}
