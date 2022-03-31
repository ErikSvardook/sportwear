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
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estilo.css'/>");

        out.println("</head>");
        out.println("<body class='body'>");
        
        //out.println(" <h1>Lista de usuarios</h1>");
        
        out.println("<header class=\"header\">");
        out.println("<a href=\"\" class=\"logo\">Lista de usuarios</a>");
        out.println("<input class=\"menu-btn\" type=\"checkbox\" id=\"menu-btn\" />");
        out.println("<label class=\"menu-icon\" for=\"menu-btn\"><span class=\"navicon\"></span></label>");
        
        out.println("<ul class=\"menu\">");
        out.println("<li><a href='pages/crearRegistro.html'>Crear</a></li>");
        out.println("<li><a href='pages/index.html'>Regresar al inicio</a></li>");
        out.println("<li><a href='pages/Acercade.html'>Acerca de...</a></li>");
        out.println("</ul>");
        out.println("</header>");
        out.println("<br><br><br><br>");
        
        out.println("<div class=\"table-responsive\">");
        out.println("<table border='10'>");
        out.println("<tr>");
        out.println("<th>Codigo</th>");
        out.println("<th>Contraseña</th>");
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
        out.println("</div>");
        
        out.println("</body>");
        out.println("</html>");
    }
}
