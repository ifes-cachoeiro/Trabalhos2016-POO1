
package trabalhojava;

/**
 *
 * @author Alexandre
 */
public class Professor {
    private int matricula;
    private String nome;
    
    public static int nextID = 1;
    
    public Professor(){
        this.matricula = Professor.nextID;
        Professor.nextID++;
        this.nome = null;
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
    
}
