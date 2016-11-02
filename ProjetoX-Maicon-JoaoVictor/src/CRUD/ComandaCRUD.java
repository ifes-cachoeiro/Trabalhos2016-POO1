/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import database.Database;
import domain.Comanda;
import java.util.ArrayList;

/**
 *
 * @author Maicon
 */
public class ComandaCRUD {
    public void inserir(Comanda comanda){
        Database.lstComandas.add(comanda);
    }
    public ArrayList<Comanda> ler(){
        return Database.lstComandas;
    }
    public Comanda ler(int id){
        for(Comanda c: Database.lstComandas){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }
    public void remover(Comanda comanda){
        Database.lstComandas.remove(comanda);
    }
    
}
