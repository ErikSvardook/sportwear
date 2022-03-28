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
         
        /*
         
       

        <fieldset>
            <legend>Registro de usuarios</legend>
            <form  class="color" action='../GuardarCrearUsuarioServlet' method='POST'>
                <input type='hidden' name='codigo' value=""/>
                <label for="fname">Nombre:</label><br>
                <input type='text' name='NombreUsuario' value=""><br>

                <label for="pwd">Contraseña:</label><br>
                <input type='text' name='contraseña' value=""/><br><br>


                <b>Seleccione su sexo:</b>
                <input type="radio" name="sexo" value="Hombre">
                <label for="male">Hombre</label>
                <input type="radio" name="sexo" value="Mujer">
                <label for="female">Mujer</label><br>

               
                <br><label for="fname">Edad:</label><br>
                <input type='text' name='edad' value="">
                <br> <br>

                <input type="submit" value="Guardar">
            </form>
          </fieldset>
         
         */ 
        
    }

}
