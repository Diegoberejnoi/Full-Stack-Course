package practicajpa.controllers;

import java.util.List;
import practicajpa.entitys.Profesor;

public class ProfesorRepositorio extends RepositorioJPA<Profesor>{

    public ProfesorRepositorio() {
        super();
    }
    
    public void crear(Profesor profesor){
        try{
        super.create(profesor);
        }catch(Exception e){
            System.out.println("Error al crear profesor" + e.getMessage());
        }
    }
    
    public void editar(Profesor profesor){
        try{
        super.update(profesor);
        }catch(Exception e){
            System.out.println("Error al actualizar profesor"+ e.getMessage());
        }
    }
    
    public void borrar(Long id){
        try{
        super.conect();
        Profesor profesor = em.find(Profesor.class, id);
        super.delete(profesor);
        super.disconnect();
        }catch(Exception e){
            System.out.println("Error al borrar profesor"+e.getMessage());
        }
    }
    
    public List<Profesor> listarProfesores(){
        super.conect();
        List<Profesor> profesores = em.createNamedQuery("Profesor.buscarTodos").
                getResultList();
        super.disconnect();
        return profesores;
    }
    
    public Profesor findId(Long id){
        super.conect();
        Profesor profesor = em.createNamedQuery("Profesor.buscarPorId", Profesor.class).
                getSingleResult();
        return profesor;
    }
    
    public List<Profesor> buscarPorNombre(String nombre){
        super.conect();
        List<Profesor> profesores = em.createQuery("SELECT p FROM Profesor p WHERE p.nombre= :nombre", Profesor.class).
                setParameter("nombre", nombre).getResultList();
        super.disconnect();
        return profesores;
    }

}
