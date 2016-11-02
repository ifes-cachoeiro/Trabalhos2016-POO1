/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;
import Database.database;
import Domain.Usuario;

/**
 *
 * @author thiag
 */
public class CrudUsuario {
    database Dados = new database();
    
    public boolean VerificarEmail(String email){
        for(Usuario u : Dados.lstUsuario){
            if(email.equals(u.getEmail())){
                return true;
            }
        }
        return false;
    }
    
    public void NovoUsuario(String email, String senha, String nome){
        Usuario u = new Usuario();
        u.setEmail(email);
        u.setSenha(senha);
        u.setNome(nome);
        Dados.lstUsuario.add(u);
    }
    
    public void AlterarUsuario(Usuario u, String email, String senha, String nome){
        u.setEmail(email);
        u.setSenha(senha);
        u.setNome(nome);
    }
    
    public Usuario PesquisarUsuario(int id){
        for(Usuario u : Dados.lstUsuario){
            if(id == u.getId()){
                return u;
            }
        }
        return null;
    }
    
    public void ExcluirUsuario(Usuario u){
        Dados.lstUsuario.remove(u);
    }
}
