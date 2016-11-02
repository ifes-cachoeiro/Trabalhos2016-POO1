/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;
/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class Entrega {
    private int id;
    private String placaVeiculo;
    private String rota;
    private ArrayList<Venda> lstVenda = new ArrayList<>();
    private String data;
    
    public static int nextId = 0;
    
    public Entrega(){
        this.id = Entrega.nextId;
        Entrega.nextId++;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Venda> getLstVenda() {
        return lstVenda;
    }

    public void setLstVenda(ArrayList<Venda> lstVenda) {
        this.lstVenda = lstVenda;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getRota() {
        return rota;
    }

    public void setRota(String r) {
        this.rota = r;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
    
    public Object[] lerDados(Entrega e) {
        return new Object[]{e.getId(), e.getData(), e.getRota(), e.getPlacaVeiculo()};
    }
}
