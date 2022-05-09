/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author iago leiros
 */
public class Multa {
    SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
    Prestamo prestamo;
    
    Lector lector; 
   
    private Date fechaInicio;
    
    private Date fechaFin;
    
    
    public void calcularFechaFin(String fecha,byte diasPrestamo){
      boolean correcto=false;
        do{
        try{     
        System.out.println("Introduce fecha en la que realizas el prestamo");
        fecha=Entrada.lerString();
                      
        Date fechaF=formato.parse(fecha);
        
        correcto=true;
        }catch(Exception e){
            
            System.out.println("Introduce una fecha valida, el formato es dd/mm/yyyy");
            
        }
        }while(!correcto);
        
      
      
        correcto=false;
        
        do{
        System.out.println("Introduce cuantos dias vas a tenerlo");
        diasPrestamo=Entrada.lerByte();
        if(diasPrestamo>30){
            System.out.println("Se excede la cantidad de dias de prestamo, introduce un número menor a :"+diasPrestamo);
        }else{
            correcto=true;
        }
        
        }while(!correcto);
        
    }
    
    public void generarMulta(){
    
    

    }
   
}
