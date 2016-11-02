/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMAIN;

/**
 *
 * @author Johnny Brando
 */
public class Funcionario {
    private int ID_funcionario = 0;
    public static int auxFu = 0;
    private String senha_funcionario;
    private String email_funcionario;
    private String nome_completo;

    public Funcionario(String email_f, String senha_f, String nome_f){
        
       this.email_funcionario = email_f;
       this.nome_completo = nome_f;
       this.senha_funcionario = senha_f;
       ID_funcionario += auxFu++;
    
    }
    
    public int getID_funcionario() {
        return ID_funcionario;
    }

    public void setID_funcionario(int ID_funcionario) {
        this.ID_funcionario = ID_funcionario;
    }

    public String getSenha_funcionario() {
        return senha_funcionario;
    }

    public void setSenha_funcionario(String senha_funcionario) {
        this.senha_funcionario = senha_funcionario;
    }

    public String getEmail_funcionario() {
        return email_funcionario;
    }

    public void setEmail_funcionario(String email_funcionario) {
        this.email_funcionario = email_funcionario;
    }

    public String getNome_completo() {
        return nome_completo;
    }

    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }
       
}
