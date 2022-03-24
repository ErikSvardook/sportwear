/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
