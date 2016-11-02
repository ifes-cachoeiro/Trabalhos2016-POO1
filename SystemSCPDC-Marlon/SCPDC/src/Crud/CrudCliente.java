/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crud;

import Domain.Cliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Database.database;

/**
 *
 * @author Thiago Mendes, Marlon Linhares
 */
public class CrudCliente {

    database Dados = new database();

    public void novoCliente(String nome, String cnpj, String telefone, String uf,
            String cidade, String bairro, String rua) {
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setCnpj(cnpj);
        c.setTelefone(telefone);
        c.setUf(uf);
        c.setCidade(cidade);
        c.setBairro(bairro);
        c.setRua(rua);
        Dados.lstCliente.add(c);
    }

    public void AlterarCliente(Cliente c, String nome, String cnpj, String telefone,
            String uf, String cidade, String bairro, String rua) {
        
        c.setNome(nome);
        c.setCnpj(cnpj);
        c.setTelefone(telefone);
        c.setUf(uf);
        c.setCidade(cidade);
        c.setBairro(bairro);
        c.setRua(rua);
    }

    public Cliente pesquisarCliente(int idAux) {
        for (Cliente c : Dados.lstCliente) {
            if (idAux == c.getId()) {
                return c;
            }
        }
        return null;
    }

    public void excluirCliente(Cliente c) {
        Dados.lstCliente.remove(c);
    }
}
