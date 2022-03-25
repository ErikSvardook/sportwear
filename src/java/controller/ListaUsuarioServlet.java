/*
Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 20-03-2022
  fecha actualización 24-03-2022
  Descripción:Servlet Listar Usuario
 */
package controller;

import entity.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import service.IUsuarioService;
import service.UsuarioServiceImpl;

public class ListaUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='" + request.getContextPath() + "/resources/css/estilo.css'/>");
        out.println("</head>");
        out.println("<body class='body'>");
        out.println(" <legend>Lista de usuarios</legend>");
        out.println("<table border='10'>");
        out.println("<tr>");
        out.println("<th>Codigo</th>");
        out.println("<th>Pwd</th>");
        out.println("<th>Nombre</th>");
        out.println("<th>Sexo</th>");
        out.println("<th>Edad</th>");
        out.println("<th>Editar</th>");
        out.println("<th>Eliminar</th>");

        out.println("</tr>");
        IUsuarioService service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerRegistros();
        out.println("<tbody>");
        for (Usuario usuario : listaUsuario) {
            out.println("<tr>");
            out.println("<td>" + usuario.getCodigo() + "</td>" + "<td>" + usuario.getContraseña() + "</td>" + "<td>" + usuario.getNombreUsuario() + "</td>"
                    + "<td>" + usuario.getSexo() + "</td>" + "<td>" + usuario.getEdad() + "</td>");
            out.println("<td><a href='EditarUsuarioServlet?Codigo=" + usuario.getCodigo() + "'>Editar</a></td>");
            //out.println("<td><a href='ElimanarUsuarioServlet?Codigo=" + usuario.getCodigo() + "'>Eliminar</a></td>");
            out.println("<td><a href='ElimanarUsuarioServlet?Codigo=" + usuario.getCodigo() + "'onclick=\"return confirm('Estás seguro que deseas eliminar el registro?');\" >Eliminar</a></td>");
            out.println("</tr>");
        }

        out.println("</tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }

}
