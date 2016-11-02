/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class Cliente {
    private int id;
    private String nome;
    private String cnpj;
    private String telefone;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    
    public static int nextId = 0;
    
    public Cliente(){
        this.id = Cliente.nextId;
        Cliente.nextId++;
        this.nome = "";
        this.cnpj = "";
        this.telefone = "";
        this.uf = "";
        this.cidade = "";
        this.bairro = "";
        this.rua = "";
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public Object[] lerDados(Cliente c) {
        return new Object[]{c.getId(), c.getNome(), c.getCnpj(), c.getTelefone()};
    }
}
