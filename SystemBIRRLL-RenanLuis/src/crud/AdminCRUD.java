/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.DataBase;
import domain.Admin;

/**
 *
 * @author Vinincius
 */
public class AdminCRUD {

    public void inserir(Admin ad) {
        DataBase.lstAdmin.add(ad);
    }

    public boolean verifica(String email, String senha) {
        for (Admin c : DataBase.lstAdmin) {
            if (c.getEmail().equals(email) && c.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

}
