package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class Mouse extends Decorador {

    private String descripcion = " Mouse";
    private int precio = 10000;

    public Mouse(Component component) {
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
