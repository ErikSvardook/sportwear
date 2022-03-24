/*
 Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 07-03-2022
  fecha actualización:08-03-2022
  Descripción: clase Usuario
 */
package entity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioModelImpl;


public class Usuario extends Persona{
    private int codigo;
    private String nombreUsuario;
    private String contraseña;
    private static Usuario usuario;

    public Usuario() {
    }

    public Usuario(int codigo, String nombreUsuario, String contraseña) {
        this.codigo = codigo;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
      public static void main(String[] args) throws SQLException {
        Usuario u1=new Usuario();
       // u1.setCodigo("123");
        u1.setNombreUsuario("Leonel");
        u1.setContraseña("abc12");
        u1.setEdad(30);
        u1.setSexo("Masculino");
        
       Usuario u2=new Usuario();
        
        //u2.setCodigo("1234");
        u2.setNombreUsuario("Maria");
        u2.setContraseña("asd");
        u2.setEdad(40);
        u2.setSexo("Masculino");
        
        Usuario u3=new Usuario();
       // u3.setCodigo("12345");
        u3.setNombreUsuario("David");
        u3.setContraseña("qwe");
        u3.setEdad(22);
        u3.setSexo("Masculino");
        
        
        /*List <Usuario> lista =new <Usuario> ArrayList();
        
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
        
        for(Usuario i:lista){
            System.out.println("Codigo: "+i.getCodigo());
            System.out.println("Nombre Usuario: "+i.getNombreUsuario());
            System.out.println("Contraseña: "+i.getContraseña());
            System.out.println("Edad: "+i.getEdad());
            System.out.println("Sexo: "+i.getSexo());
            System.out.println("\n");
        }*/
        
         UsuarioModelImpl um = new UsuarioModelImpl();
         um.crearRegisto(u1);
//          um.crearRegisto(u2);
//           um.crearRegisto(u3);
    // um.crearRegistro(usuario);
        
        
    }
    
    
}
