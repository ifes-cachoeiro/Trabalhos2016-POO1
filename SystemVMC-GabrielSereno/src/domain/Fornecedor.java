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
public class Fornecedor {
    private int cod_fornecedor;
    private String nome_fornecedor;
    private String endereco_fornecedor;
    private String cidade_fornecedor;
    private String bairro_fornecedor;
    private String uf_fornecedor;
    private String CEP_fornecedor;
    private String telefone1_fornecedor;
    private String telefone2_fornecedor;
    private String cnpj_fornecedor;
    private String email_fornecedor;
    private String numero_fornecedor;

    public static int nextID = 0;
    
    public Fornecedor(){
      this.cod_fornecedor = Fornecedor.nextID;  
      Fornecedor.nextID++;    
      nome_fornecedor = endereco_fornecedor = cidade_fornecedor = bairro_fornecedor = null;
      uf_fornecedor = CEP_fornecedor = telefone1_fornecedor = telefone2_fornecedor = null;
      cnpj_fornecedor = email_fornecedor = numero_fornecedor = null;
    }
    
    public String getNome_fornecedor() {
        return nome_fornecedor;
    }

    public void setNome_fornecedor(String nome_fornecedor) {
        this.nome_fornecedor = nome_fornecedor;
    }

    public String getEndereco_fornecedor() {
        return endereco_fornecedor;
    }

    public void setEndereco_fornecedor(String endereco_fornecedor) {
        this.endereco_fornecedor = endereco_fornecedor;
    }

    public String getCidade_fornecedor() {
        return cidade_fornecedor;
    }

    public void setCidade_fornecedor(String cidade_fornecedor) {
        this.cidade_fornecedor = cidade_fornecedor;
    }

    public String getBairro_fornecedor() {
        return bairro_fornecedor;
    }

    public void setBairro_fornecedor(String bairro_fornecedor) {
        this.bairro_fornecedor = bairro_fornecedor;
    }

    public String getUf_fornecedor() {
        return uf_fornecedor;
    }

    public void setUf_fornecedor(String uf_fornecedor) {
        this.uf_fornecedor = uf_fornecedor;
    }

    public String getCEP_fornecedor() {
        return CEP_fornecedor;
    }

    public void setCEP_fornecedor(String CEP_fornecedor) {
        this.CEP_fornecedor = CEP_fornecedor;
    }

    public String getTelefone1_fornecedor() {
        return telefone1_fornecedor;
    }

    public void setTelefone1_fornecedor(String telefone1_fornecedor) {
        this.telefone1_fornecedor = telefone1_fornecedor;
    }

    public String getTelefone2_fornecedor() {
        return telefone2_fornecedor;
    }

    public void setTelefone2_fornecedor(String telefone2_fornecedor) {
        this.telefone2_fornecedor = telefone2_fornecedor;
    }

    public String getCnpj_fornecedor() {
        return cnpj_fornecedor;
    }

    public void setCnpj_fornecedor(String cnpj_fornecedor) {
        this.cnpj_fornecedor = cnpj_fornecedor;
    }

    public String getEmail_fornecedor() {
        return email_fornecedor;
    }

    public void setEmail_fornecedor(String email_fornecedor) {
        this.email_fornecedor = email_fornecedor;
    }

    public String getNumero_fornecedor() {
        return numero_fornecedor;
    }

    public void setNumero_fornecedor(String numero_fornecedor){
        this.numero_fornecedor = numero_fornecedor;
    }

    public int getCod_fornecedor() {
        return cod_fornecedor;
    }

    public void setCod_fornecedor(int cod_fornecedor) {
        this.cod_fornecedor = cod_fornecedor;
    }
}
