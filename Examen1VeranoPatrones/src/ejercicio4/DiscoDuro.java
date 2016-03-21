package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class DiscoDuro extends Decorador {

    private String descripcion = " Disco duro mejor capacidad";
    private int precio = 10000;

    public DiscoDuro(Component component) {
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
