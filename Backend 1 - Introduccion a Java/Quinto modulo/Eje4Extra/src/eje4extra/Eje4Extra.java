/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje4extra;

/**
 *
 * @author Diego
 */
public class Eje4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float[][] matriz = new float [10][4];
        float[] promedio = new float[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j]=(float) (Math.random()*10);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 10; i++) {
            promedio[i]=(float)(matriz[i][0] * 0.1 + matriz[i][1] * 0.15 + matriz[i][2] * 0.25 + matriz[i][3] * 0.5);
            System.out.print("["+promedio[i]+"]");
        }
        System.out.println("");
        
        int aprobados=0,desaprobados=0;
        
        for (int i = 0; i < 10; i++) {
            if(promedio[i]<7){
                desaprobados++;
            }else {
                aprobados++;
            }
            
        }
        System.out.println("Hay " + aprobados + " aprobados, y " + desaprobados + " desaprobados");
        
    }
    
}
