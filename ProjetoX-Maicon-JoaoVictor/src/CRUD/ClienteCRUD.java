package CRUD;

import database.Database;
import domain.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Maicon
 */
public class ClienteCRUD {
    public void inserir(Cliente cliente){
        Database.lstClientes.add(cliente);
    }
    public ArrayList<Cliente> ler(){
        return Database.lstClientes;
    }
    public Cliente ler(int id){
        for(Cliente c: Database.lstClientes){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    public void remover(Cliente cliente){
        Database.lstClientes.remove(cliente);
    }
    
}
