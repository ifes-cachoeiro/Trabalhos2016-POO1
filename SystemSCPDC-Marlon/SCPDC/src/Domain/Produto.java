/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class Produto {
    private int id;
    private String nome;
    private String cor;
    private int volume;
    private int quantidade;
    private double valor;
    
    public static int nextId = 0;
    
    public Produto(){
        this.id = Produto.nextId;
        Produto.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public Object[] lerDados(Produto p) {
        return new Object[]{p.getId(), p.getNome(), p.getCor(), p.getVolume(), 
            p.getValor(), p.getQuantidade()};
    }
}
