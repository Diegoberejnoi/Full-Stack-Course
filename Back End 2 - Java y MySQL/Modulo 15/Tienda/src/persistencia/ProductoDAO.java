/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Fabricante;
import entidades.Producto;

public final class ProductoDAO extends DAO {

    /*Lista el nombre de todos los productos que hay en la tabla producto.*/
    public void mostrarTodoslosProductos() throws Exception {

        try {

            String sql = "select nombre from producto;";
            consultarBase(sql);

            while (resultado.next()) {

                String nombre = resultado.getString(1);
                System.out.println("Fila " + nombre);
            }

            desconectarBase();

        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw e;

        }

    }

    /*Lista los nombres y los precios de todos los productos de la tabla producto.*/
    public void mostrarNombreYPrecioDelosProductos() throws Exception {

        try {

            String sql = "select nombre, precio from producto;";
            consultarBase(sql);

            while (resultado.next()) {

                String nombre = resultado.getString(1);
                double precio = resultado.getDouble(2);
                System.out.println("Fila " + nombre + " " + precio);
            }

            desconectarBase();

        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw e;

        }

    }

    /*Listar aquellos productos que su precio esté entre 120 y 202.*/
    public void mostrarProductosEntre120y202() throws Exception {

        try {

            String sql = "select * from producto where precio between 120 and 202;";
            consultarBase(sql);

            while (resultado.next()) {

                int codigo = resultado.getInt(1);
                String nombre = resultado.getString(2);
                double precio = resultado.getDouble(3);
                int codigoF = resultado.getInt(4);

                System.out.println("Fila " + codigo + " " + nombre + " " + precio + " " + codigoF);
            }

            desconectarBase();

        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw e;

        }

    }

    /*Buscar y listar todos los Portátiles de la tabla producto*/
    public void mostrarPortatiles() throws Exception {

        try {

            String sql = "select * from producto where nombre like ('portatil%');";
            consultarBase(sql);

            while (resultado.next()) {

                int codigo = resultado.getInt(1);
                String nombre = resultado.getString(2);
                double precio = resultado.getDouble(3);
                int codigoF = resultado.getInt(4);

                System.out.println("Fila " + codigo + " " + nombre + " " + precio + " " + codigoF);
            }

            desconectarBase();

        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw e;

        }

    }

    /*Listar el nombre y el precio del producto más barato.*/

    public void productomasBarato() throws Exception {

        try {

            String sql = "select nombre, precio from producto order by precio asc limit 1;";
            consultarBase(sql);

            while (resultado.next()) {

                String nombre = resultado.getString(1);
                double precio = resultado.getDouble(2);

                System.out.println("Fila " + nombre + " " + precio);
            }

            desconectarBase();

        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw e;

        }

    }

    public void ingresarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES"
                    + "('" + producto.getNombre() + "', " + producto.getPrecio()
                    + "," + producto.getFabricante().getCodigo() + ");";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            System.out.println("Error en productoDao al ingresar");
            throw e;
        }

    }

    public void eliminarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "DELETE FROM producto WHERE codigo=" + producto.getCodigo() + ";";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public void modificarProducto(Producto producto, String nombre, double precio, Fabricante fabricante) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe ingresar un producto");
            }

            String sql = "UPDATE producto SET nombre ='" + nombre + "' ,precio= " + precio
                    + ", codigo_fabricante=" + fabricante.getCodigo() + " WHERE codigo=" + producto.getCodigo() + ";";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }

    }

    public Producto buscarProductoPorNombre(String nombre) throws Exception {
        try {
            if (nombre == null) {
                throw new Exception("Debe ingresar un nombre");
            }

            String sql = "Select p.codigo, p.nombre, p.precio, p.codigo_fabricante, f.nombre"
                    + " from producto p, fabricante f where p.nombre='" + nombre
                    + "' and f.codigo=p.codigo_fabricante;";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setFabricante(new Fabricante(resultado.getInt(4), resultado.getString(5)));
            }
            desconectarBase();
            return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}
