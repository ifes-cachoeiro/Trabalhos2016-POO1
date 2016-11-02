
package CRUD;

import trabalhojava.Aluno;
import bancoDados.dataBase;
import java.util.ArrayList;
/**
 *
 * @author Alexandre
 */
public class listAluno {
     public void inserir(Aluno aluno){
        dataBase.lstAluno.add(aluno);
    }
    public ArrayList<Aluno> ler(){
        return dataBase.lstAluno;
    }
    public Aluno ler(int id){
        for(Aluno a: dataBase.lstAluno){
            if(a.getMatricula() == id){
                return a;
            }
        }
        return null;
    }
    public void remover(Aluno aluno){
        dataBase.lstAluno.remove(aluno);
    }
}
