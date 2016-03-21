package proyectosComposite;

import java.util.ArrayList;

/**
 * Clase composición, se compone de ella misma o de entregables, maneja
 * proyectos (agregar, eliminar, calcularTiempo)
 *
 * @author Ana Teresa
 */
public class Tarea implements Proyecto {

    private String nombre;
    private String descripcion;
    private int tiempoRequerido;
    private Empleado encargado;
    private ArrayList<Proyecto> elementos = new ArrayList<>(); // lista para guardar proyectos

    public Tarea(String nombre, String descripcion, int tiempoRequerido, Empleado encargado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tiempoRequerido = tiempoRequerido;
        this.encargado = encargado;
    }

    // agregar proyecto a la lista de proyectos
    public void agregarProyecto(Proyecto elemento) {
        elementos.add(elemento);
    }

    // eliminar un proyecto de la lista de proyectos
    public void eliminarProyecto(Proyecto elemento) {
        elementos.remove(elemento);
    }

    // método que calcula el tiempo requerido por proyecto en horas
    @Override
    public int calcularTiempo() {
        int tiempo = this.tiempoRequerido;
        for (int i = 0; i < elementos.size(); i++) {
            tiempo += elementos.get(i).calcularTiempo();
        }
        return tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoRequerido() {
        return tiempoRequerido;
    }

    public void setTiempoRequerido(int tiempoRequerido) {
        this.tiempoRequerido = tiempoRequerido;
    }

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

}
