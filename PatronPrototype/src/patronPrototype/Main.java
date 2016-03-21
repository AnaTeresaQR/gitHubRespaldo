/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronPrototype;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Direccion d1 = new Direccion("Alajuela", 20703);
        Persona p1 = new Persona("Te", "Quesada", 20, d1);

        System.out.println("--------Persona 1 creada--------\n" + p1.toString());

        Persona p2 = (Persona) p1.clone();

        System.out.println("\n--------Persona 1 ha sido clonada, pero no cambia--------\n" + p1.toString());

        System.out.println("\n--------Persona 2 copia (Copia de persona 1)--------\n" + p2.toString());

        p2.setNombre("Juan");
        p2.setApellido("Arias");

        Direccion d2 = (Direccion) d1.clone();
        d2.setCodigoPostal(20207);

        p2.setDir(d2);

        System.out.println("\n--------Persona 2 modificada--------\n" + p2.toString());

        System.out.println("\n--------Persona 1 no cambia después de modificarse persona 2--------\n" + p1.toString());

    }
}
