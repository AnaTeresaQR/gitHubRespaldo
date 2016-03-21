package proyectosComposite;

/**
 * Clase nodo que es el último en la composición, es decir él no se compone de
 * ningún otro elemento
 *
 * @author Ana Teresa
 */
public class Entregable implements Proyecto {

    private String nombre;
    private String descripcion;
    private Empleado encargado;

    public Entregable(String nombre, String descripcion, Empleado encargado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.encargado = encargado;
    }

    @Override
    public int calcularTiempo() {
        return 0;
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

    public Empleado getEncargado() {
        return encargado;
    }

    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }

}
