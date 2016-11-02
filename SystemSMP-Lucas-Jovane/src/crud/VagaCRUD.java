/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import database.DataBase;
import domain.Vaga;
import java.util.ArrayList;

public class VagaCRUD {
    public void inserir (Vaga vaga){
        DataBase.lstVagas.add(vaga);
    }

    public ArrayList<Vaga> listar(){
        return DataBase.lstVagas;
    }

    public Vaga ler (int numero){
        for(Vaga v: DataBase.lstVagas){
            if(v.getNumero()== numero){
                return v;
            }
        }
        return null;
    }

    public void remover(Vaga vaga){
        DataBase.lstVagas.remove(vaga);
    }
}
