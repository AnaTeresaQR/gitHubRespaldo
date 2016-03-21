package patronComposite;

/**
 * Clase Composite que puede estar compuesta por más carpetas o por archivos
 *
 * @author Ana Teresa
 */
public class Carpeta implements Documento {

    private String nombre;
    private String descripcion;
    private int cantidadArchivos;

    private final int TOTALELEMENTOS = 10;// total de elementos por carpeta
    private Documento[] elementos = new Documento[TOTALELEMENTOS];// lista de documentos
    private int contador; // contador de documentos

    public Carpeta(String nombre, String descripcion, int cantidadArchivos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidadArchivos = cantidadArchivos;
    }

    /**
     * Método de agregar carpetas o archivos a la lista de documentos
     *
     * @param doc recibe una carpeta o un archivo para agregar
     */
    public void agregarElemento(Documento doc) {
        if (contador != TOTALELEMENTOS) {
            elementos[contador] = doc;
        }
        contador++;
    }

    /**
     * Elimina el último elemento agregado
     */
    public void eliminarElemento() {
        if (contador != 0) {
            contador--;
            elementos[contador] = null;
        }
    }

    /**
     * Método que cuenta cantidad de archivos total que contiene una carpeta y
     * sus carpetas compuestas
     *
     * @return devuelve la cantidad de archivos
     */
    @Override
    public int calcularCantidadArchivos() {
        int cantidadArc = cantidadArchivos;
        for (int i = 0; i < contador; i++) {
            cantidadArc += elementos[i].calcularCantidadArchivos();
        }
        return cantidadArc;
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

    public int getCantidadArchivos() {
        return cantidadArchivos;
    }

    public void setCantidadArchivos(int cantidadArchivos) {
        this.cantidadArchivos = cantidadArchivos;
    }

}
