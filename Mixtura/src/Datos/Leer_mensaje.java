/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Presentacion.Interaccion;
import java.sql.SQLException;
import Datos.Datos_trabajo;
import Datos.conexion;

/**
 *
 * @author Equipo
 */
public class Leer_mensaje extends conexion{

    public Datos_trabajo getDatos(int num) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        Datos_trabajo dat= new Datos_trabajo();

        String sql = "SELECT * FROM leer_mensaje_db WHERE id=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, num);
            rs = ps.executeQuery();

            if (rs.next()) {

                dat.setId(Integer.parseInt(rs.getString("id")));
                dat.setMensaje(rs.getString("reflexion"));
                dat.setDonacion(rs.getString("donacion"));
                return dat;
            }
            return null;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
             try{
                 con.close();
             }catch(SQLException e){
                 System.err.println(e);
             }
        }

    }

}
