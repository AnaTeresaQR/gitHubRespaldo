package computerDecorator;

/**
 * Clase que decora, añade descripción y precio a la computadora básica, en
 * cuanto es instanciada
 *
 * @author Ana Teresa
 */
public class RamMemory extends ComputerDecorator {

    private final String descripcion = " Memoria Ram 2 gb ";
    private final int precio = 1;

    public RamMemory(ComponentComputer component) {
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
