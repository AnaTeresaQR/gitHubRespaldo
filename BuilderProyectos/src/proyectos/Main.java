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
public class Main {

    public static void main(String[] args) {

        try {
            Date[] d1 = new Date[2];
            d1[0] = new Date();
            d1[1] = new Date();
            Date[] d2 = null;

            AbstractBuilder ab = new ConcreteBuilder();

            Director d = new Director();

            Empleado emp1 = new Empleado("Juan", "Arias", "207440378");

            Empleado emp2 = new Empleado("Tere", "Quesada", "207410170");

            Proyecto p1 = d.buildProyecto(ab, "Máquina", emp1, 4, d1);

            System.out.println("---------Proyecto número 1---------\n" + p1.toString());

            Proyecto p2 = d.buildProyecto(ab, "Robot", emp2, 4, d1);
            System.out.println("\n---------Proyecto número 2---------\n" + p2.toString());

            System.out.println("\n---------Proyecto número 1---------\n" + p1.toString());
        } catch (Error ex) {
            System.out.println("" + ex.getMessage());
        }

    }
}
