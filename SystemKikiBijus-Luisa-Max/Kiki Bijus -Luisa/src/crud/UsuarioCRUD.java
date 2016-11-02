package crud;

import domain.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioCRUD {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean create(Usuario user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "INSERT INTO usuario(nome_usuario,email_usuario,senha_usuario)"
                    + " VALUES(?,?,md5(?));");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getSenha());

            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public ArrayList<Usuario> read() {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT id_usuario,email_usuario,nome_usuario"
                    + " FROM usuario;");
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Usuario aux = new Usuario("", "");
                aux.setId(resultado.getInt("id_usuario"));
                aux.setEmail(resultado.getString("email_usuario"));
                aux.setNome(resultado.getString("nome_usuario"));
                listaUsuarios.add(aux);
            }
            return (listaUsuarios);
        } catch (SQLException ex) {
            return null;
        }
    }

    public Usuario read(Usuario user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "SELECT *"
                    + "FROM usuario WHERE email_usuario=? AND senha_usuario= md5(?) LIMIT 1;");

            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getSenha());

            ResultSet resultado = stmt.executeQuery();
            if (resultado.next()) {
                Usuario aux = new Usuario("", "");
                aux.setId(resultado.getInt("id_usuario"));
                aux.setEmail(resultado.getString("email_usuario"));
                aux.setSenha(resultado.getString("senha_usuario"));
                aux.setNome(resultado.getString("nome_usuario"));
                return aux;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            return null;
        }
    }

    public boolean update(Usuario user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "UPDATE usuario"
                    + " SET nome_usuario=?, senha_usuario= md5(?), email_usuario=?"
                    + " WHERE id_usuario=?;");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getSenha());
            stmt.setString(3, user.getEmail());
            stmt.setInt(4, user.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean delete(Usuario user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(
                    "DELETE FROM usuario"
                    + " WHERE id_usuario=?;");
            stmt.setInt(1, user.getId());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
}
