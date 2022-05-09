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
public class Lector {
    
    
    ArrayList <Copia> copia=new ArrayList<>();
    ArrayList <Prestamo>prestamo=new ArrayList<>();
    Multa multa;
    
    private int numSocio;
    
    private String nombre;
   
    private String apellidos;
    
    private String dirección;

    public Lector(int numSocio, String nombre, String apellidos, String dirección) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirección = dirección;
    }

    public Multa getMulta() {
        return multa;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDirección() {
        return dirección;
    }

    public ArrayList<Copia> getCopia() {
        return copia;
    }

    public ArrayList<Prestamo> getPrestamo() {
        return prestamo;
    }
    
    
    
    
    
    
    public void comprobarMultasPendentes(){
        
        
    }
}
