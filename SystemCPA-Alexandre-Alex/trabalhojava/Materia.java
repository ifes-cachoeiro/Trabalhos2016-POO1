package trabalhojava;

/**
 *
 * @author Alexandre
 */
public class Materia {
    
    private int id;
    private String nome;
    private String qtdAula;

    public static int nextID = 1;
    
    public Materia(){
        this.id = Materia.nextID;
        Materia.nextID++;
        this.nome = null;
        this.qtdAula = "0";
                
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQtdAula() {
        return qtdAula;
    }

    public void setQtdAula(String qtdAula) {
        this.qtdAula = qtdAula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
