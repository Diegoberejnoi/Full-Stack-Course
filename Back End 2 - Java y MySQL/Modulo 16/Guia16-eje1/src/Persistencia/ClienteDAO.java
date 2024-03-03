/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import java.util.List;





/**
 *
 * @author Diego
 */
public final class ClienteDAO extends DAO<Cliente>{
    
       @Override
    public void guardar(Cliente cliente){
        super.guardar(cliente);
    }
   
    @Override
    public void editar(Cliente cliente){        
     super.editar(cliente);   
    }
    
    @Override
    public void eliminar(Cliente cliente){
        super.eliminar(cliente);
    }

 public List<Cliente> listarTodosClientes() throws Exception {
        conectar();
        List<Cliente> clientes = em.createQuery("SELECT c FROM Cliente c").getResultList();
        desconectar();
        return clientes;
    }
 
 public List<Cliente> buscarClienteporNombre(String nombre){
        List<Cliente> clientes=null;
        try {
            conectar();
            if(nombre == null || nombre.isEmpty()){
                throw new Exception("nombre vacio");
            }
            clientes=(List<Cliente>) em.createQuery("SELECT c FROM Cliente c "
                    + "WHERE c.nombre like :nombre")
                    .setParameter("nombre", "%"+nombre+"%").getResultList();
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por nombre" + e.getMessage());
        }finally{
            return clientes;
        }
    }
 
    public List<Cliente> buscarClienteporApellido(String apellido){
        List<Cliente> clientes=null;
        try {
            conectar();
            if(apellido == null || apellido.isEmpty()){
                throw new Exception("apellido vacio");
            }
            clientes=(List<Cliente>) em.createQuery("SELECT c FROM Cliente c "
                    + "WHERE c.apellido like :apellido")
                    .setParameter("apellido", "%"+apellido+"%").getResultList();
            desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por apellido" + e.getMessage());
        }finally{
            return clientes;
        }
    }
 
  public Cliente buscarClienteporID(Integer id){
        Cliente cliente =null;
        try {
            conectar();
            if(id==null){
                throw new Exception("id vacio");
            }
            cliente=em.find(Cliente.class, id);
              desconectar();
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por id "+e.getMessage());
        }finally{
            return cliente;
        }
    }
    


    
}
