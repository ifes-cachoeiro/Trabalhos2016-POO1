/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import database.Database;
import domain.Produto;
import java.util.ArrayList;

/**
 *
 * @author Maicon
 */
public class ProdutoCRUD {
    public void inserir(Produto produto){
        Database.lstProdutos.add(produto);
    }
    public ArrayList<Produto> ler(){
        return Database.lstProdutos;
    }
    public Produto ler(int id){
        for(Produto p: Database.lstProdutos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public void remover(Produto produto){
        Database.lstProdutos.remove(produto);
    }
    
}
