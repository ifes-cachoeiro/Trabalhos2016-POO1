/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author rafaelrocha
 */
public class Venda {
    public static int nextID = 0;
    public int id;
    public Cliente cliente;
    public ArrayList<Produto> lstProdutos;
    public boolean fechada;
    
    
    public Venda(){
        this.id = Venda.nextID;
        Venda.nextID++;
        this.fechada = false;
        lstProdutos = new ArrayList<>();
        
    }
    
    public double ValorTotal(){
        double soma = 0;
        
        for(Produto p: lstProdutos){
            soma += p.getValor() * p.qtd;
        }
        return soma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
    
}
