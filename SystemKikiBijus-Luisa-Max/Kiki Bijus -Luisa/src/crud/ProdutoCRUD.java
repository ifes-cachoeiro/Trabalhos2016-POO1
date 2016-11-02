/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisa
 */
public class ProdutoCRUD {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Produto produto) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO produto(nome_produto, quant_produto, valor_compra, cod_fornecedor) VALUES(?,?,?,?);");
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setFloat(3, produto.getValor());
            stmt.setInt(4, produto.getCodigoFornecedor());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public ArrayList<Produto> read() {
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT cod_produto, nome_produto, quant_produto, valor_compra, cod_fornecedor FROM produto;");
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Produto aux = new Produto();
                aux.setCodigo(resultado.getInt("cod_produto"));
                aux.setNome(resultado.getString("nome_produto"));
                aux.setQuantidade(resultado.getInt("quant_produto"));
                aux.setValor(resultado.getFloat("valor_compra"));
                aux.setCodigoFornecedor(resultado.getInt("cod_fornecedor"));

                listaProdutos.add(aux);
            }
            return listaProdutos;
        } catch (SQLException ex) {
            return null;
        }
    }

    public Produto read(Produto produto) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT cod_produto, nome_produto, quant_produto, valor_compra, cod_fornecedor FROM produto"
                            + " WHERE cod_produto=? LIMIT 1;");

            stmt.setInt(1, produto.getCodigo());

            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Produto aux = new Produto();
                aux.setCodigo(resultado.getInt("cod_produto"));
                aux.setNome(resultado.getString("nome_produto"));
                aux.setQuantidade(resultado.getInt("quant_produto"));
                aux.setQuantidade(resultado.getInt("valor_compra"));  
                aux.setCodigoFornecedor(resultado.getInt("cod_fornecedor"));
                return aux;
            } else {
                return null;
            }
        } catch (SQLException ex) {

            return null;
        }
    }

    public boolean update(Produto produto) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE produto" +
                        " SET nome_produto=?, quant_produto=?, valor_compra=?\n" +
                        " WHERE cod_produto=?;");
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setFloat(3, produto.getValor());
            stmt.setInt(4, produto.getCodigo());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean delete(Produto produto) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "DELETE FROM produto WHERE cod_produto=?;");
            stmt.setInt(1, produto.getCodigo());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

}
