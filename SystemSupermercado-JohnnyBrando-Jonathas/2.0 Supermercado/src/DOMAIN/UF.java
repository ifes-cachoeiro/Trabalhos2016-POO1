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
public class UF {
    
    private String nome_uf;
    private String sigla_uf;
    
    public UF (String nome_uf_u, String sigla_uf_u) {
        
        this.nome_uf = nome_uf_u;
        this.sigla_uf = sigla_uf_u;
        
    }

    public String getNome_uf() {
        return nome_uf;
    }

    public void setNome_uf(String nome_uf) {
        this.nome_uf = nome_uf;
    }

    public String getSigla_uf() {
        return sigla_uf;
    }

    public void setSigla_uf(String sigla_uf) {
        this.sigla_uf = sigla_uf;
    }
    
    
}
