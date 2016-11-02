
package CRUD;
import DOMAIN.UF;
import DATABASE.Database_listas;

public class UfCRUD {
    
    public static void cadastrarUf(UF uf){
        Database_listas.ufSalvas.add(uf);
        
         
        
    }
    
}
