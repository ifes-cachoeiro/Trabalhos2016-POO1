/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import database.DataBase;
import domain.Especialidade;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class EspecialidadeCRUD {

    public void inserir(Especialidade especialidade) {
        DataBase.lstEspecialidade.add(especialidade);
    }

    public ArrayList<Especialidade> ler() {
        return DataBase.lstEspecialidade;
    }

    public void alterar(int codigo, Especialidade especialidade) {
        for (Especialidade b : DataBase.lstEspecialidade) {
            if (b.getCod_especialidade() == codigo) {
                b.setCod_especialidade(especialidade.getCod_especialidade());
                b.setNome_especialidade(especialidade.getNome_especialidade());
                break;
            }
        }
    }

    public Especialidade ler(int cod) {
        for (Especialidade b : DataBase.lstEspecialidade) {
            if (b.getCod_especialidade() == cod) {
                return b;
            }
        }
        return null;
    }

    public void remove(Especialidade especialidade) {
        DataBase.lstEspecialidade.remove(especialidade);
    }

}
