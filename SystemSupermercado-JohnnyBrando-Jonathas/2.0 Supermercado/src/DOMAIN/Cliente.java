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
public class Cliente {
    private String nome;
    private String Cidade;
    private String Bairro; 
    private String UF;
    private String numero;
    private int cod_cliente;
    private String telefone_cliente;
    private static int cod = 0;

    
    public Cliente(String nome, String Cidade, String Bairro, String UF, String numero, String telefone_cliente){
        
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.UF = UF;
        this.numero = numero;
        this.telefone_cliente = telefone_cliente;
        this.nome = nome;
        this.cod_cliente = cod++;
        
    }
    
    public String getNome (){
        return nome;
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getTelefone_cliente() {
        return telefone_cliente;
    }

    public void setTelefone_cliente(String telefone) {
        this.telefone_cliente = telefone_cliente;
    }
    
}
