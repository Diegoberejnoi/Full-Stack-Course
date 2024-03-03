/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
* 
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
* 
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.
* 
 * @author Carlos Ezequiel Diaz
 */
public class CursoService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
   // Curso c = new Curso();
    
    public String[] cargarAlumnos(){
        
        String [] aux = new String [5];
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Ingrese el nombre del "+(i+1)+"º alumno del curso: ");
            aux [i]= leer.next();
            
        }
        
        return aux;
        
    }
    
    
    public Curso crearCurso(){
        
              
        System.out.print("ingrese el nombre del curso: ");
        String nombre = leer.next();
        System.out.print("ingrese la cantidad de horas por día que se dicta el curso: ");
        int horas = leer.nextInt();
        leer.nextLine();
        System.out.print("ingrese la cantidad de días por semana que se dicta el curso: ");
        int dias = leer.nextInt();
        leer.nextLine();
        System.out.print("Ingrese el turno (Ma/tar): ");
        String turno = leer.next();
        System.out.print("ingrese el precio por hora de clase: ");
        double precio = leer.nextDouble();
        leer.nextLine();
        
        String [] alumnos = cargarAlumnos();
        
        Curso c = new Curso (nombre,horas,dias,turno,precio,alumnos);
        
        return c;
        
    }
    
    
    /*f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.*/
    
    public void calcularGananciaSemanal(Curso c){
        
        double ganancia;
        ganancia = c.getCantidadHorasPorDia()*c.getPrecioPorHora()*5*c.getCantidadDiasPorSemana();
        System.out.println("La ganancia semanal del curso es de $ "+ganancia);
        
    }
    
}


