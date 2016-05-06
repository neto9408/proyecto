/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

import java.sql.Date;

/**
 *
 * @author Andres Felipe Bernal
 */
public class Vuelo {
    
    private String codigo;
    private Date fecha;
    private int capacidad;
    private int disponiblesPromo;
    private int disponiblesEcono;
    private int disponiblesFlexi;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getDisponiblesPromo() {
        return disponiblesPromo;
    }

    public void setDisponiblesPromo(int disponiblesPromo) {
        this.disponiblesPromo = disponiblesPromo;
    }

    public int getDisponiblesEcono() {
        return disponiblesEcono;
    }

    public void setDisponiblesEcono(int disponiblesEcono) {
        this.disponiblesEcono = disponiblesEcono;
    }

    public int getDisponiblesFlexi() {
        return disponiblesFlexi;
    }

    public void setDisponiblesFlexi(int disponiblesFlexi) {
        this.disponiblesFlexi = disponiblesFlexi;
    }
    
}
