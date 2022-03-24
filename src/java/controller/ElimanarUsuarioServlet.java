/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
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
public class ElimanarUsuarioServlet extends HttpServlet {


   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int idUsuario=Integer.parseInt(request.getParameter("Codigo"));
     // String idUsuario=request.getParameter("Codigo");
      IUsuarioService service=new UsuarioServiceImpl();
      
      service.eliminarResgistro(idUsuario);
      response.sendRedirect("ListaUsuarioServlet");
    }

   

}
