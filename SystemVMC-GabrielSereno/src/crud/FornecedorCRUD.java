/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.database;
import domain.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class FornecedorCRUD {

    public static void cadastrar(Fornecedor f) {
        database.lstFornecedor.add(f);
    }

    public static ArrayList<Fornecedor> listar() {
        return database.lstFornecedor;
    }

    public static void excluir(Fornecedor fornecedor) {
        database.lstFornecedor.remove(fornecedor);
    }

    public static Fornecedor listar(int cod) {
        for (Fornecedor f : database.lstFornecedor) {
            if (f.getCod_fornecedor() == cod) {
                return f;
            }
        }
        return null;
    }
    
    public static Fornecedor listar(String nome){
        for(Fornecedor f: database.lstFornecedor){
            if(f.getNome_fornecedor().equals(nome)){
                return f;
            }
        }  
        return null;
    }

}
