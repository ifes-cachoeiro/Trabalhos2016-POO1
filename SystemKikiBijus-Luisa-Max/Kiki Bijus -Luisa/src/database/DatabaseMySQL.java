package database;

import java.sql.Connection;

public class DatabaseMySQL implements Database {

    @Override
    public Connection connect() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void desconnect(Connection conn) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
