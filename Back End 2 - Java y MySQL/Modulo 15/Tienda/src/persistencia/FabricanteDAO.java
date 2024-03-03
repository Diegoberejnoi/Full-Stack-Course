/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Fabricante;
import entidades.Producto;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public final class FabricanteDAO extends DAO {

    public FabricanteDAO() {
    }

    public void ingresarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            String sql = "INSERT INTO fabricante (nombre) VALUES"
                    + "('" + fabricante.getNombreFabricante() + "');";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void eliminarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            String sql = "DELETE FROM fabricante WHERE codigo=" + fabricante.getCodigo() + ";";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarFabricante(Fabricante fabricante, String nombre) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe ingresar un fabricante");
            }

            String sql = "UPDATE fabricante SET nombre ='" + nombre + "' WHERE codigo=" + fabricante.getCodigo() + ";";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {
        Fabricante fabricante = null;
        try {
            if (nombre == null) {
                throw new Exception("Debe ingresar un nombre");
            }
            String sql = "SELECT codigo, nombre FROM fabricante WHERE nombre = '" + nombre + "';";
            
            consultarBase(sql);
           
                if (resultado.next()) {
                fabricante = new Fabricante();               
                fabricante.setCodigo(resultado.getInt("codigo"));
                fabricante.setNombreFabricante(resultado.getString("nombre"));
                };
            
           

        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Error al buscar el fabricante");            
            
        }finally{
            desconectarBase();
            return fabricante;
        }
    }
    
    public void mostrarFabricantes() throws Exception{
        try {
            String sql = "select * from fabricante;";
            consultarBase(sql);

            
            while (resultado.next()) {

                int codigo = resultado.getInt(1);
                String nombre = resultado.getString(2);
                System.out.println("Fila " +codigo + " "+ nombre);
            }

            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
            
        }
    }

}
