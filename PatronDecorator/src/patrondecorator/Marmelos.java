package patrondecorator;

/**
 * Clase que se encarga de decorar un helado concreto
 *
 * @author Ana Teresa
 */
public class Marmelos extends HeladoDecorador {

    public Marmelos(Component_Heladeria heladeria) {
        super(heladeria);
    }

    /**
     * Método que agrega descripción sobre un helado decorado
     *
     * @return la descripción decorada
     */
    @Override
    public String getDescripcion() {
        return super.getHeladeria().getDescripcion() + " + marmelos chiquititos ";
    }

    /**
     * Método que agrega precio extra por la decoración
     *
     * @return el precio extra por decoración
     */
    @Override
    public int getPrecio() {
        return super.getHeladeria().getPrecio() + 110;
    }

}
