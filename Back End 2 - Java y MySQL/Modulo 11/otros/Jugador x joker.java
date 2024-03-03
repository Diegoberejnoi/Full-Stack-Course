
package entidades;

public class Jugador {
    private int id;
    private String nombre;
    private static int cont = 1;
    private boolean mojado= false;
    
    public Jugador(){
        this.id = cont++;
        this.nombre = "jugador" + this.id;
    }
    
    public void disparo(Pistola pistola){
        if (pistola.mojar()){
            this.mojado = true;
        }else{
            pistola.siguienteChorro();
        }
    }

    public boolean isMojado() {
        return this.mojado;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Jugador{ nombre=" + nombre + "}";
    }
    
    
}
