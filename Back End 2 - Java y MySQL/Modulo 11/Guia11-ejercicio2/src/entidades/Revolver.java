package entidades;

public class Revolver {
    
    //Atributos

    private int posicionActual;
    private int posicionAgua;
    
    //constructores

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "posicion Actual:" + posicionActual + ", posicion del Agua:" + posicionAgua;
    }
    
    
    
}


