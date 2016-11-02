/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.database;
import domain.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import validacoes.ValidacaoEmail;

/**
 *
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class UsuarioCRUD {

    public static void cadastrar(Usuario u) {
        database.lstUsuario.add(u);
    }

    public ArrayList<Usuario> listar() {
        return database.lstUsuario;
    }

    public static void excluir(Usuario u) {
        database.lstUsuario.remove(u);
    }


    public static Usuario listar(String  id) {
        for (Usuario u : database.lstUsuario) {
            if (u.getUsuarioID().equals(id)) {
                return u;
            }
        }
        return null;
    }

}
