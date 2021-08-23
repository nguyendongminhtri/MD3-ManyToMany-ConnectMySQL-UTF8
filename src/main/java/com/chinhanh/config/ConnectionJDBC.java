package com.chinhanh.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    private static Connection connection;

    private ConnectionJDBC() {
    }

//    public static final String URL = "jdbc:mysql://localhost:3306/book_manager?characterEncoding=UTF-8";
    public static final String URL = "mysql://b7132afa053dbf:fb387bec@eu-cdbr-west-01.cleardb.com/heroku_2302b9c80aec960?reconnect=true";
    public static final String USER = "root";
    public static final String PASSWORD = "Minhtri29092014";

    public static Connection getConnect(){
        if (connection==null){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );
            System.out.println("ket noi thanh cong");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("ket noi khong thanh cong");
            e.printStackTrace();
        }
        }

        return  connection;
    }
}
