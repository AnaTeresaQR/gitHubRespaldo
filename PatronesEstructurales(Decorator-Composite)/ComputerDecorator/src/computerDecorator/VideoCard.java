package computerDecorator;

/**
 * Clase que decora, añade descripción y precio a la computadora básica, en
 * cuanto es instanciada
 *
 * @author Ana Teresa
 */
public class VideoCard extends ComputerDecorator {

    private final String descripcion = " VideoCard ";
    private final int precio = 1;

    public VideoCard(ComponentComputer component) {
        super(component);
    }

    @Override
    public String getDescripcion() {
        return super.getComponent().getDescripcion() + " + " + descripcion;
    }

    @Override
    public int getPrecio() {
        return super.getComponent().getPrecio() + precio;
    }

}
