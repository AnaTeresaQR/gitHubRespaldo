package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class MemoriaRam extends Decorador {

    private String descripcion = " MemoriaRam mayor capacidad";
    private int precio = 10000;

    public MemoriaRam(Component component) {
        super(component);
    }

    @Override
    public String descripcion() {
        return super.getComponent().descripcion() + " + " + descripcion;
    }

    @Override
    public int precio() {
        return super.getComponent().precio() + precio;
    }

}
