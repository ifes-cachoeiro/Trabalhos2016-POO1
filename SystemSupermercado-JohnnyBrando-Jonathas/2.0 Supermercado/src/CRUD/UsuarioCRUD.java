/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import DATABASE.Database_listas;
import DOMAIN.Usuario;

/**
 *
 * @author Nunu
 */
public class UsuarioCRUD {

    public static void adicionarUsuario(Usuario u) {
        
        Database_listas.usuarios.add(u);
        
    }
    
}
