/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.util.ArrayList;

/**
 *
 * @author Andres Felipe Bernal
 */
public class Aerolina {
    private String nombreAerolina;
    private ArrayList<Vuelo> vuelos;

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public String getNombreAerolina() {
        return nombreAerolina;
    }

    public void setNombreAerolina(String nombreAerolina) {
        this.nombreAerolina = nombreAerolina;
    }
    
}
