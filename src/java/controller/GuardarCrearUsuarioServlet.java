/*
Erik Jarquín Sánchez
Fecha de creación:07/03/2022
Fecha de actualización:
Descripción: Clase del producto
 */
package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import service.IUsuarioService;
import service.UsuarioServiceImpl;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author labso10
 */
public class GuardarCrearUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        int idUsuario=Integer.parseInt(request.getParameter("edad"));
        //usuario.setCodigo(Integer.parseInt(request.getParameter("codigo")));
        usuario.setNombreUsuario(request.getParameter("NombreUsuario"));
        usuario.setContraseña(request.getParameter("contraseña"));
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setEdad(idUsuario);
        service.crearRegisto(usuario);
        response.sendRedirect("ListaUsuarioServlet");
    }

}
