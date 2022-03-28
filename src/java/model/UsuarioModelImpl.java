/*
Erik Jarquín Sánchez
Fecha de creación:07/03/2022
Fecha de actualización:
Descripción: Clase del producto
 */
package model;

import bd.Conexion;
import entity.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioModelImpl implements IUsuarioModel {

    private Conexion conexion;
    private Connection connection;
    private static Usuario usuario;

    @Override
    public void crearRegisto(Usuario usuario) {
        try {
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();

            String sql = "insert into usuario(nombreUsuario,contraseña,sexo,edad) values(?,?,?,?)";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
               // statement.setString(1, usuario.getCodigo());
                statement.setString(1, usuario.getNombreUsuario());
                statement.setString(2, usuario.getContraseña());
                statement.setString(3, usuario.getSexo());
                statement.setInt(4, usuario.getEdad());
                statement.executeUpdate();
                System.out.println("datos insertados correctamente...");

            }
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }

    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {

            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();

            String sql = "update usuario set nombreUsuario=?,contraseña=?,sexo=?,edad=? where codigo=?";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                //statement.setString(1, usuario.getCodigo());
                statement.setString(1, usuario.getNombreUsuario());
                statement.setString(2, usuario.getContraseña());
                statement.setString(3, usuario.getSexo());
                statement.setInt(4, usuario.getEdad());
                statement.setInt(5, usuario.getCodigo());
                statement.executeUpdate();
                System.out.println("datos actualizados correctamente...");

            }
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }

    }

    @Override
    public List<Usuario> obtenerRegistros() {
        List<Usuario> listaUsuario = null;
        try {
            ResultSet resultSet;
            listaUsuario = new ArrayList<>();
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "select *from usuario";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setCodigo(resultSet.getInt(1));
                    usuario.setNombreUsuario(resultSet.getString(2));
                    usuario.setContraseña(resultSet.getString(3));
                    usuario.setSexo(resultSet.getString(4));
                    usuario.setEdad(resultSet.getInt(5));

                    listaUsuario.add(usuario);
                }

            }
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }
        return listaUsuario;
    }

    //@Override
    @Override
    public Usuario obtenerRegistro(int codigo) {
        Usuario usuario = null;
        try {
            ResultSet resultSet;
            usuario = new Usuario();
            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();
            String sql = "select *from usuario where codigo=?";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, codigo);
                resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    usuario.setCodigo(resultSet.getInt(1));
                    usuario.setNombreUsuario(resultSet.getString(2));
                    usuario.setContraseña(resultSet.getString(3));
                    usuario.setSexo(resultSet.getString(4));
                    usuario.setEdad(resultSet.getInt(5));

                }
            }
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }
        return usuario;
    }
    
    

    // @Override
    // public void eliminarResgistro(int idUsuario)
    public void eliminarResgistro(int codigo) {
        try {

            conexion = new Conexion();
            conexion.conectar();
            connection = conexion.getConnection();

            String sql = "delete from usuario where codigo=?";
            try ( PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, codigo);
                statement.executeUpdate();
                System.out.println("datos eliminado correctamente...");

            }
            conexion.desconectar();
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {

        UsuarioModelImpl um = new UsuarioModelImpl();
        Usuario u = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();

        //u.setCodigo("123");
        u.setNombreUsuario("pedro");
        u.setContraseña("abc");
        u.setSexo("masculino");
        u.setEdad(30);

//        u2.setCodigo("1234");
        u2.setNombreUsuario("juana");
        u2.setContraseña("abd");
        u2.setSexo("femenino");
        u2.setEdad(23);
        //u3.setCodigo("12345");
        u3.setNombreUsuario("leonel");
        u3.setContraseña("abf");
        u3.setSexo("masculino");
        u3.setEdad(33);

         um.crearRegisto(u);
        um.crearRegisto(u2);
        um.crearRegisto(u3);

        // um.actualizarRegistro(u);
        //  um.eliminarResgistro("1234");
        // um.obtenerRegistros();
        // System.out.println(um.obtenerRegistros());
//        List<Usuario> listaUsuario = um.obtenerRegistros();
//        
//        for(Usuario usr:listaUsuario){
//            System.out.println("Nombre: " + usr.getNombreUsuario());
//            System.out.println("Contraseña: " + usr.getContraseña());
//            System.out.println("Codigo: " + usr.getCodigo());
//        }
        //obtener 
//        Usuario u1 = new Usuario();
//        u1 = um.obtenerRegistro("1234");
//        System.out.println("Un usuario: " +u1.getNombreUsuario());
    }

    

    

    

}
