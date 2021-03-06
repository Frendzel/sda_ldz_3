package com.sda.jspexample;

import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Service
public class MySqlDbConnection {
    private Connection connection;

    public MySqlDbConnection() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/biblioteka", "swdprm", "swdprm");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }

    @PreDestroy
    public void destroy(){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
