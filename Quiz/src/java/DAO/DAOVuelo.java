/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.Vuelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Andres Felipe Bernal
 */
public class DAOVuelo implements IBaseDatos<Object> {

    @Override
    public List<Object> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean insert(Vuelo t) {
        boolean resultado=false;
        String nombre = "";
        Connection conexion = Conexion.getConnection();
        String query ="INSERT INTO vuelo (codigo, fecha, capacidad, disponiblesPromo, disponiblesEcono, disponiblesFlexi, aerolinea_nombre)" + "VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps=conexion.prepareStatement(query);
            ps.setString(1, t.getCodigo());
            ps.setDate(1, t.getFecha());
            ps.setInt(1, t.getCapacidad());
            ps.setInt(1, t.getDisponiblesPromo());
            ps.setInt(1, t.getDisponiblesEcono());
            ps.setInt(1, t.getDisponiblesFlexi());
            ps.setString(1, t.getAerolinea().getNombreAerolina());
            resultado = ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;        
    }

    @Override
    public boolean update(Object t) {
        System.out.println("problemas al cargar el vuelo");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insert(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
