/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Arrays;

/**
 *
 * @author Diego
 */
public class ArregloService {
    
    public void inicializarA(double vector[]){
        int longitud= vector.length;
        
        for (int i = 0; i < longitud; i++) {
            vector[i]=(int)(-10 + Math.random()*(10-(-10)+1));
        }
    }
    public void mostrar(double vector[]){
        int longitud= vector.length;
        System.out.println(Arrays.toString(vector));
    }
    public void ordenar(double vector[]){
        int longitud=vector.length;
        double vectorAux[]=Arrays.copyOf(vector, longitud);
        
        Arrays.sort(vectorAux);
        for (int i = 0; i < longitud; i++) {
            vector[i]=vectorAux[longitud-1-i];
        }
    }
    public void inicializarB(double vectorB[], double vectorA[]){
        int longitud = vectorB.length;
        //tambien se puede hacer con System.arraycopy(vectorA, 0, vectorB, 0, longitud);
        for (int i = 0; i < 10; i++) {
            vectorB[i]=vectorA[i];
        }
        Arrays.fill(vectorB, 10, longitud, 0.5);
        
    }
}
