/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Database.database;
import Domain.Entrega;
import Domain.Venda;
/**
 *
 * @author thiag
 */
public class CrudEntrega {
    
    database Dados = new database();
    
    public void NovaEntrega(String rota, String data, String placa){
        Entrega e = new Entrega();
        e.setRota(rota);
        e.setData(data);
        e.setPlacaVeiculo(placa);
        for(Venda v : Dados.lstVenda){
            if((v.isStatusEntrega() == false) && (rota.equals(v.getRota()))){
                Dados.lstVenda.add(v);
                v.setStatusEntrega(true);
            }
        }
        Dados.lstEntrega.add(e);
    }
    
    public void AlterarEntrega(Entrega e,String rota, String data, String placa){
        e.setRota(rota);
        e.setData(data);
        e.setPlacaVeiculo(placa);
    }
    
    public Entrega pesquisarEntrega(int id){
        for(Entrega e : Dados.lstEntrega){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
    
    public void ExcluirEntrega(Entrega e){
        Dados.lstEntrega.remove(e);
    }
}
