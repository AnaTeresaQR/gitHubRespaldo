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
public interface AbstractBuilder {

    public void buildNombre(String nombre) throws Error;

    public void buildApellidos(String apellido) throws Error;

    public void buildEdad(int edad) throws Error;

    public ProductPersona getProducto();
}
