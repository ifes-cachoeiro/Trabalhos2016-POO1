
package CRUD;
import DOMAIN.Fornecedor;
import DATABASE.Database_listas;
import static DATABASE.Database_listas.NFSalvas;
import DOMAIN.Nota_Fiscal;
import DOMAIN.Produto;
import VIEWS.JFrameADD_PROD;
import VIEWS.JFrameConfirmar;
import VIEWS.erro_add_prod;
import javax.swing.JTextField;


public class NotaFiscalCRUD {
    
    public static void criarNF(Nota_Fiscal nf_fiscal){
      
        Database_listas.NFSalvas.add(nf_fiscal);
        
        
        
    }
    
    public void exibirNF(int cod_NF){
        
    }
    
    
    public void alterarNF(int cod_NF){
        
    }
    
    public void excluirNF(int cod_NF){
        
    }
    
    public void inserir_produtos(Nota_Fiscal nf, Produto prod){
      
        nf.getProdutos().add(prod);
        
    }
    
    
}
