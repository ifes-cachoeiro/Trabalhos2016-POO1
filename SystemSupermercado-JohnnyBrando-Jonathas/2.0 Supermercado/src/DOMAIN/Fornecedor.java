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
public class Fornecedor {
    private int cod_fornecedor = 0;
    public static int auxF = 0;
    private String nome_fornecedor;
    private String telefone_fornecedor;
    private String UF;
    
    public Fornecedor(String nome_f, String telefone_f, String uf_f){
        this.UF = uf_f;
        this.nome_fornecedor = nome_f;
        this.telefone_fornecedor = telefone_f;
        cod_fornecedor = auxF++;
    }
      
    public int getCod_fornecedor() {
        return cod_fornecedor;
    }

    public void setCod_fornecedor(int cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }

    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getTelefone_fornecedor() {
        return telefone_fornecedor;
    }

    public void setTelefone_fornecedor(String telefone_fornecedor) {
        this.telefone_fornecedor = telefone_fornecedor;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
}
