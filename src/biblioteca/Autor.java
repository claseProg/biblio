/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author iago leiros
 */
public class Autor {
   
    ArrayList <Libro> libros=new ArrayList<>();
    
    private String nombre;
        
    private String nacionalidad;
    
    private String fechaNacimiento;

    public Autor(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    
    
    
    public void setLibros(Libro libro) {
        libros.add(libro);
        
        
    }
    
    
    
}
