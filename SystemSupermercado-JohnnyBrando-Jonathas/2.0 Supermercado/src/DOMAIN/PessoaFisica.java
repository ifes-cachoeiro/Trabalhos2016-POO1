/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOMAIN;

/**
 *
 * @author Nunu
 */
public class PessoaFisica extends Cliente{
    
    private String CPF;

    public PessoaFisica(String nome, String Cidade, String Bairro, String UF, String numero, String telefone_cliente, String CPF) {
        super(nome, Cidade, Bairro, UF, numero, telefone_cliente);
        this.CPF = CPF;
    }
    
    

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
}
