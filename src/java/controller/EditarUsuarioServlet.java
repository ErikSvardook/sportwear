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
        out.println("<fieldset>");
        out.println(" <legend>Editar Usuario</legend>");
        out.println("<form class='color' action='GuardarEditarUsuarioServlet' method='GET'>");
        out.println("<input type='hidden' name='codigo' value='" + usuario.getCodigo() + "'/>");
        out.println("<label for=\"fname\">Nombre:</label><br>");
        out.println("<input type='text' name='NombreUsuario' value='" + usuario.getNombreUsuario() + "'/>");
        out.println("<br><br>");
        out.println("<label for=\"pwd\">Contraseña:</label><br>");
        out.println("<input type='text' name='contraseña' value='" + usuario.getContraseña() + "'/>");
        out.println("<br><br>");
        out.println(" <b>Seleccione su sexo:</b>");
        //out.println("<input type='text' name='sexo' value='" + usuario.getSexo() + "'/>");
        out.println("<input type=\"radio\" name=\"sexo\" value=\"Hombre\">");
        out.println("<label for=\"male\">Hombre</label>");
        out.println("<input type=\"radio\" name=\"sexo\" value=\"Mujer\">");
        out.println("<label for=\"male\">Mujer</label>");
        out.println("<br><br>");
        out.println(" <br><label for=\"fname\">Edad:</label><br>");
        out.println("<input type='text' name='edad' value='" + usuario.getEdad() + "'/>");
        out.println("<br><br>");
        out.print("<input type='submit' value='Enviar'/>");
        out.println("</form>");
        out.println("</fieldset>");
        out.println("</body>");

    }

}
