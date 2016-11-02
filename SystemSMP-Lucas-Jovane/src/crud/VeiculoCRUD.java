/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import domain.Veiculo;
import database.DataBase;
import java.util.ArrayList;
/**
 *
 * @author Jovane
 */
public class VeiculoCRUD {
    public void inserir (Veiculo veiculo){
        DataBase.lstVeiculo.add(veiculo);
    }

    public ArrayList<Veiculo> listar(){
        return DataBase.lstVeiculo;
    }
    public Veiculo ler(String placa){
    for(Veiculo v: DataBase.lstVeiculo){
            if(v.getPlaca().equals(placa)){
                return v;
            }
        }
        return null;
    }
    public void alterar(String placa,Veiculo veic){
        for(Veiculo v : DataBase.lstVeiculo){
            if(v.getPlaca().equals(placa)){
                v.setCategoria(veic.getCategoria());
                v.setCor(veic.getCor());
                v.setCliente(veic.getCliente());
                break;
            }
        }
    }
    public void remove(Veiculo veiculo){
        DataBase.lstVeiculo.remove(veiculo);
    }
}
