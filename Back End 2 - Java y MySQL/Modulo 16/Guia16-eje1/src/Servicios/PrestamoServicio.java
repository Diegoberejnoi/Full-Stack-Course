/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import Persistencia.ClienteDAO;
import Persistencia.LibroDAO;
import Persistencia.PrestamoDAO;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Diego
 */
public class PrestamoServicio {
      
      
      ClienteDAO cd;
      PrestamoDAO pd;

    public PrestamoServicio() {
        this.cd=new ClienteDAO();
        this.pd=new PrestamoDAO();
    }
    
    public void ingresarPrestamo(Prestamo prestamo) {
        try {
            pd.guardar(prestamo);
        } catch (Exception e) {
            System.out.println("Error al ingresar prestamo" + e.getMessage());
        }

    }
    
    public void ingresarNuevoPrestamo() {
        try {
            Prestamo prestamo = crearPrestamo();
            if(prestamo==null) throw new Exception("Prestamo Vacio");
            pd.guardar(prestamo);
        } catch (Exception e) {
            System.out.println("Error al ingresar nuevo Prestamo "+e.getMessage());
        }

    }

    public Prestamo crearPrestamo() {
        Prestamo prestamo=new Prestamo();
        Libro libro=null;
        Cliente cliente=null;
        ClienteServicio cs=new ClienteServicio();
        LibroServicio ls=new LibroServicio();
        LibroDAO ld=new LibroDAO();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Ingrese el ID del libro a prestar");
            Long idLibro=in.nextLong();
            in.nextLine();
            libro=ls.buscarLibroporID(idLibro);
            if(libro==null) throw new Exception("Id libro incorrecta");
            if(libro.getEjemplaresRestantes()<1) throw new Exception("No hay Stock");
            
            prestamo.setLibro(libro);
            
            System.out.println("Ingrese el ID del cliente");
            Integer idCliente=in.nextInt();
            in.nextLine();            
            cliente=cs.buscarClienteporID(idCliente);
            if(cliente==null) throw new Exception("Id cliente incorrecto");
            prestamo.setCliente(cliente);
            
            
            prestamo.setId(UUID.randomUUID().hashCode());
            System.out.println("Ingrese la fecha del prestamo (dd/mm/aaaa)");
            String fechaPrestamo=in.nextLine();
            if(fechaPrestamo==null) throw new Exception("Fecha prestamo vacia");
            
            int dia=Integer.parseInt(fechaPrestamo.substring(0, 2));  
            int mes=Integer.parseInt(fechaPrestamo.substring(3, 5));
            int anio=Integer.parseInt(fechaPrestamo.substring(6));
            Date fechaPrestamoD=new Date(anio-1900,mes-1,dia);
            if(fechaPrestamoD ==null) throw new Exception("Fecha prestamo nulo");
            prestamo.setFechaPrestamo(fechaPrestamoD);
            
            System.out.println("Ingrese la fecha de devolución (dd/mm/aaaa)");
            String fechaDevolucion=in.nextLine();
            if(fechaDevolucion==null) throw new Exception("Fecha devolucion vacia");
            int diaD=Integer.parseInt(fechaDevolucion.substring(0, 2));  
            int mesD=Integer.parseInt(fechaDevolucion.substring(3, 5));
            int anioD=Integer.parseInt(fechaDevolucion.substring(6));
            Date fechaDevolucionD=new Date(anioD-1900,mesD-1,diaD);
            
            if(fechaDevolucionD ==null) throw new Exception("Fecha devolucion nulo");
            prestamo.setFechaDevolucion(fechaDevolucionD);
            
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()-1);
            ld.editar(libro);
            

        } catch (Exception e) {
            System.out.println("Error al crear prestamo" + e.getMessage());
           
        }finally{
            return prestamo;
        }
        
    }
    
    public void devolverLibro(){
        LibroDAO ld=new LibroDAO();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Libro libro=null;
        try {
            System.out.println("Ingrese el id del libro a devolver");
            Long idLibro =in.nextLong();
            in.nextLine();
            if (idLibro==null) throw new Exception("Id invalido");
            libro=ld.buscarLibroporID(idLibro);
            libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
            libro.setEjemplaresRestantes(libro.getEjemplaresRestantes()+1);
            ld.editar(libro);
            
        } catch (Exception e) {
            System.out.println("Error al devolver libro " + e.getMessage());
        }
    }
    
    public Prestamo buscarPrestamoporID(Integer id){
        return pd.buscarPrestamoporID(id);
    }
    
    public void eliminarPrestamo(Integer id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
            Prestamo prestamo=buscarPrestamoporID(id);
            pd.eliminar(prestamo);
        } catch (Exception e) {
            System.out.println("Error al eliminar el prestamo "+e.getMessage());
        }
    }
    
    public void mostarPrestamos(){
        
        List<Prestamo> prestamos=null;
        try {
            
            prestamos=pd.listarTodosPrestamos();
            
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error al mostar prestamos " + e.getMessage());
        }
    }
    
    public void mostarPrestamosCliente(){
        List<Prestamo> listaPrestamos;
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        ClienteDAO cd=new ClienteDAO();
        Cliente cliente=null;
        try {
            System.out.println("Ingrese el id del cliente");
            Integer idCliente=in.nextInt();
            in.nextLine();
            if(idCliente==null) throw new Exception("id vacio");
            cliente=cd.buscarClienteporID(idCliente);
            if(cliente==null) throw  new Exception("el id ingresado no pertenece a ningun cliente");
            
            listaPrestamos=pd.buscarPrestamoCliente(cliente);
            
            for (Prestamo prestamo : listaPrestamos) {
                System.out.println(prestamo);                
            }
            
        } catch (Exception e) {
            System.out.println("Error al mostrar prestamos por cliente "+e.getMessage());
        }
        
        
    }
    
    
    
}
