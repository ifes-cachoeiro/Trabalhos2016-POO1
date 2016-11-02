/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMAIN;

/**
 *
 * @author Nunu
 */
public class Usuario {
    
    private String nome;
    private String senha;
    private String email;
    private int id;
    static int id_local = 0;

    public Usuario(String senha, String email, String nome) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.id = id_local++;
    }
    

    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
