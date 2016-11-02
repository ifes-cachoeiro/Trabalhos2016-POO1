/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.Database;
import static database.Database.lstUsuarios;
import domain.Usuario;
import java.util.ArrayList;

/**
 *
 * @author rafaelrocha
 */
public class UsuarioCRUD {

    public void inserir(Usuario usuario){
        Database.lstUsuarios.add(usuario);
    }
    
    public ArrayList<Usuario> ler(){
        return Database.lstUsuarios;
    }
    
    public void alterar(String nome, Usuario usuario) throws Exception{
        for(Usuario u: lstUsuarios){
            if(u.getNomeCompleto().contains(nome)){
                u.setEmail(usuario.getEmail());
                u.getSenha(usuario.getSenha());
                break;
            }
        }
    }
       
    public void remover(Usuario usuario){
        Database.lstUsuarios.remove(usuario);
    }
    
}
