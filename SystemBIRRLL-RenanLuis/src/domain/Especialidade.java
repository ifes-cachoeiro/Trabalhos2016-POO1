/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Vinicius
 */
public class Especialidade {

    private int cod_especialidade = 0;
    public static int auxE = 0;
    private String nome_especialidade;

    public Especialidade() {
        cod_especialidade += auxE++;
    }

    public int getCod_especialidade() {
        return cod_especialidade;
    }

    public void setCod_especialidade(int cod_especialidade) {
        this.cod_especialidade = cod_especialidade;
    }

    public String getNome_especialidade() {
        return nome_especialidade;
    }

    public void setNome_especialidade(String nome_especialidade) {
        this.nome_especialidade = nome_especialidade;
    }

    public Object[] obterDados(Especialidade e) {

        return new Object[]{e.getNome_especialidade(), e.getCod_especialidade()};
    }
}
