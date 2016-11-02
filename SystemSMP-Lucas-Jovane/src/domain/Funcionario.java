/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jovane
 */
public class Funcionario extends Cliente{
    private String usuario;
    private String senha;

    public Funcionario(String usuario, String senha, String cpf, String nome, String endereco, String telefone, String email, String bairro, String uf) {
        super(cpf, nome, endereco, telefone, email, bairro, uf);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
