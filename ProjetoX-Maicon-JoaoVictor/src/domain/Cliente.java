package domain;


public class Cliente {
    private int id = 0;
    private String nome;
    private String telefone;
    private String endereco;
    public static int nextId = 0;

    public void Incremento(){
        this.id = Cliente.nextId;
        Cliente.nextId++;
        }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

  
    
    
}
