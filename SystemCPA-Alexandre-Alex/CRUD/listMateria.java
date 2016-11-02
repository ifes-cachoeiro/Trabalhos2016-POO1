package CRUD;

import trabalhojava.Materia;
import bancoDados.dataBase;
import java.util.ArrayList;
/**
 *
 * @author Alexandre
 */
public class listMateria {
    public void inserir(Materia materia){
        dataBase.lstMateria.add(materia);
    }
    public ArrayList<Materia> ler(){
        return dataBase.lstMateria;
    }
    public Materia ler(int id){
        for(Materia m: dataBase.lstMateria){
            if(m.getId() == id){
                return m;
            }
        }
        return null;
    }
    public void remover(Materia materia){
        dataBase.lstMateria.remove(materia);
    }
}
