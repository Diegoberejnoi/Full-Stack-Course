/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje2.entidades;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Circunferencia {
    
    private double radio;
    private double area;
    private double perimetro;

    public Circunferencia(double radio) {
      this.radio = radio;
    }

    public Circunferencia() {
       radio=0;
       area=0;
       perimetro=0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public void crearCircunferencia(){
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de la circunferencia");
        radio=in.nextDouble();
       in.nextLine();
     }
    
    public void area(){
        area=(Math.PI)*Math.pow(radio,2);
    }
    public void perimetro(){
        perimetro=2*(Math.PI)*radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" +  ", radio=" + radio + ", area=" + area + ", perimetro=" + perimetro + '}';
    }
    
    
}
