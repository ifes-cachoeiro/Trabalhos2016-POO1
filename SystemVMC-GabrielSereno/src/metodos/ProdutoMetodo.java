/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodos;

import database.database;
import domain.Produto;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class ProdutoMetodo {
     public static double valorTotal(){
        double valorTotal = 0;
        for(Produto p : database.lstProdutoAdicionado){
            valorTotal = (p.getPrecovenda_produto() * p.getEstoque_produto())+ valorTotal;
        }
        return valorTotal;
    }
    
    public static int qtdTotal(){
        int qtdTotal = 0;
        for(Produto p : database.lstProdutoAdicionado){
            qtdTotal = p.getEstoque_produto() + qtdTotal;
        }
        return qtdTotal;
    }
}
