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
public class Turma {
    private int cod_turma;
    public static int auxT = 0;
    private Professor professor;
    private Tipo_turma turma;

    public Tipo_turma getTipo_turma() {
        return turma;
    }

    public void setTipo_turma(Tipo_turma turma) {
        this.turma = turma;
    }
    
    public Turma(){
        cod_turma = auxT++;
    }
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

  

    public int getCod_turma() {
        return cod_turma;
    }

    public void setCod_turma(int cod_turma) {
        this.cod_turma = cod_turma;
    }

    public Object[] obterDados(Turma tt) {
        return new Object[]{tt.getCod_turma(), tt.getTipo_turma().getNome_tipo(), 
        tt.getProfessor().getNome_professor()
        };
    }
    
    
}
