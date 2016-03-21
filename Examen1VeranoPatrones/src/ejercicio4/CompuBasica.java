package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class CompuBasica implements Component {

    private String descripcion = "La computadora se incluye con: "
            + "disco duro, RAM, Tarjeta Madre y la estructura externa.";

    private int precio = 200000;

    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public int precio() {
        return precio;
    }

}
