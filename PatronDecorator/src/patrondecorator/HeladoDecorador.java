package patrondecorator;

/**
 * Clase que se encarga de modificar y retornar un componente, lo recibe en el
 * constructor, recibe el componente concreto
 *
 * @author Ana Teresa
 */
public abstract class HeladoDecorador implements Component_Heladeria {

    private Component_Heladeria heladeria;// referencia a la interface con los métodos básicos

    public HeladoDecorador(Component_Heladeria heladeria) {
        this.heladeria = heladeria;
    }

    public Component_Heladeria getHeladeria() {
        return heladeria;
    }

    public void setHeladeria(Component_Heladeria heladeria) {
        this.heladeria = heladeria;
    }

}
