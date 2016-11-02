/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private Funcao func;
    private String cidade;
    private String bairro;
    
    private static int nextId = 0;
    
    public Funcionario(){
        this.id = Funcionario.nextId;
        Funcionario.nextId++;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Funcao getFunc() {
        return func;
    }

    public void setFunc(Funcao func) {
        this.func = func;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public Object[] lerDados(Funcionario f) {
        return new Object[]{f.getId(), f.getNome(), f.getCpf(), f.getFunc().getDescricao()};
    }
}
