/*
Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 20-03-2022
  fecha actualización 24-03-2022
  Descripción:Usuario Service
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
