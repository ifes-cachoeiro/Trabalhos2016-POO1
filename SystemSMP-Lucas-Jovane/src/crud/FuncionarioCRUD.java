/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import domain.Funcionario;
import database.DataBase;
import java.util.ArrayList;
/**
 *
 * @author Jovane
 */
public class FuncionarioCRUD {
    public void inserir (Funcionario func){
        DataBase.lstFuncionario.add(func);
    }
    public ArrayList<Funcionario> listar(){
        return DataBase.lstFuncionario;
    }
    public Funcionario ler(String cpf){
        for(Funcionario f: DataBase.lstFuncionario){
            if(f.getCpf().equals(cpf)){
                return f;
            }
        }
        return null;
    }
    public void alterar(String cpf,Funcionario func){
        for(Funcionario f: DataBase.lstFuncionario){
            if(f.getCpf().equals(cpf)){
                f.setUsuario(func.getUsuario());
                f.setSenha(func.getSenha());
                f.setBairro(func.getBairro());
                f.setCpf(func.getCpf());
                f.setEmail(func.getEmail());
                f.setNome(func.getNome());
                f.setUf(func.getUf());
                f.setTelefone(func.getTelefone());
                break;
            }
        }
    }
    public void remover(Funcionario func){
        DataBase.lstFuncionario.remove(func);
    }
}
