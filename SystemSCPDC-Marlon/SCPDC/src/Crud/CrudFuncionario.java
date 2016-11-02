/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Domain.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Database.database;
import Domain.Funcao;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class CrudFuncionario {
    
    database Dados = new database();
    
    public void novoFuncionario(String nome, String cpf, String telefone, 
            Funcao func, String cidade, String bairro){
        
        Funcionario fc = new Funcionario();
        fc.setNome(nome);
        fc.setCpf(cpf);
        fc.setTelefone(telefone);
        fc.setFunc(func);
        fc.setCidade(cidade);
        fc.setBairro(bairro);
        Dados.lstFuncionario.add(fc);
    }
    
    
    public void alterarFuncionario(Funcionario fc,String nome, String cpf, String telefone, 
            Funcao func, String cidade, String bairro){
        
        fc.setNome(nome);
        fc.setCpf(cpf);
        fc.setTelefone(telefone);
        fc.setFunc(func);
        fc.setCidade(cidade);
        fc.setBairro(bairro);
        
    }
    
    
    public Funcionario pesquisarFuncionario(int idAux){
        for(Funcionario fc : Dados.lstFuncionario){
            if(idAux == fc.getId()){
                return fc;
            }
        }
        return null;
    }
    
    public void excluirFuncionario(Funcionario fc){
        Dados.lstFuncionario.remove(fc);
    }
}

