/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crud;

import database.database;
import domain.Venda;
import java.util.ArrayList;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class VendaCRUD {
    public static void cadastrar(Venda v){
        database.lstVenda.add(v);
    }
    public static ArrayList<Venda> listar(){
        return database.lstVenda;
    }
    
    public static void excluir(Venda v){
        database.lstVenda.remove(v);
    }
    
    public static Venda listar(int cod){
        for(Venda v: database.lstVenda){
            if(v.getCod_venda() == cod){
                return v;
            }
        }  
        return null;
    }

}
