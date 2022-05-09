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
public class Prestamo {
    Multa multa;
    
    ArrayList <Copia>copia;
    private String fechaInicio;
    
    private String fechaFin;

    public Prestamo(String fechaInicio, String fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Multa getMulta() {
        return multa;
    }

    public ArrayList<Copia> getCopia() {
        return copia;
    }
    
    
    
    public void calcularFechaFin(){
        
        
    }
    
    
    public void generarMulta(){
        
        
    }
    
}
