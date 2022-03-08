package org.baraka.fast.spirit.repository.connection;

import org.baraka.fast.spirit.repository.conformity.ConformityPrimitiveTypeException;
import org.baraka.fast.spirit.repository.convertor.FieldNameNotExist;
import org.baraka.fast.spirit.repository.convertor.Table;
import org.baraka.fast.spirit.repository.convertor.TableException;
import org.baraka.fast.spirit.repository.convertor.TwiceFieldName;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

public class Connection {
    public Connection (String url, String username, String password, String driver, MethodConnection method, List<Class> repositories) throws TableException {
        Map<String, Table> tables = Table.fromRepositories(repositories);
        try {
            Class.forName(driver);
            java.sql.Connection conn = DriverManager.getConnection(url, username, password);
            if (method == MethodConnection.UPDATE) update(conn, repositories);
            else if (method == MethodConnection.DROP) drop(conn, repositories);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void update(java.sql.Connection conn, List<Class> repositories) throws SQLException {
        Statement statement = conn.createStatement();
        // statement.executeQuery();
    }
    private void drop(java.sql.Connection conn, List<Class> repositories) throws SQLException {
        update(conn, repositories);
    }
}
