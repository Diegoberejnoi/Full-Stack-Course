/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorprueba;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Integradorprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante alumno1 = new Estudiante();
        Estudiante alumno2 = new Estudiante();
        Estudiante alumno3 = new Estudiante();
        Estudiante alumno4 = new Estudiante();
        Estudiante alumno5 = new Estudiante();
        Estudiante alumno6 = new Estudiante();
        Estudiante alumno7 = new Estudiante();
        Estudiante alumno8 = new Estudiante();
        Estudiante estudianteVector[]={alumno1,alumno2,alumno3,alumno4,alumno5,alumno6,alumno7,alumno8};
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        double nota;
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingresar nota");
            nota=in.nextDouble();
            estudianteVector[i].setNota(nota);
        }
        for (int i = 0; i < 8; i++) {
            System.out.println((i+1)+":"+estudianteVector[i].getNota());
        }
        
    }
    
}
