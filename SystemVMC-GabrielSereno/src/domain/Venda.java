/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;
import java.util.ArrayList;

/**
 * 
 * @author Gabriel dos Santos Sereno <gabrielf2@live.com>
 */
public class Venda {
    private Cliente cliente;
    private ArrayList <Produto> produto;
    private Fornecedor fornecedor;
    private int cod_venda;
    private String data_venda, hora_venda;
    private double valor_total;
    private String nome_vendedor;
    
    static int nextID = 0;
    
    public Venda(){
        cliente = null;
        produto = new ArrayList <Produto>();
        fornecedor = null;
        valor_total = 0;
        data_venda = hora_venda = null;
        this.cod_venda = Venda.nextID;
        Venda.nextID++;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public String getHora_venda() {
        return hora_venda;
    }

    public void setHora_venda(String hora_venda) {
        this.hora_venda = hora_venda;
    }

    public ArrayList <Produto> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList <Produto> produto) {
        this.produto = produto;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) throws Exception{
        if(valor_total < 0 ){
            throw new Exception ("Valor negativo!");
        }else{
            this.valor_total = valor_total;
        }
        
    }

    public String getNome_vendedor() {
        return nome_vendedor;
    }

    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

}
