/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import domain.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author luisa
 */
public class VendaCRUD {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Venda venda) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO venda(cod_cliente, total_venda, desconto, pagamento, cod_produto)"
                    + " VALUES(?,?,?,?,?);");
            stmt.setInt(1, venda.getCodCliente());
            stmt.setFloat(2, venda.getValorVenda());
            stmt.setFloat(3, venda.getDesconto());
            stmt.setString(4, venda.getPagamento());
            stmt.setInt(5, venda.getCodProduto());
            System.out.println("Cliente. " + venda.getCodCliente());
            System.out.println("Produto. " + venda.getCodProduto());
            System.out.println("Desconto. " + venda.getDesconto());
            System.out.println("Venda. " + venda.getValorVenda());
            System.out.println("Pagamento. " + venda.getPagamento());
            stmt.execute();
            return true;
        } catch (SQLException ex) {

            return false;
        }
    }

    public ArrayList<Venda> read() {
        ArrayList<Venda> listaVendas = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT cod_venda, cod_cliente, total_venda, desconto, pagamento, cod_produto FROM venda;");
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Venda aux = new Venda();
                aux.setCodigo(resultado.getInt("cod_venda"));
                aux.setCodCliente(resultado.getInt("cod_cliente"));
                aux.setDesconto(resultado.getFloat("desconto"));
                aux.setPagamento(resultado.getString("pagamento"));
                aux.setValorVenda(resultado.getFloat("total_venda"));
                aux.setCodProduto(resultado.getInt("cod_produto"));
                listaVendas.add(aux);
            }
            return listaVendas;
        } catch (SQLException ex) {
            return null;
        }
    }

}
