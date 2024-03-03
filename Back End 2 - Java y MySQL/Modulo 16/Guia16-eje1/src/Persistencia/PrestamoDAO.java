/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;


import Entidades.Cliente;
import Entidades.Prestamo;
import java.util.List;

/**
 *
 * @author Diego
 */
public final class PrestamoDAO extends DAO<Prestamo>{
    
     
       @Override
    public void guardar(Prestamo prestamo){
        super.guardar(prestamo);
    }
   
    @Override
    public void editar(Prestamo prestamo){        
     super.editar(prestamo);   
    }
    
    @Override
    public void eliminar(Prestamo prestamo){
        super.eliminar(prestamo);
    }

 public List<Prestamo> listarTodosPrestamos() throws Exception {
        conectar();
        List<Prestamo> prestamos = em.createQuery("SELECT c FROM Prestamo c").getResultList();
        desconectar();
        return prestamos;
    }
 
 public List<Prestamo> buscarPrestamoCliente(Cliente cliente){
        List<Prestamo> prestamos=null;
        try {
            conectar();
            if(cliente == null){
                throw new Exception("Cliente vacio");
            }
            prestamos=(List<Prestamo>) em.createQuery("SELECT p FROM Prestamo p "
                    + "WHERE p.cliente = :cliente")
                    .setParameter("cliente", cliente).getResultList();
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar prestamo del cliente " + e.getMessage());
        }finally{
            return prestamos;
        }
    }
 
  public Prestamo buscarPrestamoporID(Integer id){
        Prestamo prestamo =null;
        try {
            if(id==null){
                throw new Exception("id vacio");
            }
            prestamo=em.find(Prestamo.class, id);
            
        } catch (Exception e) {
            System.out.println("Error al buscar prestamo por id "+e.getMessage());
        }finally{
            return prestamo;
        }
    }
    
    
}
