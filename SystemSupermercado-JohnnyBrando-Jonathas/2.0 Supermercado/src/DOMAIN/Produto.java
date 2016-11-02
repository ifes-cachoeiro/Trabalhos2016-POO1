/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMAIN;

import DATABASE.Database_listas;
import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Produto {
    private int cod_produto = 0;
    private double valor_produto;
    private int estoque;
    private String nome_produto;
    public static int auxP = 0;
    
    
    public Produto(double valor_produto_p, String nome_produto_p){
        this.nome_produto = nome_produto_p;
        this.valor_produto = valor_produto_p;
        cod_produto = auxP++;
    }

    
    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(double valor_produto) {
        this.valor_produto = valor_produto;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    
    public Object[] obterDados(Produto p) {

        return new Object[]{p.getNome_produto(), p.getCod_produto()};
    }
    
    public Object[] obterDados2(Produto p) {

        return new Object[]{p.getNome_produto(), p.getValor_produto()};
    }
    
}
