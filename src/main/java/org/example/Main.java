package org.example;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Usuarios", "postgres", "12345");
        try(Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from tbl_usuarios")) {
            while (rs.next()){
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Long doc = rs.getLong("doc");
                System.out.println("Usuario: " + nombre + " " + apellido + " - " + doc);
            }
        }
    }
}