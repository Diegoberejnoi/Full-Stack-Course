/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import java.util.List;

/**
 *
 * @author Diego
 */
public class LibroDAO extends DAO<Libro>{
    
      @Override
    public void guardar(Libro libro){
        super.guardar(libro);
    }
   
    @Override
    public void editar(Libro libro){        
     super.editar(libro);   
    }
    
    @Override
    public void eliminar(Libro libro){
        super.eliminar(libro);
    }

 public List<Libro> listarTodosLibros() throws Exception {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return libros;
    }
 
 public List<Libro> buscarLibroporTitulo(String nombre){
        List<Libro> libros=null;
        try {
            conectar();
            if(nombre == null || nombre.isEmpty()) throw new Exception("títulos vacio");
            
            libros=(List<Libro>) em.createQuery("SELECT l FROM Libro l "
                    + "WHERE l.titulo like :titulo")
                    .setParameter("titulo", "%"+nombre+"%").getResultList();
            if(libros==null) throw new Exception("No se encontro ningun libro con el nombre ingresado");
            
        } catch (Exception e) {
           
            System.out.println("Error al buscar libro por título " + e.getMessage());
        }finally{
            desconectar();
            return libros;
        }
    }
 
  public Libro buscarLibroporID(Long id){
        Libro libro =null;
        try {
            conectar();
            if(id==null) throw new Exception("id vacio");    
            
            libro=em.find(Libro.class, id);
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar libro por id "+e.getMessage());
        }finally{
            return libro;
        }
    }
  public Libro buscarLibroporISBN(Long ISBN){
        Libro libro =null;
        try {
            
             conectar();
            if(ISBN==null) throw new Exception("ISBN vacio");    
            
            libro=(Libro) em.createQuery("SELECT l FROM Libro l "
                    + "WHERE l.ISBN like :ISBN")
                    .setParameter("ISBN", ISBN).getSingleResult();
            if(libro==null) throw new Exception("No se encontro el libro por el ISBN");
            
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar libro por id "+e.getMessage());
        }finally{
            return libro;
        }
    }
  
  public List<Libro> listarLibrosporAutor(String nombreAutor) throws Exception {
        conectar();
        AutorDAO ad=new AutorDAO();
        List<Autor> autores =ad.buscarAutorporNombre(nombreAutor);
        Autor autor=autores.get(0);
        List<Libro> libros =(List) em.createQuery("SELECT l FROM Libro l "
                + "WHERE l.autor = :autor")
                    .setParameter("autor", autor).getResultList();
        desconectar();
        return libros;
    }
  
  /*
  select l from Libro l join l.autor a where a.nombre = '"+nomAut+"'" ver de modificar
  */
  
  public List<Libro> listarLibrosporEditorial(String nombreEditorial) throws Exception {
        conectar();
        EditorialDAO ed=new EditorialDAO();
        List<Editorial> editoriales =ed.buscarEditorialporNombre(nombreEditorial);
        Editorial editorial=editoriales.get(0);
        List<Libro> libros =(List) em.createQuery("SELECT l FROM Libro l "
                + "WHERE l.editorial = :editorial")
                    .setParameter("editorial", editorial).getResultList();
        desconectar();
        return libros;
    }
    

    
}
