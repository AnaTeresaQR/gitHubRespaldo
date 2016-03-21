/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerDecorator;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        // se crea una computadora NO decorada y se imprimen sus datos
        ComponentComputer c1 = new Computer();

        System.out.println("Compu1: \n" + c1.getDescripcion() + " \nPrecio: " + c1.getPrecio());

        //-------------------------------------------------------------------------------------------------------
        // se crea una computadora decorada con sus nuevos componentes y se imprimen sus datos
        ComponentComputer c2 = new Computer();
        c2 = new RamMemory(c2); // se añaden componentes como decoración
        c2 = new VideoCard(c2);
        c2 = new WebCam(c2);

        System.out.println("\nCompu2 todos los componentes: \n" + c2.getDescripcion() + " \nPrecio: " + c2.getPrecio());

    }

}
