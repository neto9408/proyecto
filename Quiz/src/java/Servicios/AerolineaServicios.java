/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.DAOAerolinea;
import VO.Aerolina;

/**
 *
 * @author Andres Felipe Bernal
 */
public class AerolineaServicios {
   private DAOAerolinea dao = null;
   
   public boolean crear(Aerolina a){
   return this.dao.insert(a);
   } 
}
