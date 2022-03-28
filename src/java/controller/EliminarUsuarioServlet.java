/*
Erik Jarquín Sánchez
Fecha de creación:07/03/2022
Fecha de actualización:
Descripción: Clase del producto
 */
package controller;

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
public class EliminarUsuarioServlet extends HttpServlet {


   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int idUsuario=Integer.parseInt(request.getParameter("Codigo"));
     // String idUsuario=request.getParameter("Codigo");
      IUsuarioService service=new UsuarioServiceImpl();
      
      service.eliminarResgistro(idUsuario);
      response.sendRedirect("ListaUsuarioServlet");
    }

   

}
