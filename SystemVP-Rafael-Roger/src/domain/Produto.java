/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author rafaelrocha
 */
public class Produto {
    public static int nextID = 0;
    public int id;
    private String nomeProduto;
    private String descricao;
    private double valor;
    public int qtd;
    
    //public Produto(){
    //    this.id = Produto.nextID;
    //    Produto.nextID++;
    //}

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception{
        if(valor < 0){
            throw new Exception("Valor inválido");
        }else{
            this.valor = valor;
        }
        
    }
    
    
    
}
