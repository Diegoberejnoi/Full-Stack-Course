/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Entidades.Editorial;
import java.util.List;

/**
 *
 * @author Diego
 */
public class EditorialDAO extends DAO<Editorial>{


    @Override
    public void guardar(Editorial editorial){
        super.guardar(editorial);
    }
   
    @Override
    public void editar(Editorial editorial){        
     super.editar(editorial);   
    }
    
    @Override
    public void eliminar(Editorial editorial){
        super.eliminar(editorial);
    }

 public List<Editorial> listarTodasEditoriales() throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e ").getResultList();
        desconectar();
        return editoriales;
    }
 
 public List<Editorial> buscarEditorialporNombre(String nombre){
        List<Editorial> editoriales=null;
        try {
            conectar();
            if(nombre == null || nombre.isEmpty()){
                throw new Exception("nombre vacio");
            }
            editoriales=(List<Editorial>) em.createQuery("SELECT e FROM Editorial e "
                    + "WHERE e.nombre like :nombre")
                    .setParameter("nombre", "%"+nombre+"%").getResultList();
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar editorial por nombre" + e.getMessage());
        }finally{
            return editoriales;
        }
    }
 
  public Editorial buscarEditorialporID(Long id){
        Editorial editorial =null;
        try {
            conectar();
            if(id==null){
                throw new Exception("id vacio");
            }
            editorial=em.find(Editorial.class, id);
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar editorial por id "+e.getMessage());
        }finally{
            return editorial;
        }
    }
    
    
}
