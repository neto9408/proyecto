/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import VO.Aerolina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAOAerolinea implements IBaseDatos<Aerolina>{
  
 public boolean insert(Aerolina t) {
        boolean resultado=false;
        String nombre = "";
        Connection conexion = Conexion.getConnection();
        String query ="INSERT INTO aerolinea (nombre)" + "VALUES(?)";
        PreparedStatement ps = null;
        try {
            ps=conexion.prepareStatement(query);
            ps.setString(1, t.getNombreAerolina());
            resultado = ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;        
    }

    @Override
    public List<Aerolina> findAll() {
       List<Aerolina> aerolineas = null;
        String query = "SELECT * FROM aerolinea";
        Connection conexion = Conexion.getConnection();
        try {
            Statement st = conexion.createStatement();
	    ResultSet rs = st.executeQuery(query);
            String nombre="";
            
            while(rs.next()){
                if(aerolineas==null){
                    aerolineas = new ArrayList<Aerolina>();
                }
                Aerolina registro = new Aerolina();
                nombre = rs.getString("nombre");
                registro.setNombreAerolina(nombre);
                
                aerolineas.add(registro);
            }
            st.close();
        } catch (Exception e) {
            System.out.println("Error al listar aerolineas.");
        }
        return aerolineas;
    }

    @Override
    public boolean update(Aerolina t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Aerolina t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}