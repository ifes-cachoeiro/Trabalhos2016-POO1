/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Domain.Funcao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Database.database;


/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class CrudFuncao {
    
    database Dados = new database();
    
    public void novaFuncao(String descricao, double salario){
        
        Funcao f = new Funcao();
        f.setDescricao(descricao);
        f.setSalario(salario);
        Dados.lstFuncao.add(f);
    }
    
    public void alterarFuncao(Funcao f, String descricao, double salario){
        
        f.setDescricao(descricao);
        f.setSalario(salario);
    }
    
    public Funcao pesquisarFuncao(int idAux){
        for(Funcao f: Dados.lstFuncao){
            if(idAux == f.getId()){
                return f;
            }
        }
        return null;
    }
    
    public void excluirFuncao(Funcao f){
        Dados.lstFuncao.remove(f);
    }
}
