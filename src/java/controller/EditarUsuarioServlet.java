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
        
        out.println("<form action='GuardarEditarUsuarioServlet' method='GET'>");
        out.println("<input type='hidden' name='codigo' value='" + usuario.getCodigo() + "'/>");
        out.println("<label>nombre</label>");
        out.println("<input type='text' name='NombreUsuario' value='" + usuario.getNombreUsuario() + "'/>");
        out.println("<label>contraseña</label>");
        out.println("<input type='text' name='contraseña' value='" + usuario.getContraseña() + "'/>");
        out.println("<label>sexo</label>");
        out.println("<input type='text' name='sexo' value='" + usuario.getSexo() + "'/>");
        out.println("<label>edad</label>");
        out.println("<input type='text' name='edad' value='" + usuario.getEdad() + "'/>");
        out.print("<input type='submit' value='Enviar'/>");
        out.println("</form>");
    }

}
