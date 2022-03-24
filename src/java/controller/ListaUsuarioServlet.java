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
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

public class ListaUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estilo.css'/>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet</h1>");
        out.println("<table border='10'>");
        out.println("<tr>");
        out.println("<th>codigo</th>");
        out.println("<th>pwd</th>");
        out.println("<th>nombre</th>");
        out.println("<th>sexo</th>");
        out.println("<th>edad</th>");
        out.println("<th>editar</th>");
        out.println("<th>eliminar</th>");
       
        out.println("</tr>");
        IUsuarioService service = new UsuarioServiceImpl();
        List<Usuario> listaUsuario = service.obtenerRegistros();
        out.println("<tbody>");
        for (Usuario usuario : listaUsuario) {
            out.println("<tr>");
            out.println("<td>" + usuario.getCodigo() + "</td>" + "<td>" + usuario.getContraseña() + "</td>" + "<td>" + usuario.getNombreUsuario() + "</td>"
                    + "<td>" + usuario.getSexo() + "</td>" + "<td>" + usuario.getEdad() + "</td>");
            out.println("<td><a href='EditarUsuarioServlet?Codigo=" + usuario.getCodigo() + "'>Editar</a></td>");
            out.println("<td><a href='ElimanarUsuarioServlet?Codigo=" + usuario.getCodigo() + "'>Eliminar</a></td>");
            out.println("</tr>");
        }

        out.println("</tbody>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }

}
