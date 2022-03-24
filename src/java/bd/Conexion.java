/*
 Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 08-03-2022
  fecha actualización: 04-03-2022
  Descripción: clase Conexion
 */
package bd;

import entity.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;
import model.UsuarioModelImpl;

public class Conexion {

    private static Usuario usuario;

    //public Connection conexion;
    private Connection connection;
    private String url;
    private String user;
    private String pwd;

    public Conexion() {

        this.url = "jdbc:postgresql://localhost/Sportswear";
        this.user = "postgres";
        this.pwd = "leonel92";
    }

    public void conectar() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("org.postgresql.Driver");

            } catch (ClassNotFoundException ex) {
                throw new SQLException(ex);
            }
            connection = DriverManager.getConnection(url, user, pwd);
            System.out.println("conexion establecida");
        }
        // return connection;
    }

    public void desconectar() throws SQLException {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            System.out.println("cerrando conexion...");
        } catch (Exception ex) {
            throw new SQLException(ex);
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
