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
public class ConcreteBuilder implements AbstractBuilder {

    Proyecto p;

    public ConcreteBuilder() {
    }

    @Override
    public void buildProyecto() {
        p = new Proyecto();
    }

    @Override
    public void buildNombre(String nombre) throws Error {
        if (nombre != null && !nombre.equals("")) {
            p.setNombreP(nombre);
        } else {
            throw new Error("El nombre del proyecto no se puede registrar");
        }
    }

    @Override
    public void buildEmpleado(Empleado emp) throws Error {
        if (emp != null) {
            p.setEncargado(emp);
        } else {
            throw new Error("El encargado no se puede crear");
        }
    }

    @Override
    public void buildSemanas(int semanas) throws Error {
        if (semanas > 0) {
            p.setSemanas(semanas);
        } else {
            throw new Error("Las semanas no se pueden registrar");
        }
    }

    @Override
    public void buildFechas(Date[] fechas) throws Error {
        if (fechas != null && fechas.length >= 1) {
            p.setFechas(fechas);
        } else {
            throw new Error("La fecha no se puede registrar");
        }
    }

    @Override
    public Proyecto getProyecto() {
        return p;
    }

}
