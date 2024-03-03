package Entidades;

import java.util.Objects;

public class Cliente {

    private String Nombre;
    private String Apellido;
    private Integer dni;
    private String domicilio;
    private Integer numeroTelefono;

    public Cliente() {
    }

    public Cliente(String Nombre, String Apellido, Integer dni, String domicilio, Integer numeroTelefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.Nombre);
        hash = 97 * hash + Objects.hashCode(this.Apellido);
        hash = 97 * hash + Objects.hashCode(this.dni);
        hash = 97 * hash + Objects.hashCode(this.domicilio);
        hash = 97 * hash + Objects.hashCode(this.numeroTelefono);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Apellido, other.Apellido)) {
            return false;
        }
        if (!Objects.equals(this.domicilio, other.domicilio)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return Objects.equals(this.numeroTelefono, other.numeroTelefono);
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", numeroTelefono=" + numeroTelefono + '}';
    }
    
    
}
