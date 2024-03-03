package practicajpa.controllers;

import java.util.List;
import practicajpa.entitys.Alumno;

public class AlumnoRepositorio extends RepositorioJPA<Alumno>{
    
    public AlumnoRepositorio(){
        super();
    }
    public void crear(Alumno alumno){
        try{
        super.create(alumno);
        }catch (Exception e) {
            System.out.println("Error al crear Alumno" + e.getMessage());
        }
    }
    public void editar(Alumno alumno){
        try{
        super.update(alumno);
        }catch (Exception e){
            System.out.println("Error al editar alumno" + e.getMessage());
        }
    }
    public void borrar(Long id){
        try{
        Alumno alumno = findId(id);
        super.delete(alumno);
        }catch(Exception e){
            System.out.println("Error al borrar alumno" + e.getMessage());
        }
    }
    public Alumno findId(Long id){
        Alumno alumno = null;
        try{
        super.conect();
        alumno = em.find(Alumno.class, id);
        if(alumno == null){
            throw new Exception("Alumno vacio");
        }
        
        }catch(Exception e){
            System.out.println("Error al buscar alumno por id" + e.getMessage());
        }finally{
            super.disconnect();
        }
        return alumno;
    }
    //NamedQuery, consulta en lenguaje JPA
    public List<Alumno> listaAlumnos(){
        List<Alumno> alumnos = null; 
        try{
        super.conect();
        alumnos = (List<Alumno>) em.createNamedQuery("Alumno.listarTodos", Alumno.class).getResultList();
        if(alumnos.isEmpty()){
            throw new Exception("lista alumnos esta vacia");
        }

        }catch(Exception e){
            System.out.println("Error al listar alumnos" + e.getMessage());
        }finally{
            super.disconnect();
        }
        return alumnos;
    }
    //NativeQuery, consulta en lenguaje sql
    public Long cantAlumnos(){
        Long cantidad = null;
        try{
        super.conect();
        cantidad = (Long)em.createNativeQuery("SELECT COUNT(*) FROM alumnos").getSingleResult();
        if(cantidad == null){
            throw new Exception("La cantidad de alumnos es 0");
        }
       
        }catch(Exception e){
            System.out.println("Error al contar alumnos" + e.getMessage());
        }finally{
             super.disconnect();
        }
         return cantidad;
    }

}
