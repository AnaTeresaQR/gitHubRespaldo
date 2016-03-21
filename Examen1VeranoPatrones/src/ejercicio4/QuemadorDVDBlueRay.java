package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class QuemadorDVDBlueRay extends Decorador {

    private String descripcion = " QuemadorDVDBlueRay";
    private int precio = 10000;

    public QuemadorDVDBlueRay(Component component) {
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
