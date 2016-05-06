/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.DAOVuelo;
import VO.Vuelo;

/**
 *
 * @author Andres Felipe Bernal
 */
public class VueloServicio {
    private DAOVuelo dao= null;
     
    public boolean crearVuelo(Vuelo t){
    return this.dao.insert(t);
    }
}
