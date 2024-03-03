/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Excepciones.DispositivoDaniado;

/**
 *
 * @author Diego
 */
public class Dispositivo {
    protected float consumoEnergia;
    protected boolean daniado,destruido;

    public Dispositivo(float consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
        daniado=false;
        destruido=false;
    }
    
    public Dispositivo() {
        consumoEnergia=10000f;
        daniado=false;
        destruido=false;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }
    

    public float getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(float consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    
    public float usarDispositivo(int segundos,int intensidad) throws DispositivoDaniado{
        float gastoEnergia;
        try {
            if(daniado){
            throw new DispositivoDaniado("Error: Dispositivo Dañado \nNo se realizo la acción");
            }
        float probDanio=(float) Math.random();
        daniado=(probDanio<0.3); 
        gastoEnergia = consumoEnergia*intensidad*segundos;
        } catch (DispositivoDaniado e) {
            System.out.println(e.getMessage());
            gastoEnergia= 0f;
        } 
        return gastoEnergia;
    }
    
    public void repararDispotivo(){
        
        do { 
            float probabilidad=(float)Math.random();
            daniado=(probabilidad<=0.4);
            destruido=(probabilidad>0.7);
            if (!daniado) {
                System.out.println("El dispositivo se reparo");
            }
            if (destruido) {
                System.out.println("El dispositivo de destruyó");
            }
            
        } while (daniado && !destruido);//
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }
    
    
    @Override
    public String toString() {
        return (daniado)? "Dañado":"Sin Daños";
    }
    
}
