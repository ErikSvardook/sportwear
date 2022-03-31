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

public class EditarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // String idUsuario=request.getParameter("Codigo");
        int idUsuario = Integer.parseInt(request.getParameter("Codigo"));
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario = service.obtenerRegistro(idUsuario);
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estiloCrearRegistro.css'/>");
        //out.println("<link rel='stylesheet' href='"+request.getContextPath()+"/resources/css/estilo.css'/>");
        out.println("</head>");
        
        out.print("<body class='body'>");
       
        out.println("<div class='contact_form'>");
        out.println("<div class='formulario'>");
        
        out.println("<h1>Registro Usuario</h1>");
        out.println("<h3>Ingrese los datos que se te pide</h3>");
        
        //out.println("<form action=\"submeter-formulario.php\" method=\"post\">"); 
        out.println("<form class='color' action='GuardarEditarUsuarioServlet' method='GET'>"); 
        
        out.println("<input type='hidden' name='codigo' value='" + usuario.getCodigo() + "'/>");   
        
        out.println("<p>\n" +
"                        <label for=\"nombre\" class=\"colocar_nombre\">Nombre\n" +
"                            <span class=\"obligatorio\">*</span>\n" +
"                        </label>\n" +
"                        <input type=\"text\" name=\"NombreUsuario\"  value='" + usuario.getNombreUsuario() + "'/\">\n" +
"                    </p>");
        
        out.println("<p>\n" +
"                        <label for=\"asunto\" class=\"colocar_asunto\">Edad\n" +
"                            <span class=\"obligatorio\">*</span>\n" +
"                        </label>\n" +
"                        <input type=\"pssw\" name=\"edad\" value='" + usuario.getEdad() + "'/\">\n" +
"                    </p>");
        
        out.println("<p>\n" +
"                        <label for=\"asunto\" class=\"colocar_asunto\">Sexo\n" +
"                            <span class=\"obligatorio\">*</span>\n" +
"                        </label>\n" +
"                        <input type=\"pssw\" name=\"sexo\" value='" + usuario.getSexo() + "'/\">\n" +
"                    </p>");
        
        
        out.println("<p>\n" +
"                        <label for=\"asunto\" class=\"colocar_asunto\">Contraseña\n" +
"                            <span class=\"obligatorio\">*</span>\n" +
"                        </label>\n" +
"                        <input type=\"pssw\" name=\"contraseña\" value='" + usuario.getContraseña() + "'/\">\n" +
"                    </p>");
        
        out.print("<button type=\"submit\" name=\"enviar_formulario\" id=\"enviar\"><p>Enviar</p></button>");
        out.println("<input type=\"button\" onclick=\"history.back()\" name=\"volver atrás\" value=\"volver atrás\">");
        
        //out.println("</form>");
        out.println("</form>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        
    }
}

