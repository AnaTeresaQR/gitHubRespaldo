package computerDecorator;

/**
 * Clase básica con los atributos que tendrá cualquier objeto creado, tanto
 * decorado como sin decorar
 *
 * @author Ana Teresa
 */
public class Computer implements ComponentComputer {

    // establece los atributos que tendrá cualquier computadora creada
    private final String descripcion = "Computadora básica(estructura): ";
    private final int precio = 2;

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

}
