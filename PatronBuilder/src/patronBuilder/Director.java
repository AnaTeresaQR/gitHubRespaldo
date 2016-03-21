/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronBuilder;

/**
 *
 * @author Ana Teresa
 */
public class Director {

    public ProductPersona buildPersona(AbstractBuilder builder, String nombre, String apellido, int edad) throws Error {

        if (builder != null) {
            builder.buildNombre(nombre);
            builder.buildApellidos(apellido);
            builder.buildEdad(edad);
            return builder.getProducto();
        }
        return null;
    }
}
