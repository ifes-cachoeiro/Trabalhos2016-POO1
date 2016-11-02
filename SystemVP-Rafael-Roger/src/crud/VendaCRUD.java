/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.Database;
import domain.Venda;
import java.util.ArrayList;

/**
 *
 * @author rafaelrocha
 */
public class VendaCRUD {
    public void inserir(Venda venda){
        Database.lstVendas.add(venda);
    }
    
    public ArrayList<Venda> ler(){
        return Database.lstVendas;
    }
    
    
}
