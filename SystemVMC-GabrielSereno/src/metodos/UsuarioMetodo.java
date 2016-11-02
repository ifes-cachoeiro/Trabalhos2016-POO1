/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodos;

import database.database;
import domain.Usuario;
import javax.swing.JOptionPane;
import validacoes.ValidacaoEmail;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class UsuarioMetodo {
        public static boolean confirmar(String id, String senha) {
        if (ValidacaoEmail.validaPassword(senha)) {
            for (Usuario u : database.lstUsuario) {
                if (u.getUsuarioID().equals(id) && u.getSenhaUsuario().equals(senha)) {
                    return true;
                }
            }
        }
        return false;
    }
}
