
package entidades;

import java.util.Random;

public class Pistola {
    private int posActual;
    private int posAgua;
    private static Random rn = new Random();
            
    public void llenarRevolver(){
        this.posActual = rn.nextInt(5)+1;
        this.posAgua = rn.nextInt(5)+1;
    }

    public int getPosActual() {
        return posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public boolean mojar(){
        return this.posActual == this.posAgua;
    }
    
    public void siguienteChorro(){
        if (this.posActual == 6){
            this.posActual = 1;
        }else{
            this.posActual++;
        }
    }

    @Override
    public String toString() {
        return "posActual=" + posActual + ", posAgua=" + posAgua;
    }
    
    
}
