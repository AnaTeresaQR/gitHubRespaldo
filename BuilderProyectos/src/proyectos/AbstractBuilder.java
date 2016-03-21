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
public interface AbstractBuilder {

    public void buildProyecto();

    public void buildNombre(String nombre) throws Error;

    public void buildEmpleado(Empleado emp) throws Error;

    public void buildSemanas(int semanas) throws Error;

    public void buildFechas(Date[] fechas) throws Error;

    public Proyecto getProyecto();
}
