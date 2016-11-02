package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabasePostgreSQL implements Database {

    private Connection conn;

    @Override
    public Connection connect() {
        try {
            this.conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/KikiBijus", "postgres", "admin");
            return this.conn;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar: " + ex.getMessage());
            return null;
        }
    }

    public void desconnect(Connection conn) {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao desconectar: " + ex.getMessage());
        }
    }
}
