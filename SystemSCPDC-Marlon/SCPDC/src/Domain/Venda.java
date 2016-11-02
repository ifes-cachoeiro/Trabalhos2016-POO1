/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Crud.CrudVenda;
import java.util.ArrayList;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class Venda {
    private int id;
    private String dataVenda;
    private Cliente cliente;    
    private Funcionario func;
    private String previsaoEntrega;
    private String rota;
    private Produto prod;
    private int quantidade;
    private boolean statusEntrega;
    
    public static int nextId = 0;
    
    public Venda(){
        this.id = Venda.nextId;
        Venda.nextId++;
        this.statusEntrega = false;
    }

    public int getId() {
        return id;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public String getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(String previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

  
    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }

    public boolean isStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(boolean statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public Object[] lerDados(Venda v) {
        CrudVenda crudVenda = new CrudVenda();
        return new Object[]{v.getId(), v.getCliente().getNome(), v.getProd().getNome(),
                v.getQuantidade(), crudVenda.ValorTotal(v)};
    }
}
