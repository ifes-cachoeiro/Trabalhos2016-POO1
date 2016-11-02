
package CRUD;
import DATABASE.Database_listas;
import DOMAIN.Funcionario;
import VIEWS.ALTERAR_FUNCIONARIO;
import java.util.ArrayList;
public class FuncionarioCRUD {
    
    public static void cadastrarFuncionario(Funcionario func){
        Database_listas.funcionariosSalvos.add(func);
           
    }
    
    public void exibirFuncionario(int id_funcionario){
        
    }
    
    
    public static void alterarFuncionario(){
        ALTERAR_FUNCIONARIO FU = new ALTERAR_FUNCIONARIO();
        FU.setVisible(true);
    }
    
    public void excluirFuncionario(Funcionario func){
        Database_listas.funcionariosSalvos.remove(func);
    }
    public ArrayList<Funcionario> ler(){
       return Database_listas.funcionariosSalvos;
   }
}
