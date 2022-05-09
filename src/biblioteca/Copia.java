/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author iago leiros
 */
public class Copia {

    Prestamo prestamo;
    Libro libro;
    Lector lector;

    private int identificador;

    private boolean estado;

    public Copia(int identificador, boolean estado) {

        this.identificador = identificador;
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public Lector getLector() {
        return lector;
    }

    public int getIdentificador() {
        return identificador;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void devolver() {

    }

    public boolean prestar(Lector lector) {
        String fechaEntrada;
        String fechaDevolver;

        boolean prestado = false;
        if (estado) {
            if (lector.prestamo.size() < 3) {
                System.out.println("Introduce la fecha de inicio");
                fechaEntrada = Entrada.lerString();

                System.out.println("Introduce la fecha de devolución");

                fechaDevolver = Entrada.lerString();
                Prestamo prestamo = new Prestamo(fechaEntrada, fechaDevolver);
                lector.prestamo.add(prestamo);

            } else {
                System.out.println("El lector ha superado el limite de prestamos");
            }

            System.out.println("libro prestado");
            estado = false;

        }
        return prestado;
    }

    public boolean Devolver(Lector lector, String nombreLibro) {
        boolean devuelto = false;
        

        Iterator copiaDeLector = lector.copia.iterator();

        while (copiaDeLector.hasNext() && !devuelto) {

            Copia copia = (Copia) copiaDeLector.next();

            if (copia.identificador == this.identificador) {

                this.estado = true;
                lector.copia.remove(copia);
                System.out.println("Se ha realizado la devolucion");
                devuelto = true;
            }

        }

        return devuelto;
    }
}
