/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
 * @author Carlos Ezequiel Diaz
 */
public class Electrodomestico {
    
    protected double precio, peso;
    protected String color;
    protected char consumoE;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, double peso, String color, char consumoE) {
        this.precio = precio;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoE);
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(char consumoE) {
        this.consumoE = consumoE;
    }
    
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumoE=" + consumoE + '}';
    }
    
    
    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    
    public void comprobarConsumoEnergetico(char letra){
        
        letra = Character.toLowerCase(letra);
               
        if (Character.compare(letra,'f')>0){
            
            consumoE='f';
            
        } else {
            
            consumoE= letra;
        }
        
    }
    
    /*Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    
    public void comprobarColor(String color){
        
        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("gris")){
            
            this.color = "blanco";
        } else {
            
            this.color = color.toLowerCase();
        }
        
        
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    
    public void crearElectrodomestico(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        precio = 1000d;
        
        System.out.print("Ingrese el peso del producto: ");
        peso = leer.nextDouble();
        leer.nextLine();
        
        System.out.print("Ingrese el color del producto: ");
               
        comprobarColor(leer.next());
        
        
        System.out.print("Ingrese el consumo del producto (a/f): ");
        
        comprobarConsumoEnergetico(leer.next().charAt(0));
        
        
       
    }
    
    
    /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
    
    public void precioFinal(){
        
        switch(consumoE){
            
            case 'a':
                precio+=1000d;
                break;
            case 'b':
                precio+=800d;
                break;
            case 'c':
                precio+=600d;
                break;
            case 'd':
                precio+=500d;
                break;
            case 'e':
                precio+=300d;
                break;
            case 'f':
                precio+=100d;
                break;
            
        }
        
        precio += (peso<=19)?100d: (peso>19 && peso <=49)?500d:(peso>49 && peso<=79)?800d:1000d;//operadores ternarios
        
        
        
    }
    
}

