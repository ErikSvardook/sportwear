/*
 Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 11-03-2022
  fecha actualización: 14-03-2022
  Descripción: interface IUsuarioModel
 */
package model;

import entity.Usuario;
import java.util.List;


public interface IUsuarioModel {
public void crearRegisto(Usuario usuario);
public void actualizarRegistro(Usuario usuario);
public List<Usuario>obtenerRegistros();
public Usuario obtenerRegistro(int codigo);
public void eliminarResgistro(int codigo);
//public void eliminarResgistro(int idUsuario);

}
