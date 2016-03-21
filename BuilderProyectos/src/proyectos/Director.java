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
public class Director {

    public Proyecto buildProyecto(AbstractBuilder b, String nombre, Empleado encargado, int semanas, Date[] fechas) throws Error {
        if (b != null) {
            b.buildProyecto();
            b.buildNombre(nombre);
            b.buildEmpleado(encargado);
            b.buildSemanas(semanas);
            b.buildFechas(fechas);
            return b.getProyecto();
        }
        return null;
    }

}
