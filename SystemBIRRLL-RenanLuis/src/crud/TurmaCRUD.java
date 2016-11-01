/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.DataBase;
import domain.Turma;
import java.util.ArrayList;

/**
 *
 * @author Lamon's House
 */
public class TurmaCRUD {
    public void inserir(Turma turma){
        DataBase.lstTurma.add(turma);
    }
    public ArrayList<Turma> ler(){
        return DataBase.lstTurma;
    }
    public Turma ler(int cod){
        for(Turma t: DataBase.lstTurma){
            if(t.getCod_turma()== cod){
                return t;
            }
        }
        return null;
    }
    public void alterar(int cod, Turma turma){
        for(Turma t: DataBase.lstTurma){
            if(t.getCod_turma()== cod){
                t.setCod_turma(turma.getCod_turma());
                t.setProfessor(turma.getProfessor());
                t.setTipo_turma(turma.getTipo_turma());
                break;
            }
        }
    }
        
    
    public void remover(Turma turma){
        DataBase.lstTurma.remove(turma);
    }
}
