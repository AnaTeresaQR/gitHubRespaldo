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
public class ConcreteBuilder implements AbstractBuilder {
    
    ProductPersona persona;
    
    public ConcreteBuilder() {
        persona = new ProductPersona();
    }
    
    @Override
    public void buildNombre(String nombre) throws Error {
        if (nombre != null && !nombre.equals("")) {
            persona.setNombre(nombre);
        } else {
            throw new Error("No se puede registrar el nombre");
        }
    }
    
    @Override
    public void buildApellidos(String apellido) throws Error {
        if (apellido != null && !apellido.equals("")) {
            persona.setApellido(apellido);
        } else {
            throw new Error("No se puede registrar el apellido");
        }
    }
    
    @Override
    public void buildEdad(int edad) throws Error {
        if (edad >= 1) {
            persona.setEdad(edad);
        } else {
            throw new Error("No se puede registrar la edad");
        }
    }
    
    @Override
    public ProductPersona getProducto() {
        return persona;
    }
    
}
