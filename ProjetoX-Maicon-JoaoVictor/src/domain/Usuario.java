package domain;

/**
 *
 * @author Maicon
 */
public class Usuario {
    private int id = 0;
    private String nome;
    private String userName;
    private String pass;
    private String email;
    
    public static int nextId = 0;
    
    public void Incremento(){
        Usuario.nextId++;
        this.id = Usuario.nextId;
        
        }
    

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
