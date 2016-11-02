/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMAIN;

/**
 *
 * @author Marcos
 */
public class Item_NF {
    private int id_nota_fiscal;
    private int sequencia;
    private int cod_produto;
    
    
    public Item_NF(int sequencia_i, int cod_produto_i, int id_NF_i){
        
        this.cod_produto = cod_produto_i;
        this.sequencia = sequencia_i;
        this.id_nota_fiscal = id_NF_i;
        
    }
    
    public int getId_nota_fiscal() {
        return id_nota_fiscal;
    }

    public void setId_nota_fiscal(int id_nota_fiscal) {
        this.id_nota_fiscal = id_nota_fiscal;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }
    
    
}
