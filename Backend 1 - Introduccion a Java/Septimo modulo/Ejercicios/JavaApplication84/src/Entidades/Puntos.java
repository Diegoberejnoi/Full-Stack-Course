/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Puntos {
    private double x1, x2, y1, y2;
    
    public void crearPuntos(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer punto (x1,y1)");
        this.x1=in.nextDouble();
        this.y1=in.nextDouble();
        System.out.println("Ingrese el segundo punto (x2,y2)");
        this.x2=in.nextDouble();
        this.y2=in.nextDouble();
        in.nextLine();
    }
    
    public double distancia(){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
}