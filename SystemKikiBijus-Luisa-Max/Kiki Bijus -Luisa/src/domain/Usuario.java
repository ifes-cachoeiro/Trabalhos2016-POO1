package domain;

public class Usuario {

    private String nome;
    private String senha;
    private String email;
    private Integer id;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;        
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
}
