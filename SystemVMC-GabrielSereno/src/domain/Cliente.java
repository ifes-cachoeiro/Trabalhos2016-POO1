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
public class Cliente {
    private int cod_cliente;
    private String nome_cliente;
    private String rua_cliente;
    private String bairro_cliente;
    private String cidade_cliente;
    private String cpf_cliente;
    private String uf_cliente;
    private String complemento_cliente;
    private String telefone1_cliente;
    private String telefone2_cliente;
    private String numero_cliente;
    
    public static int nextId = 0;
    
    public Cliente(){
        this.cod_cliente  = Cliente.nextId;
        Cliente.nextId++;
        nome_cliente = rua_cliente = bairro_cliente = cidade_cliente = cpf_cliente = null;
        uf_cliente = complemento_cliente = telefone1_cliente = telefone2_cliente = numero_cliente = null;
        
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getRua_cliente() {
        return rua_cliente;
    }

    public void setRua_cliente(String rua_cliente) {
        this.rua_cliente = rua_cliente;
    }

    public String getBairro_cliente() {
        return bairro_cliente;
    }

    public void setBairro_cliente(String bairro_cliente) {
        this.bairro_cliente = bairro_cliente;
    }

    public String getCidade_cliente() {
        return cidade_cliente;
    }

    public void setCidade_cliente(String cidade_cliente) {
        this.cidade_cliente = cidade_cliente;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getUf_cliente() {
        return uf_cliente;
    }

    public void setUf_cliente(String uf_cliente) {
        this.uf_cliente = uf_cliente;
    }

    public String getComplemento_cliente() {
        return complemento_cliente;
    }

    public void setComplemento_cliente(String complemento_cliente) {
        this.complemento_cliente = complemento_cliente;
    }

    public String getTelefone1_cliente() {
        return telefone1_cliente;
    }

    public void setTelefone1_cliente(String telefone1_cliente) {
        this.telefone1_cliente = telefone1_cliente;
    }

    public String getTelefone2_cliente() {
        return telefone2_cliente;
    }

    public void setTelefone2_cliente(String telefone2_cliente) {
        this.telefone2_cliente = telefone2_cliente;
    }

    public String getNumero_cliente() {
        return numero_cliente;
    }

    public void setNumero_cliente(String numero_cliente) {
        this.numero_cliente = numero_cliente;
    }

    public Object[] obterDados (Cliente c){
        return new Object[]{c.getCod_cliente(), c.getNome_cliente(), c.getRua_cliente(), 
            c.getBairro_cliente(), c.getTelefone1_cliente()};
                
                }
}
