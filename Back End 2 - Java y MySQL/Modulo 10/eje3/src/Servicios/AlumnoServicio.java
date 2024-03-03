/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class AlumnoServicio {
        private Scanner in;
        private ArrayList<Alumno> listaAlumnos;
    /*
    En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
        toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
        pregunta al usuario si quiere crear otro Alumno o no.
        Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
        
    */
    
    
    public AlumnoServicio(){
        this.listaAlumnos=new ArrayList();
        this.in = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearAlumno() {
        String op="s";
        
        while(op.equals("s")){
            
            ArrayList<Integer> notas=new ArrayList();
            System.out.println("Ingrese el nombre del alumno");
            String nombre=in.nextLine();            
            System.out.println("Ingrese las 3 notas del alumno");
            
            System.out.print("Nota 1=");
            notas.add(in.nextInt());
            System.out.print("Nota 2=");
            notas.add(in.nextInt());
            System.out.print("Nota 3=");
            notas.add(in.nextInt());
            System.out.println("");
            in.nextLine();
            
            listaAlumnos.add(new Alumno(nombre,notas));
            System.out.println("Desea agregar otro alumno? \ns/n");
            op=in.nextLine();
            
        }
        
        
    }
    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
        final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
        del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
        promedio final, devuelto por el método y mostrado en el main.
    */
    public double notaFinal(){
        double prom=0;
        System.out.println("Ingrese el nombre del alumno que desea calcular su nota final");
        String nombre=in.nextLine();
        Iterator<Alumno> it=listaAlumnos.iterator();
        boolean encontrado=false;
        
        while(it.hasNext()){
            Alumno alumno=it.next();
            String nombre1=alumno.getNombre();
            if(nombre1.equals(nombre)){
                ArrayList<Integer> notas=alumno.getNotas();
                prom=(double)(notas.get(0)+notas.get(1)+notas.get(2))/3;
                encontrado=true;
            }            
        }
        
        if (!encontrado) {
            System.out.println("Alumno no encontrado, se devuelve 0");
        }
        
        return prom;
    }
    
}
