package practicajpa.controllers;

import java.util.List;
import practicajpa.entitys.Curso;
import practicajpa.enums.DiaDeLaSemana;

public class CursoRepositorio extends RepositorioJPA<Curso> {

    public CursoRepositorio() {
        super();
    }

    public void crear(Curso curso) {
        try{
        super.create(curso);
        }catch(Exception e){
            System.out.println("Error al crear curso" + e.getMessage());
        }
    }

    public void editar(Curso curso) {
        try{
        super.update(curso);
        }catch(Exception e){
            System.out.println("Error al editar curso" + e.getMessage());
        }
    }

    public void borrar(Long id) {
        try{
        super.conect();
        Curso curso = em.find(Curso.class,id);
        super.delete(curso);
        super.disconnect();
        }catch(Exception e){
            System.out.println("Error al borrar curso"+e.getMessage());
        }
    }

    public List<Curso> listarCursos() {
        super.conect();
        List<Curso> cursos = em.createNamedQuery("Curso.findAll").getResultList();
        super.disconnect();
        return cursos;
    }

    public Curso findId(Long id) {
        super.conect();
        Curso curso = em.createNamedQuery("Curso.findById", Curso.class).setParameter("id", id).getSingleResult();
        super.disconnect();
        return curso;
    }

    public Curso buscarPorNombre(String nombre) {
        super.conect();
        Curso curso = em.createQuery("SELECT c FROM Curso c WHERE c.nombre = :nombre", Curso.class).
                setParameter("nombre", nombre).getSingleResult();
        super.disconnect();
        return curso;
    }

    public List<Curso> listarCursosPorDia(DiaDeLaSemana dia) {
        super.conect();
        List<Curso> cursos = em.createQuery("SELECT c FROM Curso c WHERE c.dia = :dia", Curso.class).
                setParameter("dia", dia.toString()).getResultList();
        super.disconnect();
        return cursos;

    }

}
