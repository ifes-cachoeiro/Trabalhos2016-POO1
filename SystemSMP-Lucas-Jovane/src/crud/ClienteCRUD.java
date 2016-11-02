/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import database.DataBase;
import domain.Cliente;
import java.util.ArrayList;
import java.util.Set;
/**
 *
 * @author Jovane
 */
public class ClienteCRUD {
    public void inserir(Cliente clie){
        DataBase.lstCliente.add(clie);
    }

    public ArrayList<Cliente> listar(){
        return DataBase.lstCliente;
    }

    public Cliente ler(String cpf){
        for(Cliente c: DataBase.lstCliente){
            if(c.getCpf().equals(cpf)){
                return c;
            }
        }
        return null;
    }
    public void alterar(String cpf,Cliente clie){
        for(Cliente aux : DataBase.lstCliente){
            if(aux.getCpf().equals(cpf)){
                aux.setBairro(clie.getBairro());
                aux.setCpf(clie.getCpf());
                aux.setEmail(clie.getEmail());
                aux.setNome(clie.getNome());
                aux.setUf(clie.getUf());
                aux.setTelefone(clie.getTelefone());
                break;
            }
        }
    }
    public void remover(Cliente cliente){
        DataBase.lstCliente.remove(cliente);
    }
}
