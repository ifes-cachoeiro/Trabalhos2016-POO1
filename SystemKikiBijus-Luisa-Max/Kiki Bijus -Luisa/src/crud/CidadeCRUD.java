/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Cidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisa
 */
public class CidadeCRUD {
    
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
public boolean create(Cidade cidade) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO cidade(nome_cidade, sigla_uf) VALUES(?,?);");
            stmt.setString(1, cidade.getNome());
            stmt.setString(2, cidade.getSigla_uf());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public ArrayList<Cidade> read(String sig_uf) {
        ArrayList<Cidade> listaCidades = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT id_cidade,nome_cidade, sigla_uf FROM cidade WHERE sigla_uf=?;");
            stmt.setString(1, sig_uf);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Cidade aux = new Cidade();
                aux.setCod_cidade(resultado.getInt("id_cidade"));
                aux.setNome(resultado.getString("nome_cidade"));
                aux.setSigla_uf(resultado.getString("sigla_uf"));
                listaCidades.add(aux);
            }
            return listaCidades;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Cidade read(Cidade cidade) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT nome_cidade, sigla_uf FROM cidade WHERE cod_cidade=? LIMIT 1;");

            stmt.setInt(1, cidade.getCod_cidade());
            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Cidade aux = new Cidade();

                aux.setNome(resultado.getString("nome_cidade"));
                aux.setSigla_uf(resultado.getString("sigla_uf"));
                return aux;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean update(Cidade cidade) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE cidade SET nome_cidade=?, sigla_uf=? WHERE cod_cidade=?;");

            stmt.setString(1, cidade.getNome());
            stmt.setString(2, cidade.getSigla_uf());
            stmt.setInt(3, cidade.getCod_cidade());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean delete(Connection conn, Cidade cidade) {
        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "DELETE FROM cidade WHERE cod_cidade=?;");
            stmt.setInt(1, cidade.getCod_cidade());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
