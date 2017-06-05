/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jorge Antonio OA
 */
public class Libros implements Serializable {
    private String titulo;
    private String isbn;
    private Integer edicion;
    private Integer Npaginas;
    private editorial editorial;
    private String autor;
    private Integer cantidad;
    

    public Libros() {
        this.titulo="";
        this.isbn="";
        this.edicion=0;
        this.Npaginas=0;
//        this.editorial=(editorial);
        this.autor="";
        this.Npaginas=0;
    }

    public Libros(String titulo, String isbn, Integer edicion, Integer Npaginas, editorial editorial, String autor, Integer cantidad) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.edicion = edicion;
        this.Npaginas = Npaginas;
        this.editorial = editorial;
        this.autor = autor;
        this.cantidad = cantidad;
    }
  
     
 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getEdicion() {
        return edicion;
    }

    public void setEdicion(Integer edicion) {
        this.edicion = edicion;
    }

    public Integer getNpaginas() {
        return Npaginas;
    }

    public void setNpaginas(Integer Npaginas) {
        this.Npaginas = Npaginas;
    }

    public editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(editorial editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarDialogo(Libros pModificar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   

    
    
   
    
}
