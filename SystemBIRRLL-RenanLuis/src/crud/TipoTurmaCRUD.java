/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Tipo_turma;
import database.DataBase;
import java.util.ArrayList;
/**
 *
 * @author Vinicius
 */
public class TipoTurmaCRUD {
    
    public void inserir(Tipo_turma tipo){
        DataBase.lstTipoTurma.add(tipo);
    }
    
    public ArrayList<Tipo_turma> ler(){
        return DataBase.lstTipoTurma;
    }
    public Tipo_turma ler(int cod){
        for(Tipo_turma b: DataBase.lstTipoTurma){
            if(b.getCod_tipo_turma() == cod){
                return b;
            }
        }
        return null;
    }
    
    public void alterar(int cod, Tipo_turma tipo){
        for(Tipo_turma b: DataBase.lstTipoTurma){
            if(b.getCod_tipo_turma() == cod){
                b.setCod_tipo_turma(tipo.getCod_tipo_turma());
                b.setPreco(tipo.getPreco());
                b.setNome_tipo(tipo.getNome_tipo());
                b.setDescricao(tipo.getDescricao());
                break;
            }
        }
    }
    
    public void remover(Tipo_turma tipo){
        DataBase.lstTipoTurma.remove(tipo);
    }
    
}
