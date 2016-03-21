/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Proyecto {

    private String nombreP;
    private Empleado encargado;
    private int semanas;
    private Date[] fechas;

    public Proyecto() {
    }

    public Proyecto(String nombreP, Empleado encargado, int semanas, Date[] fechas) {
        this.nombreP = nombreP;
        this.encargado = encargado;
        this.semanas = semanas;
        this.fechas = fechas;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public Date[] getFechas() {
        return fechas;
    }

    public void setFechas(Date[] fechas) {
        this.fechas = fechas;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombreP=" + nombreP + ", encargado=" + encargado + ", semanas=" + semanas + '}';
    }

}
