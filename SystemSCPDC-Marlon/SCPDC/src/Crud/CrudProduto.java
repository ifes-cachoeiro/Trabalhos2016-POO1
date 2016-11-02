/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Domain.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Database.database;


/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class CrudProduto {
    database Dados = new database();
    
    public void novoProduto(String nome, String cor, int volume, int quantidade, 
            double valor){
        
        Produto p = new Produto();
        p.setNome(nome);
        p.setCor(cor);
        p.setVolume(volume);
        p.setQuantidade(quantidade);
        p.setValor(valor);
        Dados.lstProduto.add(p);
    }
    
    public void alterarProduto(Produto p,String nome, String cor, int volume, 
            int quantidade, double valor){
        
        p.setNome(nome);
        p.setCor(cor);
        p.setVolume(volume);
        p.setQuantidade(quantidade);
        p.setValor(valor);
    }
    
    
    public Produto pesquisarProduto(int idAux){
        for(Produto p: Dados.lstProduto){
            if(idAux == p.getId()){
                return p;
            }
        }
        return null;
    }
    
    public void excluirProduto(Produto p){
        Dados.lstProduto.remove(p);
    }
}
