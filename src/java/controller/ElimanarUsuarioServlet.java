/*
Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 20-03-2022
  fecha actualización 24-03-2022
  Descripción:Servlet Eliminar Usuario
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

public class ElimanarUsuarioServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idUsuario = Integer.parseInt(request.getParameter("Codigo"));
        // String idUsuario=request.getParameter("Codigo");
        IUsuarioService service = new UsuarioServiceImpl();

        service.eliminarResgistro(idUsuario);
        response.sendRedirect("ListaUsuarioServlet");
    }

}
