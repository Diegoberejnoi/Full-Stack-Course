/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Fabricante {
    
    private int codigo;
    private String nombreFabricante;

    public Fabricante() {
    }

    public Fabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }
    

    public Fabricante(int codigo, String nombreFabricante) {
        this.codigo = codigo;
        this.nombreFabricante = nombreFabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "codigo=" + codigo + ", nombreFabricante=" + nombreFabricante + '}';
    }
    
    
}
