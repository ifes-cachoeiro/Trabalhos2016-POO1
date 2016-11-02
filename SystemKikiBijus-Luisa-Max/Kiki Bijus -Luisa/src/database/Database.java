package database;

import java.sql.Connection;

public interface Database {

    public Connection connect();

    public void desconnect(Connection conn);

}
