package practicajpa.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RepositorioJPA<T> {

    EntityManagerFactory emf;
    EntityManager em;

    public RepositorioJPA() {
        emf = Persistence.createEntityManagerFactory("practicaJPAPU");
        em = emf.createEntityManager();
    }

    protected void conect() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    protected void disconnect() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void create(T object) throws Exception {
        try {
            conect();
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
            disconnect();
        } catch (Exception e) {
            System.out.println("Error al crear repositorio jpa" + e.getMessage());
        }
    }

    protected void update(T object) throws Exception {
        try {
            conect();
            em.getTransaction().begin();
            em.merge(object);
            em.getTransaction().commit();
            disconnect();
        } catch (Exception e) {
            System.out.println("Error al actualizar repositorio jpa" + e.getMessage());
        }
    }

    protected void delete(T object) throws Exception {
        try {
            conect();
            em.getTransaction().begin();
            em.remove(object);
            em.getTransaction().commit();
            disconnect();
        } catch (Exception e) {
            System.out.println("Error al borrar repositorio jpa" + e.getMessage());
        }
    }

}
