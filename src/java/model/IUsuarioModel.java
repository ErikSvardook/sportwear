/*
Erik Jarquín Sánchez
Fecha de creación:07/03/2022
Fecha de actualización:
Descripción: Clase del producto
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
