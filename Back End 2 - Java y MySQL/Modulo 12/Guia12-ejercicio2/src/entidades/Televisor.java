/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Televisor extends Electrodomestico {
    
    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    
    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, double peso, String color, char consumoE) {
        super(precio, peso, color, consumoE);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    @Override
    public String toString() {
        return "Televisor{"+ super.toString() + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT + '}';
    }
    
    
    
    
    /*Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    
    public void crearTelevisor (){
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("ingrese el tamaño de la tv en pulgadas: ");
        resolucion = leer.nextInt();
        leer.nextLine();
        
        System.out.print("indique si el TV tiene Sintonizador TDT: (s/n)");
        sintonizadorTDT = (leer.next().toLowerCase().charAt(0)=='s');
                
    }
    
    @Override
      public void precioFinal(){
        super.precioFinal();
        
        if (resolucion>40){
            
            precio*=1.3;
        } 
        
        if (sintonizadorTDT){
            precio+=500;
        }
        
    }
    
}
