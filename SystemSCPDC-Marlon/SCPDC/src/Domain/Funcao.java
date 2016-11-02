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
public class Funcao {
    private int id;
    private String descricao;
    private double salario;
    
    public static int nextId = 0;
    
    public Funcao(){
        this.id = Funcao.nextId;
        Funcao.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Object[] lerDados(Funcao f) {
        return new Object[]{f.getId(), f.getDescricao(), f.getSalario()};
    }
}
