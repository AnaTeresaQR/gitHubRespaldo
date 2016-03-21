package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class TarjetaVideo extends Decorador {

    private String descripcion = "Tarjeta de video";
    private int precio = 10000;

    public TarjetaVideo(Component component) {
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
