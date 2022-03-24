/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
