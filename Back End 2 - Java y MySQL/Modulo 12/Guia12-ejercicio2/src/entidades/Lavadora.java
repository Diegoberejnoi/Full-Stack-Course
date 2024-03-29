/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
 
 * @author Carlos Ezequiel Diaz
 */
public final class Lavadora extends Electrodomestico {
    
    private double carga;

    public Lavadora() {
    }

    
    public Lavadora(double carga, double precio, double peso, String color, char consumoE) {
        super(precio, peso, color, consumoE);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{"+ super.toString() + "carga=" + carga + '}';
    }

    
    
    
    
  /*Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    
    public void crearLavadora (){
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        super.crearElectrodomestico();
        System.out.print("ingrese la capacidad de carga de la lavadora: ");
        carga = leer.nextDouble();
        leer.nextLine();
        
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        
        if (carga>30){
            
            precio+=500;
        } 
        
    }
}
