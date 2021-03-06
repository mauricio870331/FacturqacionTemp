/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Innova
 */
public class FranquiciasDAO {

    Connection cn = Conexion.getConexion();
    PreparedStatement pstm;
    CallableStatement clstm;
    String sql;
    ResultSet rs;

    //Listar
    public List<Franquicias> getFranquiciasList() throws SQLException {
        List<Franquicias> list = new ArrayList<>();        
        try {
            sql = "{call listarFranquicia()}";
            clstm = cn.prepareCall(sql);
            rs = clstm.executeQuery();
            while (rs.next()) {
                Franquicias f = new Franquicias(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(f);
            }
        } catch (SQLException e) {
            System.out.println("error " + e);
        } 
        return list;
    }

    //Crear y editar 
    public boolean crearFranquicia(int id_franquicia, String nombre, String transacion, String opc) throws SQLException {
//        System.out.println("" + id_ciudad + " " + nombre + " " + id_departamento + " " + opc);
        boolean creado = false;        
        try {
            cn.setAutoCommit(false);
            if (opc.equals("create")) {

                sql = "{call insertarFranquicia(?,?)}";
            } else {
                sql = "{call actualizarFranquicia(?,?,?)}";
            }
            clstm = cn.prepareCall(sql);
            if (opc.equals("update")) {
                clstm.setInt(1, id_franquicia);
                clstm.setString(2, nombre);
                clstm.setString(3, transacion);
            } else {
                clstm.setString(1, nombre);
                 clstm.setString(2, transacion);
            }

            rs = clstm.executeQuery();
            String result = "";
            while (rs.next()) {
                result = rs.getString(1);
            }
            System.out.println("result = " + result);//pendiente mostrar en joptionpane

            creado = true;
            cn.commit();
        } catch (Exception e) {
            System.out.println("error " + e);
        } 
        return creado;
    }

    //Eliminar 
    public boolean eliminarFranquicia(int id_franquicia) throws SQLException {
        boolean creado = false;        
        try {
            cn.setAutoCommit(false);
            sql = "{call eliminarFranquicia(?)}";
            clstm = cn.prepareCall(sql);
            clstm.setInt(1, id_franquicia);
            ResultSet rs = clstm.executeQuery();
            String result = "";
            if (rs.next()) {
                result = rs.getString(1);
            }
            System.out.println("result = " + result);//pendiente mostrar en joptionpane

            creado = true;
            cn.commit();
        } catch (Exception e) {
            System.out.println("error " + e);
        } 
        return creado;
    }

}


