/*
 Autor:Vicente Leonel Vásquez Hernádez
  fecha creación: 07-03-2022
  fecha actualización: 08-03-2022
  Descripción: clase Producto
 */
package entity;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private String codigo;
    private String nombre;
    private Double precio;
    private String descripcion;

    public Producto() {
    }

    public Producto(String nombre, Double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static void main(String[] args) {
        Producto p = new Producto();
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        p.setCodigo("123");
        p.setDescripcion("Pants rojo");
        p.setNombre("Pants");
        p.setPrecio(200.0);

        p1.setCodigo("1234");
        p1.setDescripcion("medias azul");
        p1.setNombre("medias");
        p1.setPrecio(100.0);

        p2.setCodigo("12345");
        p2.setDescripcion("Playera verde");
        p2.setNombre("Playera");
        p2.setPrecio(500.0);

        //List lista = null;
        List<Producto> lista = new <Producto> ArrayList();
        lista.add(p);
        lista.add(p1);
        lista.add(p2);

        //Producto i =new Producto();
        for (Producto i : lista) {
            System.out.println("Codigo: " + i.getCodigo());
            System.out.println("Descripción: " + i.getDescripcion());
            System.out.println("Nombre: " + i.getNombre());
            System.out.println("Precio: " + i.getPrecio());
            System.out.println("\n");
        }

        //    System.out.println();  
    }

}
