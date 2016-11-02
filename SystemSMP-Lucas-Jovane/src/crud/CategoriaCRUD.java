/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import domain.Categoria;
import database.DataBase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Jovane
 */
public class CategoriaCRUD {
    public void inserir(Categoria categoria){
        DataBase.lstCategoria.add(categoria);
    };
    public void remover(Categoria categoria){
        DataBase.lstCategoria.remove(categoria);
    };
    public void alterar(int id,Categoria categoria){
        for(Categoria cat : DataBase.lstCategoria){
            if(cat.getId() == id){
               cat.setCategoria(categoria.getCategoria());
               cat.setDesc(categoria.getDesc());
               //cat.setId(categoria.getId());
               cat.setValorHora(categoria.getValorHora());
            }
        }
    }
    public Categoria ler(int id){
    for(Categoria cat : DataBase.lstCategoria){
            if(cat.getId() == id){
               return cat;
            }
        }
        return null;
    }
    public ArrayList<Categoria> listar(){
    return DataBase.lstCategoria;
    }

}
