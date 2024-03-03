/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Diego
 */
public class Ovni {
    public int X,Y,Z;
    public int resistencia;
    public boolean hostil,destruido;
    

    public Ovni(int X, int Y, int Z, int resistencia, boolean hostil) {
        this.X = X;
        this.Y = Y;
        this.Z = Z;
        this.resistencia = resistencia;
        this.hostil = hostil;
    }

    public Ovni() {
        this.X=(int) (Math.random()*10000);
        this.Y = (int) (Math.random()*10000);
        this.Z = (int) (Math.random()*10000);
        this.resistencia = (int) (Math.random()*10);
        this.hostil = (Math.random()>0.5);
        destruido=false;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }
    
    

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public int getZ() {
        return Z;
    }

    public void setZ(int Z) {
        this.Z = Z;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }
    
}
