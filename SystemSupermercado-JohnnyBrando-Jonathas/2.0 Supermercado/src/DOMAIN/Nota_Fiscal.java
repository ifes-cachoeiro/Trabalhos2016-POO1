/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMAIN;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Nota_Fiscal {
    private int id_funcionario;
    private int id_cliente;
    private String data_emissao;
    private double valor_total; 
    private static int  id_NF = 0;
    private int id_local; 
    public ArrayList<Produto> produtos = new ArrayList<Produto>();
    
    public Nota_Fiscal(int id_funcionario_n, String data_emissao_n, int id_cliente_n){
        
        this.data_emissao = data_emissao_n;
        this.id_cliente = id_cliente_n;
        this.id_funcionario = id_funcionario_n;
        this.valor_total = 0;
        this.id_local = id_NF++;
        
    } 

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getData_emissao() {
        return data_emissao;
    }

    public void setData_emissao(String data_emissao) {
        this.data_emissao = data_emissao;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total += valor_total;
    }

    public static int getId_NF() {
        return id_NF;
    }

    public static void setId_NF(int id_NF) {
        Nota_Fiscal.id_NF = id_NF;
    }

    public int getId_local() {
        return id_local;
    }

    public void setId_local(int id_local) {
        this.id_local = id_local;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
