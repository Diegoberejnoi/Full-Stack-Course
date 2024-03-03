/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import Persistencia.LibroDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
/**
 *
 * @author Diego
 */
public class LibroServicio {
    LibroDAO ld;
    EditorialServicio es;
    AutorServicio as;

    public LibroServicio() {
        this.ld=new LibroDAO();
        this.es=new EditorialServicio();
        this.as=new AutorServicio();
    }
    
    public void ingresarLibro(Libro libro) {
        try {
            if (libro== null) {
                throw new Exception("libro vacio");
            }
            ld.guardar(libro);
        } catch (Exception e) {
            System.out.println("Error al ingresar libro " + e.getMessage());
        }

    }
    
    public void ingresarNuevoLibro() {
        try {
            ld.guardar(crearLibro());
        } catch (Exception e) {
            System.out.println("Error al ingresar libro " + e.getMessage());
        }

    }

    public Libro crearLibro() {
        Libro libro = new Libro();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            libro.setId((long) UUID.randomUUID().hashCode());
            System.out.println("Ingrese el ISBN");
            libro.setIsbn(in.nextInt());
            in.nextLine();
            libro.setAlta(true);
            System.out.println("Ingre el título");
            libro.setTitulo(in.nextLine());
            System.out.println("Ingrese el año");
            libro.setAnio(in.nextInt());
            in.nextLine();
            System.out.println("Ingrese el número de ejemplares");
            libro.setEjemplares(in.nextInt());
            in.nextLine();
            System.out.println("Ingrese el número de ejemplares prestados");
            libro.setEjemplaresPrestados(in.nextInt());
            in.nextLine();
            if(libro.getEjemplares()-libro.getEjemplaresPrestados()<0){
                throw new Exception("Mayor cantidad de ejemplares prestados que en poseción");
            }
            libro.setEjemplaresRestantes(libro.getEjemplares()-libro.getEjemplaresPrestados());
            
            System.out.println("Ingrese el nombre del autor");
            List<Autor> autores = as.buscarAutorporNombre(in.nextLine());
            
            if (autores==null) {
                throw new Exception("Autor no encontrado");
            }
            
            libro.setAutor(autores.get(0));
            System.out.println("Ingrese el nombre de la editorial");
            List<Editorial> editoriales=es.buscarEditorialporNombre(in.nextLine());
            
            if(editoriales==null){
                throw new Exception("Editorial no encontrada");
            }
            
            libro.setEditorial(editoriales.get(0));
            
        } catch (Exception e) {
            in.nextLine();
            System.out.println("Error al crear Editorial " + e.getMessage());
        }

        return libro;
    }
    
    public List<Libro> buscarLibroporTitulo(String nombre){
        return ld.buscarLibroporTitulo(nombre);
    }
    
    public Libro buscarLibroporID(Long id){
        return ld.buscarLibroporID(id);
    }
    
    public void modificarTitulo(Long id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
            
            Scanner in = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el nuevo titulo del libro");
            String nombre = in.nextLine();
            
            Libro libro=buscarLibroporID(id);
            libro.setTitulo(nombre);
            ld.editar(libro);
            
            
        } catch (Exception e) {
            System.out.println("Error al modificar el titulo "+e.getMessage());
        }
    }
    
    public void eliminarLibro(Long id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
                        
            ld.eliminar(ld.buscarLibroporID(id));
            
            
        } catch (Exception e) {
            System.out.println("Error al eliminar el libro "+e.getMessage());
        }
    }
    
    
    public void mostarLibros(){
        
        List<Libro> libros=null;
        try {
            
            libros=ld.listarTodosLibros();
            
            for (Libro libro : libros) {
                System.out.println(libro);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error al mostar libros" + e.getMessage());
        }
    }
    
    public Libro buscarLibroporISBN(Long ISBN){
        return ld.buscarLibroporISBN(ISBN);
    }
    
    public List<Libro> buscarLibrosporAutor(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        List<Libro> libros=null;
        
        try {
            System.out.println("Ingrese el nombre del autor");
            String nombre= in.nextLine();
            
            if(nombre==null) throw new Exception("nombre vacio");
            libros=ld.listarLibrosporAutor(nombre);
            if(libros==null) throw new Exception("No existen libros con el autor deseado");
            
        } catch (Exception e) {
            System.out.println("Error al buscar libro por Autor " + e.getMessage() );
        }finally{
            return libros;
        }
 
    }
    public List<Libro> buscarLibrosporEditorial(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        List<Libro> libros=null;
        
        try {
            System.out.println("Ingrese el nombre de la editorial");
            String nombre= in.nextLine();
            
            if(nombre==null) throw new Exception("nombre vacio");
            libros=ld.listarLibrosporEditorial(nombre);
            if(libros==null) throw new Exception("No existen libros con la editorial deseado");
            
        } catch (Exception e) {
            System.out.println("Error al buscar libro por Autor " + e.getMessage() );
        }finally{
            return libros;
        }
 
    }
        
    }
    

