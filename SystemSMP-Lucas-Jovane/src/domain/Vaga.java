/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jovane
 */
public class Vaga {
    //Vagas: idVaga,Status(Ocupado,Desocupado),Placa;
    private static int nextNumero=0;
    private int numero;
    private boolean status;
    private Veiculo veiculo;

    public Vaga() {
        nextNumero++;
        this.numero = nextNumero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }


}
