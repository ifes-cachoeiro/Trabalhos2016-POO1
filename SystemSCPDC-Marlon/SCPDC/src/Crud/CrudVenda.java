/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Domain.Cliente;
import Domain.Funcionario;
import Domain.Venda;
import Database.database;
import Domain.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class CrudVenda {
    database Dados = new database();
    
    public void NovaVenda(String data, Cliente c, Funcionario f, String previsao, 
            String rota, Produto p, int qtd){
        Venda v = new Venda();
        v.setDataVenda(data);
        v.setCliente(c);
        v.setFunc(f);
        v.setPrevisaoEntrega(previsao);
        v.setRota(rota);
        v.setProd(p);
        v.setQuantidade(qtd);
        JOptionPane.showMessageDialog(null, "Valor Total: "+ ValorTotal(v));
        Dados.lstVenda.add(v);
    }
    
    public Double ValorTotal(Venda v){
        return (v.getQuantidade() * v.getProd().getValor());
    }
    
    public void AlterarVenda(Venda v, String data, Cliente c, Funcionario f, 
            String previsao, String rota, Produto p, int qtd){
        v.setDataVenda(data);
        v.setCliente(c);
        v.setFunc(f);
        v.setPrevisaoEntrega(previsao);
        v.setRota(rota);
        v.setProd(p);
        v.setQuantidade(qtd);
        JOptionPane.showMessageDialog(null, "Valor Total: "+ ValorTotal(v));
    }
    
    public Venda VisualizarVenda(int id){
        for(Venda v : Dados.lstVenda){
            if(id == v.getId()){
                return v;
            }
        }
        return null;
    }
    
    public void ExcluirVenda (Venda v){
        Dados.lstVenda.remove(v);
    }
}
