package practicajpa.entitys;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import practicajpa.enums.DiaDeLaSemana;

@NamedQueries({
@NamedQuery(
    name="Curso.findAll", 
    query="SELECT a FROM Curso a"),
@NamedQuery(name="Curso.findById", 
    query="SELECT a FROM Curso a WHERE a.id = :id")
})

@Entity
@Table(name="cursos")
public class Curso {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    @Column(name="nombre_curso")
    private String nombre;
    
    @Enumerated(EnumType.STRING)
    private DiaDeLaSemana dia;
    
    @Column(name="hora_inicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    
    @Column(name="hora_fin")
    @Temporal(TemporalType.TIME)
    private Date horaFin;
    
    @Column(name="cupo_maximo")
    private Integer cupo;
    
    @ManyToOne
    @JoinColumn(name="profesor_id")
    private Profesor profesor;
    
    @ManyToMany()
    @JoinTable(name="curso_alumno",
            joinColumns=@JoinColumn(name="curso_id"),
            inverseJoinColumns=@JoinColumn(name="alumno_id"))
    private Set<Alumno> alumnos;

    public Curso() {
    }

    public Curso(String nombre, DiaDeLaSemana dia, Date horaInicio, Date horaFin, Integer cupo, Profesor profesor, Set<Alumno> alumnos) {
        this.id = id;
        this.nombre = nombre;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.cupo = cupo;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DiaDeLaSemana getDia() {
        return dia;
    }

    public void setDia(DiaDeLaSemana dia) {
        this.dia = dia;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Integer getCupo() {
        return cupo;
    }

    public void setCupo(Integer cupo) {
        this.cupo = cupo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", dia=" + dia + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", cupo=" + cupo + ", profesor=" + profesor + ", alumnos=" + alumnos + '}';
    }
    
    

}
