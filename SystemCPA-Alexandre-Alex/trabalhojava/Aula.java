/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhojava;
import java.util.ArrayList;

/**
 *
 * @author Alexandre
 */
public class Aula {
    private int id;
    private String data;
    private int qtde;
    private Materia materia;
    private Professor professor;
    private Aluno a;
    
    public static int nextID = 1;
    
    public Aula(){
        this.id = Aula.nextID;
        Aula.nextID++;
        this.data = "00/00/00";
        this.materia = null;
        this.professor = null;
        this.qtde = 0;
        
        
    }
    
    ArrayList<Aluno> lstAluno = new ArrayList<>();

    public void addAluno(Aluno aluno){
        this.lstAluno.add(aluno);
    }
    
    public Aluno getAluno(int matricula){
        for(Aluno a : lstAluno){
            if(a.getMatricula() == matricula){
                return a;
                
            }
        }
        return null;
        
 }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

                                
    public ArrayList<Aluno> getLstAluno() {
        return lstAluno;
    }
    
    
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    private void presenca(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getId(int op5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getQtde(int op1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
