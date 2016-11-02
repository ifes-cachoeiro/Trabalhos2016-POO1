/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import trabalhojava.Presenca;
import bancoDados.dataBase;
import java.util.ArrayList;
/**
 *
 * @author Alexandre
 */
public class listPresenca {
    
    public void inserir(Presenca pr){
        dataBase.lstPresenca.add(pr);
    }
    
    public ArrayList<Presenca> ler(){
        return dataBase.lstPresenca;
    }
    
    public Presenca ler(String aula){
        for (Presenca pr: dataBase.lstPresenca){
            if(pr.getAluno().equals(aula) ){
                return pr;
            }
        }
        return null;
    }
    
    public void remover(Presenca pr){
        dataBase.lstPresenca.remove(pr);
    }
    
}

