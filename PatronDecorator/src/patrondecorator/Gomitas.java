package patrondecorator;

/**
 * Clase que se encarga de decorar un helado concreto
 *
 * @author Ana Teresa
 */
public class Gomitas extends HeladoDecorador {

    public Gomitas(Component_Heladeria heladeria) {
        super(heladeria);
    }

    /**
     * Método que agrega descripción sobre un helado decorado
     *
     * @return la descripción decorada
     */
    @Override
    public String getDescripcion() {
        return getHeladeria().getDescripcion() + " + gomitas ";
    }

    /**
     * Método que agrega precio extra por la decoración
     *
     * @return el precio extra por decoración
     */
    @Override
    public int getPrecio() {
        return getHeladeria().getPrecio() + 220;
    }

}
