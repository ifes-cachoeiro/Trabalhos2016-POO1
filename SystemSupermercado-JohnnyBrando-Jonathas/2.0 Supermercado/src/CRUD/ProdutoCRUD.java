
package CRUD;
import DOMAIN.Produto;
import DATABASE.Database_listas;
import VIEWS.ALTERAR_PRODUTO;
import java.util.ArrayList;


public class ProdutoCRUD {
    
    
    public static void cadastrarProduto(Produto produto){
        Database_listas.produtosSalvos.add(produto);
            
    }
    
    public void exibirProduto(int id_produto){
        
    }
    
    
    public static void alterarProduto(){
        
        ALTERAR_PRODUTO P = new ALTERAR_PRODUTO();
        P.setVisible(true);
        
    }
    
    public void excluirFornecedor(Produto prod){
        Database_listas.produtosSalvos.remove(prod);
        
    }
    public ArrayList<Produto> ler(){
       return Database_listas.produtosSalvos;
   }
    
}
