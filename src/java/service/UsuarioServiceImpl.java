/*
Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 20-03-2022
  fecha actualización 24-03-2022
  Descripción:Usuario Service impl
 */
package service;

import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.UsuarioModelImpl;


public class UsuarioServiceImpl implements IUsuarioService {

    IUsuarioModel modelo = new UsuarioModelImpl();

    @Override
    public void crearRegisto(Usuario usuario) {
        modelo.crearRegisto(usuario);
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        modelo.actualizarRegistro(usuario);
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

    @Override
    public Usuario obtenerRegistro(int codigo) {
        return modelo.obtenerRegistro(codigo);
    }

    @Override
    public void eliminarResgistro(int codigo) {
        modelo.eliminarResgistro(codigo);

    }

}
