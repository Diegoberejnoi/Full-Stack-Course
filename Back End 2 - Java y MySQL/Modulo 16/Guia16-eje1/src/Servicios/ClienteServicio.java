/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;


import Entidades.Cliente;
import Persistencia.ClienteDAO;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Diego
 */
public class ClienteServicio {
    
      
      ClienteDAO cd;

    public ClienteServicio() {
        this.cd=new ClienteDAO();
    }
    
    public void ingresarCliente(Cliente cliente) {
        try {
            cd.guardar(cliente);
        } catch (Exception e) {
            System.out.println("Error al ingresar cliente" + e.getMessage());
        }

    }
    
    public void ingresarNuevoCliente() {
        try {
            Cliente cliente = crearCliente();
            if(cliente==null) throw new Exception("Cliente Vacio");
            cd.guardar(cliente);
        } catch (Exception e) {
            System.out.println("Error al ingresar nuevo Cliente "+e.getMessage());
        }

    }

    public Cliente crearCliente() {
        Cliente cliente=new Cliente();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        try {
            
            cliente.setId(UUID.randomUUID().hashCode());
            System.out.println("Ingrese el documento del cliente");
            int documento=in.nextInt();
            in.nextLine();
            cliente.setDocumento(documento);
            System.out.println("Ingrese el nombre del cliente");
            cliente.setNombre(in.nextLine());
            System.out.println("Ingrese el apellido del cliente");
            cliente.setApellido(in.nextLine());
            System.out.println("Ingrese el telefono del cliente");
            cliente.setTelefono(in.nextLine());
            

        } catch (Exception e) {
            System.out.println("Error al crear cliente" + e.getMessage());
           
        }finally{
            return cliente;
        }
        
    }
    
    public List<Cliente> buscarClienteporNombre(String nombre){        
         return cd.buscarClienteporNombre(nombre);       
    }
    public List<Cliente> buscarClienteporApellido(String apellido){        
         return cd.buscarClienteporApellido(apellido);       
    }
    
    public Cliente buscarClienteporID(Integer id){
        return cd.buscarClienteporID(id);
    }
    
    public void modificarNombreCliente(Integer id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
            
            Scanner in = new Scanner(System.in).useDelimiter("\n");
            System.out.println("Ingrese el nuevo nombre del cliente");
            String nombre = in.nextLine();
            
            Cliente cliente=cd.buscarClienteporID(id);
            cliente.setNombre(nombre);
            
            cd.editar(cliente);
            
            
        } catch (Exception e) {
            System.out.println("Error al modificar el nombre del cliente "+e.getMessage());
        }
    }
    
    public void eliminarCliente(Integer id){
        try {
            if (id==null) {
                throw new Exception("Id vacio");
            }
            Cliente cliente=buscarClienteporID(id);
            cd.eliminar(cliente);
        } catch (Exception e) {
            System.out.println("Error al eliminar el cliente "+e.getMessage());
        }
    }
    
    public void mostarClientees(){
        
        List<Cliente> clientes=null;
        try {
            
            clientes=cd.listarTodosClientes();
            
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
                
            }
            
        } catch (Exception e) {
            System.out.println("Error al mostar clientees " + e.getMessage());
        }
    }
    
    
}
