/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.Database;
import static database.Database.lstProdutos;
import domain.Produto;
import java.util.ArrayList;

/**
 *
 * @author rafaelrocha
 */
public class ProdutoCRUD {
    
    public void inserir(Produto produto){
        Database.lstProdutos.add(produto);
    }
    
    public ArrayList<Produto> ler(){
        return Database.lstProdutos;
    }
    
    public void alterar(Integer id, Produto produto) throws Exception{
        for(Produto p: lstProdutos){
            if(p.getId() == id){
                p.setNomeProduto(produto.getNomeProduto());
                p.setDescricao(produto.getDescricao());
                p.setValor(produto.getValor()); 
                break;
            }
        }
    }
    public void remover(Produto produto){
        Database.lstProdutos.remove(produto);
    }
    
    
}
