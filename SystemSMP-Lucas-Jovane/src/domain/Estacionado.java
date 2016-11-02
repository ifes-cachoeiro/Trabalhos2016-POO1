/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author Jovane
 */
public class Estacionado {
   // Estacionado: idVaga,TempoInical,TempoFinal,ValorTotal,idFuncionario;
    private Vaga vaga;
    private Date tempoInical;
    private Date tempoFinal;
    private float valorTotal;
    private Funcionario  funcionario;

    public Estacionado() {

    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Date getTempoInical() {
        return tempoInical;
    }

    public void setTempoInical(Date tempoInical) {
        this.tempoInical = tempoInical;
    }

    public Date getTempoFinal() {
        return tempoFinal;
    }

    public void setTempoFinal(Date tempoFinal) {
        this.tempoFinal = tempoFinal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }


}
