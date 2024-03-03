package practicajpa.entitys;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@NamedQueries({
@NamedQuery(
    name="Profesor.buscarTodos",
    query="SELECT p FROM Profesor p"
),
@NamedQuery(
    name="Profesor.buscarPorId",
    query="SELECT p FROM Profesor p WHERE p.id = :id"
)
})

@Entity
@Table(name="profesores")
public class Profesor extends Persona {
    
    @OneToMany(mappedBy="profesor")
    private Set<Curso> cursos;

    public Profesor() {
    }
    

    public Set<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Set<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" + "cursos=" + cursos + '}';
    }
    

}
