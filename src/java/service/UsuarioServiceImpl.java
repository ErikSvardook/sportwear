/*
Erik Jarquín Sánchez
Fecha de creación:07/03/2022
Fecha de actualización:
Descripción: Clase del producto
 */
package service;

import entity.Usuario;
import java.util.List;
import model.IUsuarioModel;
import model.UsuarioModelImpl;

/**
 *
 * @author labso10
 */
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
