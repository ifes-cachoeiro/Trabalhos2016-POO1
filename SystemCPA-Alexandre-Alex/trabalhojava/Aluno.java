
package trabalhojava;

/**
 *
 * @author Alexandre
 */
public class Aluno {
    private int matricula;
    private String nome;
    private String sala;
    
    
    public static int nextID = 1;
    
    public Aluno(){
        this.matricula = Aluno.nextID;
        Aluno.nextID++;
        this.nome = null;
        this.sala = null;
      
    }
   

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

  

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
