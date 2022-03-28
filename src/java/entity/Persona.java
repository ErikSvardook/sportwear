/*
Erik Jarquín Sánchez
Fecha de creación:07/03/2022
Fecha de actualización:
Descripción: Clase del producto
 */
package entity;

public abstract class Persona {

    String usuario;
    private String sexo;
    private int edad;

    public Persona() {
    }

    public Persona(String usuario, String sexo, int edad) {
        this.usuario = usuario;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
