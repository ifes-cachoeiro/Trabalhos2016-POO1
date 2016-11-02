
package CRUD;
import DOMAIN.Fornecedor;
import DATABASE.Database_listas;
import VIEWS.ALTERAR_FORNECEDOR;
import java.util.ArrayList;

public class FornecedorCRUD {
    
    public static void cadastrarFornecedor(Fornecedor novoFornecedor){
        
        
        Database_listas.fornecedoresSalvos.add(novoFornecedor);       
        
    }
    
    public void exibirFornecedor(int id_fornecedor_exibir){
        
    }
    
    
    public static void alterarFornecedor(){
        
        ALTERAR_FORNECEDOR F = new ALTERAR_FORNECEDOR();
        F.setVisible(true);
        
    }
    
    public void excluirFornecedor(Fornecedor fornecedor){
        Database_listas.fornecedoresSalvos.remove(fornecedor);
    }
    public ArrayList<Fornecedor> ler(){
       return Database_listas.fornecedoresSalvos;
   }
            
}
