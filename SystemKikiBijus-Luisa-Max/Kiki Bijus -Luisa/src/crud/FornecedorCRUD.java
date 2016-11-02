/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisa
 */
public class FornecedorCRUD {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Fornecedor fornecedor) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO fornecedor(nome_fornecedor, cidade_fornecedor, bairro_fornecedor, rua_fornecedor,"
                    + " numero_fornecedor, cnpj_fornecedor, tel_fornecedor)"
                    + " VALUES(?,?,?,?,?,?,?);");
            stmt.setString(1, fornecedor.getNome());
            stmt.setInt(2, fornecedor.getCidade());
            stmt.setString(3, fornecedor.getBairro());
            stmt.setString(4, fornecedor.getRua());
            stmt.setInt(5, fornecedor.getNumero());
            stmt.setString(6, fornecedor.getCnpj());
            stmt.setString(7, fornecedor.getTelefone());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
        }
        return false;
    }

    public ArrayList<Fornecedor> read() {
        ArrayList<Fornecedor> listaClientes = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT cod_fornecedor, nome_fornecedor, cidade_fornecedor, bairro_fornecedor, rua_fornecedor,"
                    + " numero_fornecedor, cnpj_fornecedor, tel_fornecedor"
                    + " FROM fornecedor;");
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Fornecedor aux = new Fornecedor();
                aux.setId(resultado.getInt("cod_fornecedor"));
                aux.setNome(resultado.getString("nome_fornecedor"));
                aux.setCpf(resultado.getString("cnpj_fornecedor"));
                aux.setTelefone(resultado.getString("tel_fornecedor"));
                listaClientes.add(aux);
            }
            return listaClientes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Fornecedor read(Fornecedor fornecedor) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT cod_fornecedor, nome_fornecedor, cidade_fornecedor, bairro_fornecedor, rua_fornecedor,"
                    + " numero_fornecedor, cnpj_fornecedor, tel_fornecedor)"
                    + " FROM fornecedor WHERE cod_fornecedor=? LIMIT 1;");

            stmt.setInt(1, fornecedor.getId());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Fornecedor aux = new Fornecedor();

                aux.setId(resultado.getInt("cod_fornecedor"));
                aux.setNome(resultado.getString("nome_fornecedor"));
                aux.setCidade(resultado.getInt("cidade_fornecedor"));
                aux.setBairro(resultado.getString("bairro_fornecedor"));
                aux.setRua(resultado.getString("rua_fornecedor"));
                aux.setNumero(resultado.getInt("numero_fornecedor"));
                aux.setCpf(resultado.getString("cnpj_fornecedor"));
                aux.setTelefone(resultado.getString("telefone_fornecedor"));
                
                return aux;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean update(Fornecedor fornecedor) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE fornecedor"
                    + "   SET nome_fornecedor=?, cidade_fornecedor=?, bairro_fornecedor=?, rua_fornecedor=?,"
                    + " numero_fornecedor=?, cpf_fornecedor=?, tel_fornecedor=?"
                    + " WHERE cod_fornecedor=?;");

            stmt.setString(1, fornecedor.getNome());
            stmt.setInt(2, fornecedor.getCidade());
            stmt.setString(3, fornecedor.getBairro());
            stmt.setString(4, fornecedor.getRua());
            stmt.setInt(5, fornecedor.getNumero());
            stmt.setString(6, fornecedor.getCnpj());
            stmt.setString(7, fornecedor.getTelefone());
            stmt.setInt(8, fornecedor.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean delete(Fornecedor fornecedor) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "DELETE FROM fornecedor"
                    + " WHERE cod_fornecedor=?;");
            stmt.setInt(1, fornecedor.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
