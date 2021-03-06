package patronComposite;

/**
 * Clase nodo con atributos y método heredado
 *
 * @author Ana Teresa
 */
public class Archivo implements Documento {

    private String nombre;
    private String descripcion;

    public Archivo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    // ela rchivo no puede contener archivos en él se retorna 0
    @Override
    public int calcularCantidadArchivos() {
        return 0;
    }

}
