
package CRUD;
import DOMAIN.Cliente;
import DATABASE.Database_listas;
import VIEWS.ALTERAR_CLIENTE;
import java.util.ArrayList;

public class ClienteCRUD {
    
    public static void inserirCliente(Cliente c){
        
        Database_listas.clientesSalvos.add(c);
           
    }
    
    public static void alterarCliente(){
        
        ALTERAR_CLIENTE C = new ALTERAR_CLIENTE();
        C.setVisible(true);
        
    }
    
    public void excluirCliente(Cliente cliente){
        Database_listas.clientesSalvos.remove(cliente);
        
    }
    
    public ArrayList<Cliente> ler(){
       return Database_listas.clientesSalvos;
   }
    
    
    
}
