package patronPrototype;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana Teresa
 */
public class Persona implements Prototype {

    private String nombre;
    private String apellido;
    private int edad;
    private Direccion dir;

    public Persona(String nombre, String apellido, int edad, Direccion dir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dir = dir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    /**
     * Es una copia profunda debido a que una de sus variables es una clase que
     * también es clonada
     *
     * @return una Persona
     */
    @Override
    public Object clone() {
        return new Persona(getNombre(), getApellido(), getEdad(), (Direccion) getDir().clone());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + "\n" + dir + '}';
    }

}
