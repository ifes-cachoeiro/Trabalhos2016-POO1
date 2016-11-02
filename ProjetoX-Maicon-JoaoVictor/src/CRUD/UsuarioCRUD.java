/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import database.Database;
import domain.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Maicon
 */
public class UsuarioCRUD {
    public void inserir(Usuario usuario){
        Database.lstUser.add(usuario);
    }
    public ArrayList<Usuario> ler(){
        return Database.lstUser;
    }
    public Usuario ler(int id){
        for(Usuario u: Database.lstUser){
            if(u.getId() == id){
                return u;
            }
        }
        return null;
    }
    public void remover (Usuario usuario){
        Database.lstUser.remove(usuario);
    }
    
}
