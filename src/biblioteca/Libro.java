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
public class Libro {

    ArrayList<Copia> copias=new ArrayList<>();
    ArrayList<Autor> autores=new ArrayList<>();
    private String nombre;
    private String tipo;
    private String editorial;
    private String anho;

    public Libro(String nombre, String tipo, String editorial, String anho) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.anho = anho;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getAnho() {
        return anho;
    }

    public ArrayList<Copia> getCopias() {
        return copias;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setCopias(ArrayList<Copia> copias) {
        this.copias = copias;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
}
