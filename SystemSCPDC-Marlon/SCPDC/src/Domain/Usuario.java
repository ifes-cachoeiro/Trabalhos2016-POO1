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
public class Usuario {
    private String email;
    private String senha;
    private String nome;
    private int id;
    public static int nextId = 0;
    
    public Usuario(){
        this.id = Usuario.nextId;
        Usuario.nextId++;
        this.email = "admin";
        this.senha = "123";
        this.nome = "administrador";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    
    public Object[] lerDados(Usuario u) {
        return new Object[]{u.getId(), u.getNome(), u.getEmail()};
    }
}
