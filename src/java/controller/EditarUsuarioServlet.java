/*
Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 20-03-2022
  fecha actualización 24-03-2022
  Descripción:Servlet Editar Usuario
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
        System.out.println("aquí");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        // String idUsuario=request.getParameter("Codigo");
        int idUsuario = Integer.parseInt(request.getParameter("Codigo"));
        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        usuario = service.obtenerRegistro(idUsuario);
        out.println("<link rel=\"stylesheet\" href=\"../resources/css/estiloCrearRegistro.css\">");
        out.print("<body class='body'>");
        out.println("<div class=\"contact_form\">");
        out.println("<div class=\"formulario\">");
        out.println("<h1>Editar Usuario</h1>");
          out.println("<h3>Ingrese los datos que se te pide</h3>");
        //  out.println(" <legend>Editar Usuario</legend>");
        out.println("<form class='color' action='GuardarEditarUsuarioServlet' method='GET'>");
        out.println("<input type='hidden' name='codigo' value='" + usuario.getCodigo() + "'/>");

        out.println(" <p>");
        out.println("<label for=\"fname\">Nombre:<span class=\"obligatorio\">*</span></label><br>");
        out.println("");
        out.println("<input type='text' name='NombreUsuario' required=\"obligatorio\" value='" + usuario.getNombreUsuario() + "'/>");
        out.println(" </p>");
        out.println(" <p>");
        out.println(" <br><label for=\"fname\">Edad:<span class=\"obligatorio\">*</span></label><br>");
        out.println("<input type='text' name='edad' required=\"obligatorio\" value='" + usuario.getEdad() + "'/>");
        out.println(" </p>");
        out.println(" <b>Seleccione su sexo:</b>");
        
        out.println(" <p>");
        out.println("<label for=\"male\">Hombre<span class=\"obligatorio\">*</span></label>");
        out.println("<input type=\"radio\" name=\"sexo\" required=\"obligatorio\" value=\"Hombre\">");
         out.println("<label for=\"male\">Mujer<span class=\"obligatorio\">*</span></label>");
        out.println("<input type=\"radio\" name=\"sexo\" required=\"obligatorio\" value=\"Mujer\">");
       
        out.println(" </p>");
        out.println(" <p>");
        out.println("<label for=\"pwd\">Contraseña:<span class=\"obligatorio\">*</span></label><br>");
        out.println("<input type='text' name='contraseña' required=\"obligatorio\" value='" + usuario.getContraseña() + "'/>");
        out.println(" </p>");

        out.print("<button type=\"submit\" name=\"enviar_formulario\" id=\"enviar\"><p>Enviar</p></button>\n" +
"");
        out.print("<p class=\"aviso\">");
        out.print("<span class=\"obligatorio\"> * </span>los campos son obligatorios.");
        out.println(" </p>");

        out.println("</form>");
        out.println("</div>");
        out.println("</div");
        out.println("</body>");

    }

}
