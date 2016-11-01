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
public class Professor {
    private int cod_professor;
    public static int auxP = 0;
    private String telefone;
    private String bairro;
    private String cpf;
    private String cep;
    private String nome_professor;
    private Double salario;
    private Especialidade especialidade;
    private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Professor(){
        cod_professor = auxP++;
    }
    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public int setSalario(Double salario) {
        if(salario > 0){
            this.salario = salario;
            return 1;
        }else{
            return 0;
        }
        
    }

    public int getCod_professor() {
        return cod_professor;
    }

    public void setCod_professor(int cod_professor) {
        this.cod_professor = cod_professor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome_professor() {
        return nome_professor;
    }

    public void setNome_professor(String nome_professor) {
        this.nome_professor = nome_professor;
    }
    
    
      public Object[] obterDados(Professor e){
        
        return new Object[]{e.getNome_professor(), e.getCod_professor(),
            e.getEspecialidade().getNome_especialidade(), e.getCpf(),
            e.getBairro(), e.getCep(), e.getSalario(), e.getSexo(), e.getTelefone()};
    }
    
    
    
    
}
