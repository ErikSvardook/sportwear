/*
Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 20-03-2022
  fecha actualización 24-03-2022
  Descripción:Servlet Guardar Usuario
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

public class GuardarCrearUsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        IUsuarioService service = new UsuarioServiceImpl();
        Usuario usuario = new Usuario();
        
        //checar lo del codigooooooooooo
        //usuario.setCodigo(request.getParameter("codigo"));
        usuario.setNombreUsuario(request.getParameter("NombreUsuario"));
        usuario.setContraseña(request.getParameter("contraseña"));
        usuario.setSexo(request.getParameter("sexo"));
        usuario.setEdad(Integer.parseInt(request.getParameter("edad")));
        service.crearRegisto(usuario);
        response.sendRedirect("ListaUsuarioServlet");
    }

}
