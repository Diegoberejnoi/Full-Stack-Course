/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public abstract class DAO {

    protected Connection coneccion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;

    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    protected void conectarBase() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE;// + "useSSl=false";
            coneccion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);

        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (coneccion != null) {
                coneccion.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    protected void insertarModificarEliminar(String consultaSql) throws SQLException, ClassNotFoundException, Exception {
        try {
            conectarBase();
            sentencia = coneccion.createStatement();
            sentencia.executeUpdate(consultaSql);
        } catch (SQLException | ClassNotFoundException ex) {
            coneccion.rollback();

            throw ex;
        } finally {
            desconectarBase();
        }
    }

    protected void consultarBase(String consultaSql) throws Exception {
        try {
            conectarBase();
            sentencia = coneccion.createStatement();
            resultado = sentencia.executeQuery(consultaSql);
        } catch (Exception ex) {
            throw ex;
        }
    }

}
