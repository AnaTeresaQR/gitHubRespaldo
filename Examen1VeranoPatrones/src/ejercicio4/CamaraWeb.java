package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class CamaraWeb extends Decorador {

    private String descripcion = " Cámara web";
    private int precio = 10000;

    public CamaraWeb(Component component) {
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
