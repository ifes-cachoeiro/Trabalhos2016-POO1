
package CRUD;

import trabalhojava.Professor;
import bancoDados.dataBase;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class listProfessor {
    public void inserir(Professor professor){
        dataBase.lstProfessor.add(professor);
    }
    public ArrayList<Professor> ler(){
        return dataBase.lstProfessor;
    }
    public Professor ler(int matricula){
        for(Professor p: dataBase.lstProfessor){
            if(p.getMatricula() == matricula){
                return p;
            }
        }
        return null;
    }
    public void remover(Professor professor){
        dataBase.lstProfessor.remove(professor);
    }
}
