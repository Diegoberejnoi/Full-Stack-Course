/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.Entidades;

/**
 *
 * @author Diego
 */
public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }
    
    public void crearRectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int area(){
        int area=base*altura;
        return area;
    }
    
    public int perimetro(){
        int per=(base+altura)*2;
        return per;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
    
    
    
    /*
    
    *******
    *     *
    *     *
    *******
    
    
    */
    
    public void dibujarRectangulo(){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i==0 || i==(altura-1) || j == 0 || j == (base-1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
    }
    
    
}
