/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.DataBase;
import domain.Professor;
import java.util.ArrayList;

/**
 *
 * @author Lamon's House
 */
public class ProfessorCRUD {
    public void inserir(Professor professor){
        DataBase.lstProfessor.add(professor);
    }
    public ArrayList<Professor> ler(){
        return DataBase.lstProfessor;
    }
    public Professor ler(int cod){
        for(Professor p: DataBase.lstProfessor){
            if(p.getCod_professor()== cod){
                return p;
            }
        }
        return null;
    }
    public void alterar(int cod, Professor professor){
        for(Professor p: DataBase.lstProfessor){
            if(p.getCod_professor()== cod){
                p.setBairro(professor.getBairro());
                p.setCep(professor.getCep());
                p.setCod_professor(professor.getCod_professor());
                p.setCpf(professor.getCpf());
                p.setEspecialidade(professor.getEspecialidade());
                p.setNome_professor(professor.getNome_professor());
                p.setSalario(professor.getSalario());
                p.setTelefone(professor.getTelefone());
                break;
            }
        }
    }
        
    
    public void remover(Professor professor){
        DataBase.lstProfessor.remove(professor);
    }
    
}
