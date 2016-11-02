
package CRUD;
import trabalhojava.Aula;
import bancoDados.dataBase;
import java.util.ArrayList;
/**
 *
 * @author Alexandre
 */
public class listAula {
     public void inserir(Aula aula){
        dataBase.lstAula.add(aula);
    }
    public ArrayList<Aula> ler(){
        return dataBase.lstAula;
    }
    public Aula ler(int id){
        for(Aula a: dataBase.lstAula){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }
    public void remover(Aula aula){
        dataBase.lstAula.remove(aula);
    }
}
