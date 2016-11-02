/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class Produto {
    private int cod_produto;
    private int estoque_produto;
    private int minestoque_produto;
    private String nome_produto;
    private String marca_produto;
    private String modelo_produto;
    private String unidade_produto;
    private String pccomissao_produto;
    private double precocompra_produto;
    private double precovenda_produto;
    private Fornecedor fornecedor_produto;
    
    public static int nextId = 0;
    
    public Produto(){
        this.cod_produto = Produto.nextId;
        Produto.nextId++;
        estoque_produto = minestoque_produto = 0;
        nome_produto = marca_produto = modelo_produto = unidade_produto = pccomissao_produto = null;
        precocompra_produto = precovenda_produto = 0.0;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public int getEstoque_produto() {
        return estoque_produto;
    }

    public void setEstoque_produto(int estoque_produto) throws Exception{
        if(estoque_produto < 0)
            throw new Exception("Valor negativo!");
        else
            this.estoque_produto = estoque_produto;
    }

    public int getMinestoque_produto() {
        return minestoque_produto;
    }

    public void setMinestoque_produto(int minestoque_produto) throws Exception{
        if(minestoque_produto < 0)
            throw new Exception("Valor negativo!");
        else
            this.minestoque_produto = minestoque_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getMarca_produto() {
        return marca_produto;
    }

    public void setMarca_produto(String marca_produto) {
        this.marca_produto = marca_produto;
    }

    public String getModelo_produto() {
        return modelo_produto;
    }

    public void setModelo_produto(String modelo_produto) {
        this.modelo_produto = modelo_produto;
    }

    public String getUnidade_produto() {
        return unidade_produto;
    }

    public void setUnidade_produto(String unidade_produto) {
        this.unidade_produto = unidade_produto;
    }

    public String getPccomissao_produto() {
        return pccomissao_produto;
    }

    public void setPccomissao_produto(String pccomissao_produto) {
        this.pccomissao_produto = pccomissao_produto;
    }

    public double getPrecocompra_produto() {
        return precocompra_produto;
    }

    public void setPrecocompra_produto(double precocompra_produto) throws Exception{
        if(precocompra_produto < 0)
            throw new Exception ("Valor negativo!");
        else
            this.precocompra_produto = precocompra_produto;
    }

    public double getPrecovenda_produto() {
        return precovenda_produto;
    }

    public void setPrecovenda_produto(double precovenda_produto) throws Exception{
        if(precovenda_produto < 0)
            throw new Exception ("Valor negativo!");
        else
            this.precovenda_produto= precovenda_produto;
    }

    public Fornecedor getFornecedor_produto() {
        return fornecedor_produto;
    }

    public void setFornecedor_produto(Fornecedor fornecedor_produto) {
        this.fornecedor_produto = fornecedor_produto;
    }
}
