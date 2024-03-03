/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Autor;
import java.util.List;

/**
 *
 * @author Diego
 */
public final class AutorDAO extends DAO<Autor>{
    
    
    @Override
    public void guardar(Autor autor){
        super.guardar(autor);
    }
   
    @Override
    public void editar(Autor autor){        
     super.editar(autor);   
    }
    
    @Override
    public void eliminar(Autor autor){
        super.eliminar(autor);
    }

 public List<Autor> listarTodosAutores() throws Exception {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
    }
 
 public List<Autor> buscarAutorporNombre(String nombre){
        List<Autor> autores=null;
        try {
            conectar();
            if(nombre == null || nombre.isEmpty()){
                throw new Exception("nombre vacio");
            }
            autores=(List<Autor>) em.createQuery("SELECT a FROM Autor a "
                    + "WHERE a.nombre like :nombre")
                    .setParameter("nombre", "%"+nombre+"%").getResultList();
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar autor por nombre" + e.getMessage());
        }finally{
            return autores;
        }
    }
 
  public Autor buscarAutorporID(Long id){
        Autor autor =null;
        try {
            conectar();
            if(id==null){
                throw new Exception("id vacio");
            }
            autor=em.find(Autor.class, id);
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar autor por id "+e.getMessage());
        }finally{
            return autor;
        }
    }
    


    
}
