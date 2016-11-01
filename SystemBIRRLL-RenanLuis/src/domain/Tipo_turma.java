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
public class Tipo_turma {

    private int cod_tipo_turma;
    public static int auxTT = 0;
    private String descricao;
    private Double preco;
    private String nome_tipo;

    public Tipo_turma() {
        cod_tipo_turma = auxTT++;
    }

    public int getCod_tipo_turma() {
        return cod_tipo_turma;
    }

    public void setCod_tipo_turma(int cod_tipo_turma) {
        this.cod_tipo_turma = cod_tipo_turma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public String getNome_tipo() {
        return nome_tipo;
    }

    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public Object[] obterDados(Tipo_turma tt) {

        return new Object[]{tt.getNome_tipo(), tt.getCod_tipo_turma(), tt.getPreco(), tt.getDescricao()};
    }

}
