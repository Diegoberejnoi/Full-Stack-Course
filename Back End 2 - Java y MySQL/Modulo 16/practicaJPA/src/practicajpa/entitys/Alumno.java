package practicajpa.entitys;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQuery(
    name="Alumno.listarTodos",
    query="SELECT a FROM Alumno a"
)

@Entity
@Table(name="alumnos")
public class Alumno extends Persona{
    
    @ManyToMany
    @JoinTable(name="curso_alumno",
            joinColumns = @JoinColumn(name="curso_id"),
            inverseJoinColumns=@JoinColumn(name="alumno_id"))
    private Set<Curso> cursos;

    public Alumno() {
    }

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "cursos=" + cursos + '}';
    }

    

}
