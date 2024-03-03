/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Raices;

/**
 *
 * @author Diego
 */
public class RaicesServicio {
    /*
    a) Método getDiscriminante(): devuelve el valor del discriminante
    (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    */
    
    public double getDiscriminante(Raices raiz){
      return (Math.pow(raiz.getB(),2)) - (4*raiz.getA()*raiz.getC());  
    };
    
    /*
    b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
    soluciones, para que esto ocurra, el discriminante debe ser mayor o
    igual que 0.
    */
    
    public boolean tieneRaices(Raices raiz){
        return getDiscriminante(raiz)>0;
    }
    
    /*
    
    c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
    única solución, para que esto ocurra, el discriminante debe ser igual
    que 0.
    */
    public boolean tieneRaiz(Raices raiz){
        return getDiscriminante(raiz)==0;
    }
    /*
    d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
    imprime las 2 posibles soluciones.
    */
    
    public void obtenerRaices(Raices raiz){
        double discriminante=(Math.pow(raiz.getB(),2)) - (4*raiz.getA()*raiz.getC());
        if(tieneRaices(raiz)){
            System.out.println("Raiz 1="+ (Math.sqrt(discriminante)));
            System.out.println("Raiz 2="+ (-1*Math.sqrt(discriminante)));
        }
    }
    
    /*
    e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
    una única raíz. Es en el caso en que se tenga una única solución
    posible.
    */
    
    public void obtenerRaiz(Raices raiz){
        double discriminante=(Math.pow(raiz.getB(),2)) - (4*raiz.getA()*raiz.getC());
        if(tieneRaiz(raiz)){
            System.out.println("Raiz 1="+ (Math.sqrt(discriminante)));
            
        }
    }
    
    
    /*
    f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
    y mostrará por pantalla las posibles soluciones que tiene nuestra
    ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
    que devuelvan nuestros métodos y en caso de no existir solución, se
    mostrará un mensaje.
    Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
    el signo delante de -b
    */
    
    public void calcular(Raices raiz){
       double discriminante=(Math.pow(raiz.getB(),2)) - (4*raiz.getA()*raiz.getC());
       
       if(tieneRaiz(raiz)){
           System.out.println("La solucion es = "
           + ((-1*raiz.getB()+Math.sqrt(discriminante))/(2*raiz.getA())));
       }else if(tieneRaices(raiz)){
           System.out.println("La primera solucion es = "
           + ((-1*raiz.getB()+Math.sqrt(discriminante))/(2*raiz.getA())));
           System.out.println("La segunda solucion es = "
           + ((-1*raiz.getB()-Math.sqrt(discriminante))/(2*raiz.getA())));
       }else{
           System.out.println("No tiene solucion en los reales");
       }
        
    }
}
