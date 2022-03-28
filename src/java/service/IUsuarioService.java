/*
Erik Jarquín Sánchez
Fecha de creación:07/03/2022
Fecha de actualización:
Descripción: Clase del producto
 */
package service;

import entity.Usuario;
import java.util.List;

/**
 *
 * @author labso10
 */
public interface IUsuarioService {
   
public void crearRegisto(Usuario usuario);
public void actualizarRegistro(Usuario usuario);
public List<Usuario>obtenerRegistros();
public Usuario obtenerRegistro(int codigo);
public void eliminarResgistro(int codigo);
}
