/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoricoejemplo.entidades;

/**
 *
 * @author Diego
 */
public class Mascota {
    private String nombre;
    private String apodo;
    //Conejo, perro, gato, loro
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    
    public Mascota(){
        
    }
    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre=nombre;
        this.apodo=apodo;
        if(tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Conejo")){
             this.tipo=tipo;      
        }
         
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
