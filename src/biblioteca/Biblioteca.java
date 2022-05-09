//Comentario de Nuria

//Comentario de Damián

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author iago leiros
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Autor> autores = new ArrayList<>();
        Lector jorge = new Lector(1, "Jorge", "Alvarez Castaño", "vigo");
        Libro libro = new Libro("Todas esas cosas que te dire mañana", "Novela", "inventada", "1990");
        Libro libro1 = new Libro("Roma soy yo", "Historia", "inventada", "1995");
        Libro libro2 = new Libro("Operacion cazan", "Novela", "inventada", "1995");
        libros.add(libro);
        libros.add(libro1);
        libros.add(libro2);
        Autor autor1 = new Autor("Elisabet Benavent", "España", "18-05-1960");
        Autor autor2 = new Autor("Santiago Posteguillo", "España", "20-03-1985");
        Autor autor3 = new Autor("Vicente Valles", "España", "02-12-2000");
        Autor autor4 = new Autor("Isabel Allende", "Inglaterra", "03-03-1990");
        libro.autores.add(autor1);
        libro1.autores.add(autor2);
        libro1.autores.add(autor4);
        libro2.autores.add(autor3);
        autor1.libros.add(libro);
        autor2.libros.add(libro1);
        autor3.libros.add(libro2);
        autor4.libros.add(libro1);

        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        autores.add(autor4);

        Copia roma1 = new Copia(1, false);
        Copia roma2 = new Copia(2, true);
        Copia roma3 = new Copia(3, true);

        libro1.copias.add(roma1);
        libro1.copias.add(roma2);
        libro1.copias.add(roma3);

        byte opcion = 0;
        System.out.println("************************************");
        System.out.println("************Bienvenido**************");
        System.out.println("********Biblioteca de Teis**********");
        System.out.println("************************************");
        do {
            System.out.println("1.Busqueda de libro");
            System.out.println("2.Introducir nuevo libro");
            System.out.println("3.Prestamo de libro");
            System.out.println("4.Devolución");
            System.out.println("5 salir");
            opcion = Entrada.lerByte();
            switch (opcion) {

                case 1:
                    System.out.println("Como deseas realizar la búsqueda");
                    System.out.println("1.Nombre de libro");
                    System.out.println("2.Autor");
                    System.out.println("3.Volver al menu principal");
                    opcion = Entrada.lerByte();
                    switch (opcion) {

                        case 1:

                            boolean correcto = false;
                            System.out.println("introduce nombre libro");
                            String nombre = Entrada.lerString();

                            Iterator it = libros.iterator();

                            while (it.hasNext() && !correcto) {
                                Libro libroAux = (Libro) it.next();
                                if (nombre.equals(libroAux.getNombre())) {
                                    correcto = true;
                                    System.out.println("Libro encontrado");
                                    System.out.println("Nombre del libro: " + libroAux.getNombre());
                                    System.out.println("Tipo: " + libroAux.getTipo());
                                    System.out.println("Editorial: " + libroAux.getEditorial());
                                    System.out.println("Año: " + libroAux.getAnho());
                                    System.out.println("Autor: ");
                                    Iterator iter = libroAux.autores.iterator();

                                    while (iter.hasNext()) {
                                        Autor autor = (Autor) iter.next();
                                        System.out.println("" + autor.getNombre());

                                    }
                                    System.out.println("");
                                }
                            }
                            if (!correcto) {
                                System.out.println("El libro no existe");
                            }

                            break;

                        case 2:
                            sc.nextLine();
                            correcto = false;
                            System.out.println("introduce nombre Autor");
                            String nombreAutor = sc.nextLine();

                            Iterator ite = autores.iterator();

                            while (ite.hasNext() && !correcto) {
                                Autor autorAux = (Autor) ite.next();
                                if (nombreAutor.equals(autorAux.getNombre())) {
                                    correcto = true;
                                    System.out.println("Se ha encontrado autor");
                                    System.out.println("");
                                    System.out.println(autorAux.getNombre() + ": ");
                                    Iterator iter = autorAux.libros.iterator();

                                    while (iter.hasNext()) {
                                        Libro libroAux = (Libro) iter.next();
                                        System.out.println("" + libroAux.getNombre());
                                    }

                                }
                            }
                            if (!correcto) {
                                System.out.println("El autor no existe");
                            }

                            break;

                        case 3:
                            System.out.println("Volver al menú principal");
                            break;
                    }
                    break;

                case 2:
                    
                    String nombre;
                    String tipo;
                    String editorial;
                    String anho;
                    String nombreAutor;
                    String nacionalidad;
                    String anhoNacimiento;
                    boolean correcto = false;

                    System.out.println("Introduce el nombre del libro");
                    nombre = sc.nextLine();
                    Iterator it = libros.iterator();

                    while (it.hasNext() && !correcto) {
                        Libro libroAux = (Libro) it.next();

                        if (nombre.equals(libroAux.getNombre())) {
                            correcto = true;
                            System.out.println("El libro que intentas introducir ya existe");
                        }

                    }
                    if (!correcto) {

                        System.out.println("Introduce el tipo");
                        tipo = sc.nextLine();
                        System.out.println("Introduce la editorial");
                        editorial = sc.nextLine();
                        System.out.println("Introduce año de publicación");
                        anho = sc.nextLine();

                        Libro libro5 = new Libro(nombre, tipo, editorial, anho);
                        libros.add(libro5);

                        System.out.println("Introduce el nombre del autor");
                        nombreAutor = sc.nextLine();
                        System.out.println("Introduce su nacionalidad");
                        nacionalidad = sc.nextLine();
                        System.out.println("Introduce su año de nacimiento");
                        anhoNacimiento = sc.nextLine();

                        Autor autor5 = new Autor(nombreAutor, nacionalidad, anhoNacimiento);
                        libro5.autores.add(autor5);
                        autor5.libros.add(libro5);

                    }

                    break;

                case 3:
                    Libro libroAux = null;
                    System.out.println("Selecciona libro");
                    correcto = false;

                    nombre = sc.nextLine();

                    Iterator itera = libros.iterator();

                    while (itera.hasNext() && !correcto) {
                        libroAux = (Libro) itera.next();
                        if (nombre.equals(libroAux.getNombre())) {
                            correcto = true;
                            System.out.println("Libro encontrado");

                        }
                    }
                    if (!correcto) {
                        System.out.println("El libro no existe");
                    }
                    if (correcto) {
                        System.out.println("¿Deseas solicitarlo?");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        opcion = Entrada.lerByte();
                        switch (opcion) {
                            case 1:
                                boolean disponible = false;
                                Iterator iterCopia = libroAux.copias.iterator();

                                while (iterCopia.hasNext() && !disponible) {

                                    Copia copiaDeLibro = (Copia) iterCopia.next();

                                    if (copiaDeLibro.isEstado()) {
                                        if (copiaDeLibro.prestar(jorge));
                                        System.out.println("Solicitud aceptada");
                                        jorge.copia.add(copiaDeLibro);
                                        disponible = true;

                                    }

                                }
                                if (!disponible) {
                                    System.out.println("No esta disponible");
                                }

                                break;

                            case 2:
                                System.out.println("Cancelando...");
                                break;

                        }
                    }

                    break;

                case 4:
                    String nombreLibro;
                    System.out.println("Que libro deseas devolver");
                    
                    
                    
                    
                    
                    
                case 5:
                    System.out.println("Saliendo del programa....");
                    break;

            }
        } while (opcion != 5);

    }

}
