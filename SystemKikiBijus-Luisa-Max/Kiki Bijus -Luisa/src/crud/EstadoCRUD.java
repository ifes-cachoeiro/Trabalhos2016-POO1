/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisa
 */
public class EstadoCRUD {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Estado estado) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO uf(sigla_uf,nome_uf) VALUES(?,?);");
            stmt.setString(1, estado.getSigla());
            stmt.setString(3, estado.getNome());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public ArrayList<Estado> read() {
        ArrayList<Estado> listaEstados = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT sigla_uf, nome_uf FROM uf;");
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Estado aux = new Estado();
                aux.setSigla(resultado.getString("sigla_uf"));
                aux.setNome(resultado.getString("nome_uf"));
                listaEstados.add(aux);
            }
            return listaEstados;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Estado read(Estado estado) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT sigla_uf, nome_uf FROM uf WHERE sigla_uf=? LIMIT 1;");

            stmt.setString(1, estado.getSigla());

            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Estado aux = new Estado();
                aux.setSigla(resultado.getString("sigla_uf"));
                aux.setNome(resultado.getString("nome_uf"));
                return aux;
            } else {
                return null;
            }
        } catch (SQLException ex) {

            return null;
        }
    }

    public boolean update(Estado estado) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE uf"
                    + " SET nome_uf=?, sigla_uf=?"
                    + " WHERE sigla_uf=?;");
            stmt.setString(1, estado.getNome());
            stmt.setString(2, estado.getSigla());
            stmt.setString(3, estado.getSigla());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean delete(Estado estado) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "DELETE FROM uf WHERE sigla_uf=?;");
            stmt.setString(1, estado.getSigla());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
