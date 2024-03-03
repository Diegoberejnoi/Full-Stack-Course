/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EstudianteService {
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    
    public Estudiante notas(){
    Estudiante clase = new Estudiante();
    clase.setNotas(new double[8]);
    
    double nota;
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingresar nota");
            nota=in.nextDouble();
            clase.getNotas()[i].setNotas(nota);
        }
    
    }
    
}
