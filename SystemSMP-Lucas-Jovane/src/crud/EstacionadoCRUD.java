/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;
import database.DataBase;
import domain.Estacionado;
import domain.Vaga;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
/**
 *
 * @author Jovane
 */
public class EstacionadoCRUD {
    public void inserir(Estacionado estacionado){
        DataBase.lstEstacionados.add(estacionado);
    }
    public void remove(Estacionado estacionado){
        DataBase.lstEstacionados.remove(estacionado);
    }
    public ArrayList<Estacionado> listar(){
        return DataBase.lstEstacionados;
    }
    public Estacionado ler(Vaga vaga, Date horaInicial ){
        for(Estacionado e: DataBase.lstEstacionados){
            if(e.getVaga()==vaga && e.getTempoInical()==horaInicial){
                return e;
            }
        }
        return null;
    }
    public void alterar(Vaga vaga, Date horaInicial, Estacionado est){
         for(Estacionado e: DataBase.lstEstacionados){
            if(e.getVaga()==vaga && e.getTempoInical()==horaInicial){
                e.setFuncionario(est.getFuncionario());
                e.setTempoFinal(est.getTempoFinal());
                e.setTempoInical(est.getTempoInical());
                e.setVaga(est.getVaga());
                e.setValorTotal(e.getValorTotal());
                break;
            }
        }
    }
}
