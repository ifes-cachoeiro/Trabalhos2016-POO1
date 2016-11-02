package domain;

/**
 *
 * @author Maicon
 */
public class Produto {
    private int id = 0;
    private String nome;
    private String descricao;
    private double valor;
    
    public static int nextId = 0;
    
    public void Produto(){
        this.id = Produto.nextId;
        Produto.nextId++;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception{
        if(valor < 0)
            throw new Exception("Valor negativo!");
        else
            this.valor = valor;
    }
    
}
