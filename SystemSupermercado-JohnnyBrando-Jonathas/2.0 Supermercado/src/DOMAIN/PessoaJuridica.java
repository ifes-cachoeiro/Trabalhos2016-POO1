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
public class PessoaJuridica extends Cliente{
    
    
    String CNPJ;

    public PessoaJuridica(String nome, String Cidade, String Bairro, String UF, String numero, String telefone_cliente, String CNPJ) {
        super(nome, Cidade, Bairro, UF, numero, telefone_cliente);
        this.CNPJ = CNPJ;
    }
    
    
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
}
