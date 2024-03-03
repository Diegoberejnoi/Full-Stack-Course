/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Editorial;
import Persistencia.EditorialDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author Diego
 */
public class EditorialServicio {
    EditorialDAO ed;

    public EditorialServicio() {
        this.ed=new EditorialDAO();
    }
    
    public void ingresarEditorial(Editorial editorial) {
         try {
            ed.guardar(editorial);
        } catch (Exception e) {
            System.out.println("Error al ingresar editorial" + e.getMessage());
        }
    }
    
    public void ingresarNuevaEditorial() {
         try {
            Editorial editorial = crearEditorial();
            if(editorial==null) throw new Exception("Editorial Vacia");
            ed.guardar(editorial);
        } catch (Exception e) {
            System.out.println("Error al ingresar nueva Editorial "+e.getMessage());
        }

    }

    public Editorial crearEditorial() {
        Editorial editorial = new Editorial();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            editorial.setId((long) UUID.randomUUID().hashCode());
            System.out.println("Ingrese el nombre de la editorial");
            editorial.setNombre(in.nextLine());
            editorial.setAlta(true);

        } catch (Exception e) {
            System.out.println("Error al crear Editorial " + e.getMessage());
        }

        return editorial;
    }
    
    public List<Editorial> buscarEditorialporNombre(String nombre){
        return ed.buscarEditorialporNombre(nombre);
    }
    
    public Editorial buscarEditorialporID(Long id){
        return ed.buscarEditorialporID(id);
    }
    
    public void modificarEditorial(Long id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
            
            Scanner in = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el nuevo nombre de la editorial");
            String nombre = in.nextLine();
            
            Editorial editorial=ed.buscarEditorialporID(id);
            editorial.setNombre(nombre);
            
            ed.editar(editorial);
            
            
        } catch (Exception e) {
            System.out.println("Error al modificar la editorial "+e.getMessage());
        }
    }
    
    public void eliminarEditorial(Long id){
        try {
            if (id==null) throw new Exception("Id vacio");
            
            ed.eliminar(buscarEditorialporID(id));
            
        } catch (Exception e) {
            System.out.println("Error al eliminar la editorial "+e.getMessage());
        }
    }
    
    public void mostarEditoriales(){
        
        List<Editorial> editoriales=null;
        try {
            
            editoriales=ed.listarTodasEditoriales();
            
            for (Editorial editorial : editoriales) {
                System.out.println(editorial);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error al mostar editoriales" + e.getMessage());
        }
    }
    
}
