/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class conexion {
   
    private static final String URL = "jdbc:mysql://localhost:3306/bd_herramientas3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Pablolorena2002";
    private  Connection con = null;
    
    public  Connection getConexion(){
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = (Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
            
}
