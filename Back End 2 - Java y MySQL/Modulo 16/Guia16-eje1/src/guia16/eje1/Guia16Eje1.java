/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia16.eje1;

import Entidades.Libro;
import Servicios.AutorServicio;
import Servicios.ClienteServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;
import Servicios.PrestamoServicio;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Guia16Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroServicio ls = new LibroServicio();
        EditorialServicio es = new EditorialServicio();
        AutorServicio as = new AutorServicio();
        ClienteServicio cs=new ClienteServicio();
        PrestamoServicio ps= new PrestamoServicio();

        int op = 0;
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        
        do {
            try {

                System.out.println("");
                System.out.println("------Menú------");
                System.out.println("1.Ingresar");                
                System.out.println("2.Editar");
                System.out.println("3.Eliminar");
                System.out.println("4.Mostrar");  
                System.out.println("5.Buscar");
                System.out.println("6.Devolver Libro");
                System.out.println("7. Salir");
                op = in.nextInt();
                in.nextLine();
                System.out.println("");

                switch (op) {
                    case 1:
                        ingresar();
                        break;
                    case 2:
                        editarNombre();
                        break;
                    case 3:
                        eliminar();
                        break;
                    case 4:
                        mostrar();
                        break;
                    case 5:
                        buscar();
                        break;
                    case 6:
                       ps.devolverLibro();
                        break;
                    case 7:
                        System.out.println("Saliendo");
                        break;
                    default:
                        System.out.println("opcion incorrecta");

                }                

            } catch (Exception e) {
                in.nextLine();
                System.out.println("Error");
            }

        } while (op != 7);

    }
    
    public static void ingresar(){
        LibroServicio ls = new LibroServicio();
        EditorialServicio es = new EditorialServicio();
        AutorServicio as = new AutorServicio();
        ClienteServicio cs=new ClienteServicio();
        PrestamoServicio ps= new PrestamoServicio();
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int op = 0;
        boolean repetir = false;
        try {

            do {
                System.out.println("");
                System.out.println("*************");
                System.out.println("Que desea agregar?");
                System.out.println("1.Libro");
                System.out.println("2.Autor");
                System.out.println("3.Editorial");
                System.out.println("4.Cliente");
                System.out.println("5.Prestamo");
                System.out.println("6.Volver al menú principal");
                op = in.nextInt();
                in.nextLine();

                switch (op) {
                    case 1:
                         ls.ingresarNuevoLibro();
                        break;
                    case 2:
                        as.ingresarNuevoAutor();
                        break;
                    case 3:
                        es.ingresarNuevaEditorial();
                        break;
                    case 4:
                        cs.ingresarNuevoCliente();
                        break;
                    case 5:
                        ps.ingresarNuevoPrestamo();
                        break;
                    case 6:
                        System.out.println("Desea volver al menú principal? s/n");
                        repetir='n'==Character.toLowerCase(in.next().charAt(0));
                        break;
                    default:

                }

            } while (repetir);

        } catch (Exception e) {
            System.out.println("Error menu ingresar " + e.getMessage());
        }

    }
    
    public static void editarNombre(){
        LibroServicio ls = new LibroServicio();
        EditorialServicio es = new EditorialServicio();
        AutorServicio as = new AutorServicio();
        ClienteServicio cs=new ClienteServicio();        
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int op = 0;
        boolean repetir = false;
        try {

            do {
                System.out.println("");
                System.out.println("*************");
                System.out.println("Que desea editar?");
                System.out.println("1.Libro");
                System.out.println("2.Autor");
                System.out.println("3.Editorial");
                System.out.println("4.Cliente");
                System.out.println("5.Volver al menú principal");
                op = in.nextInt();
                in.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Ingrese el id del libro a modificar");
                        ls.modificarTitulo((long) in.nextInt());
                        in.nextLine();
                        break;
                    case 2:
                        System.out.println("Ingrese el id del autor a modificar");
                        as.modificarAutor((long) in.nextInt());
                        in.nextLine();
                        break;
                    case 3:
                        System.out.println("Ingrese el id de la editorial a modificar");
                        es.modificarEditorial((long) in.nextInt());
                        in.nextLine();
                        break;
                    case 4:
                        System.out.println("Ingrese el id del cliente que desea modificar el nombre");
                        cs.modificarNombreCliente(in.nextInt());
                        in.nextLine();                        
                        break;
                    case 5:
                        System.out.println("Desea volver al menú principal? s/n");
                        repetir='n'==Character.toLowerCase(in.next().charAt(0));
                        break;
                    default:

                }

            } while (repetir);

        } catch (Exception e) {
            System.out.println("Error menu editarNombre " + e.getMessage());
        }

    }
    
    public static void eliminar(){
        LibroServicio ls = new LibroServicio();
        EditorialServicio es = new EditorialServicio();
        AutorServicio as = new AutorServicio();
        ClienteServicio cs=new ClienteServicio();
        PrestamoServicio ps= new PrestamoServicio();
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int op = 0;
        boolean repetir = false;
        try {

            do {
                System.out.println("");
                System.out.println("*************");
                System.out.println("Que desea eliminar?");
                System.out.println("1.Libro");
                System.out.println("2.Autor");
                System.out.println("3.Editorial");
                System.out.println("4.Cliente");
                System.out.println("5.Prestamo");
                System.out.println("6.Volver al menú principal");
                op = in.nextInt();
                in.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Ingrese el id del libro a eliminar");
                        ls.eliminarLibro(in.nextLong());
                        in.nextLine();
                        break;
                    case 2:
                        System.out.println("Ingrese el id del autor a eliminar");
                        as.eliminarAutor(in.nextLong());
                        in.nextLine();
                        break;
                    case 3:
                        System.out.println("Ingrese el id de la editorial a eliminar");
                        es.eliminarEditorial(in.nextLong());
                        in.nextLine();
                        break;
                    case 4:
                        System.out.println("Ingrese el id del cliente a eliminar");
                        cs.eliminarCliente(in.nextInt());
                        in.nextLine();                        
                        break;
                    case 5:
                        System.out.println("Ingrese el id del prestamo a eliminar");
                        ps.eliminarPrestamo(in.nextInt());
                        in.nextLine();                        
                        break;
                    case 6:
                        System.out.println("Desea volver al menú principal? s/n");
                        repetir='n'==Character.toLowerCase(in.next().charAt(0));
                        break;
                    default:

                }

            } while (repetir);

        } catch (Exception e) {
            System.out.println("Error menu eliminar " + e.getMessage());
        }

    }
    
    public static void mostrar(){
        LibroServicio ls = new LibroServicio();
        EditorialServicio es = new EditorialServicio();
        AutorServicio as = new AutorServicio();
        ClienteServicio cs=new ClienteServicio();
        PrestamoServicio ps= new PrestamoServicio();
        Scanner in = new Scanner(System.in).useDelimiter("\n");

        int op = 0;
        boolean repetir = false;
        try {

            do {
                System.out.println("");
                System.out.println("*************");
                System.out.println("Que desea mostrar?");
                System.out.println("1.Libro");
                System.out.println("2.Autor");
                System.out.println("3.Editorial");
                System.out.println("4.Cliente");
                System.out.println("5.Prestamo");
                System.out.println("6.Volver al menú principal");
                op = in.nextInt();
                in.nextLine();

                switch (op) {
                    case 1:
                        ls.mostarLibros();
                        break;
                    case 2:
                        as.mostarAutores();
                        break;
                    case 3:
                        es.mostarEditoriales();
                        break;
                    case 4:
                        cs.mostarClientees();
                        break;
                    case 5:
                        ps.mostarPrestamos();
                        break;
                    case 6:
                        System.out.println("Desea volver al menú principal? s/n");
                        repetir='n'==Character.toLowerCase(in.next().charAt(0));
                        break;
                    default:

                }

            } while (repetir);

        } catch (Exception e) {
            System.out.println("Error menu mostrar " + e.getMessage());
        }

    }

  public static void buscar(){
        LibroServicio ls = new LibroServicio();
        PrestamoServicio ps= new PrestamoServicio();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        List<Libro> libros=null;
        int op = 0;
        boolean repetir = false;
        try {

            do {
                System.out.println("");
                System.out.println("*************");
                System.out.println("Que desea buscar?");
                System.out.println("1.Libro por ISBN");
                System.out.println("2.Libro por título");
                System.out.println("3.Libros por su autor");
                System.out.println("4.Libros por su editorial");
                System.out.println("5.Prestamos de un cliente");
                System.out.println("6.Volver al menú principal");
                op = in.nextInt();
                in.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Ingrese el ISBN del libro");
                        Long ISBN = (long) in.nextInt();
                        in.nextLine();
                        System.out.println(ls.buscarLibroporISBN(ISBN));
                        break;
                    case 2:
                        System.out.println("Ingrese el título del libro");
                        System.out.println(ls.buscarLibroporTitulo(in.nextLine()));
                        break;
                    case 3:
                        libros=ls.buscarLibrosporAutor();
                        for (Libro libro : libros) {
                            System.out.println(libro);
                        }
                        libros.clear();
                        break;
                    case 4:
                        libros=ls.buscarLibrosporEditorial();
                        for (Libro libro : libros) {
                            System.out.println(libro);
                        } 
                         libros.clear();
                        break;
                    case 5:
                        ps.mostarPrestamosCliente();
                        break;
                    case 6:
                        System.out.println("Desea volver al menú principal? s/n");
                        repetir='n'==Character.toLowerCase(in.next().charAt(0));
                        break;
                    default:

                }

            } while (repetir);

        } catch (Exception e) {
            System.out.println("Error menu buscar " + e.getMessage());
        }

    }

}

