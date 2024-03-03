/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Autor;
import Persistencia.AutorDAO;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Diego
 */
public class AutorServicio {
    
      AutorDAO ad;

    public AutorServicio() {
        this.ad=new AutorDAO();
    }
    
    public void ingresarAutor(Autor autor) {
        try {
            ad.guardar(autor);
        } catch (Exception e) {
            System.out.println("Error al ingresar autor" + e.getMessage());
        }

    }
    
    public void ingresarNuevoAutor() {
        try {
            Autor autor = crearAutor();
            if(autor==null) throw new Exception("Autor Vacio");
            ad.guardar(autor);
        } catch (Exception e) {
            System.out.println("Error al ingresar nuevo Autor "+e.getMessage());
        }

    }

    public Autor crearAutor() {
        Autor autor=new Autor();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            
            autor.setId((long) UUID.randomUUID().hashCode());
            System.out.println("Ingrese el nombre del autor");
            autor.setNombre(in.nextLine());
            autor.setAlta(true);

        } catch (Exception e) {
            System.out.println("Error al crear autor" + e.getMessage());
           
        }finally{
            return autor;
        }
        
    }
    
    public List<Autor> buscarAutorporNombre(String nombre){        
         return ad.buscarAutorporNombre(nombre);       
    }
    
    public Autor buscarAutorporID(Long id){
        return ad.buscarAutorporID(id);
    }
    
    public void modificarAutor(Long id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
            
            Scanner in = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el nuevo nombre del autor");
            String nombre = in.nextLine();
            
            Autor autor=ad.buscarAutorporID(id);
            autor.setNombre(nombre);
            
            ad.editar(autor);
            
            
        } catch (Exception e) {
            System.out.println("Error al modificar la autor "+e.getMessage());
        }
    }
    
    public void eliminarAutor(Long id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
            Autor autor=buscarAutorporID(id);
            ad.eliminar(autor);
        } catch (Exception e) {
            System.out.println("Error al eliminar el autor "+e.getMessage());
        }
    }
    
    public void mostarAutores(){
        
        List<Autor> autores=null;
        try {
            
            autores=ad.listarTodosAutores();
            
            for (Autor autor : autores) {
                System.out.println(autor);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error al mostar autores " + e.getMessage());
        }
    }
    
    }
    

