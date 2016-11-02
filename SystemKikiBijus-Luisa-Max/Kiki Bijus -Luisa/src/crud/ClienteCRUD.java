/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisa
 */
public class ClienteCRUD {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Cliente cliente) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO cliente(nome_cliente, cidade_cliente, bairro_cliente, rua_cliente,"
                    + " numero_cliente, cpf_cliente, tel_cliente, dt_cliente)"
                    + " VALUES(?,?,?,?,?,?,?,?);");
            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getCidade());
            stmt.setString(3, cliente.getBairro());
            stmt.setString(4, cliente.getRua());
            stmt.setInt(5, cliente.getNumero());
            stmt.setString(6, cliente.getCpf());
            stmt.setString(7, cliente.getTelefone());
            stmt.setString(8, cliente.getDtnascimento());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
        }
        return false;
    }

    public ArrayList<Cliente> read() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT cod_cliente, nome_cliente, cidade_cliente, bairro_cliente, rua_cliente,"
                    + " numero_cliente, cpf_cliente, tel_cliente, dt_cliente"
                    + " FROM cliente;");
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Cliente aux = new Cliente();
                aux.setId(resultado.getInt("cod_cliente"));
                aux.setNome(resultado.getString("nome_cliente"));
                aux.setCpf(resultado.getString("cpf_cliente"));
                aux.setTelefone(resultado.getString("tel_cliente"));
                listaClientes.add(aux);
            }
            return listaClientes;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Cliente read(Cliente cliente) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT cod_cliente, nome_cliente, cidade_cliente, bairro_cliente, rua_cliente,"
                    + " numero_cliente, cpf_cliente, tel_cliente, dt_cliente)"
                    + " FROM cliente WHERE cod_cliente=? LIMIT 1;");

            stmt.setInt(1, cliente.getId());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Cliente aux = new Cliente();

                aux.setId(resultado.getInt("cod_cliente"));
                aux.setNome(resultado.getString("nome_cliente"));
                aux.setCidade(resultado.getInt("cidade_cliente"));
                aux.setBairro(resultado.getString("bairro_cliente"));
                aux.setRua(resultado.getString("rua_cliente"));
                aux.setNumero(resultado.getInt("numero_cliente"));
                aux.setCpf(resultado.getString("cpf_cliente"));
                aux.setTelefone(resultado.getString("telefone_cliente"));
                aux.setDtnascimento(resultado.getString("dt_cliente"));
                return aux;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean update(Cliente cliente) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE cliente"
                    + "   SET nome_cliente=?, cidade_cliente=?, bairro_cliente=?, rua_cliente=?,"
                    + " numero_cliente=?, cpf_cliente=?, tel_cliente=?, dt_cliente=?"
                    + " WHERE cod_cliente=?;");

            stmt.setString(1, cliente.getNome());
            stmt.setInt(2, cliente.getCidade());
            stmt.setString(3, cliente.getBairro());
            stmt.setString(4, cliente.getRua());
            stmt.setInt(5, cliente.getNumero());
            stmt.setString(6, cliente.getCpf());
            stmt.setString(7, cliente.getTelefone());
            stmt.setString(8, cliente.getDtnascimento());
            stmt.setInt(9, cliente.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean delete(Cliente client) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "DELETE FROM cliente"
                    + " WHERE cod_cliente=?;");
            stmt.setInt(1, client.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
