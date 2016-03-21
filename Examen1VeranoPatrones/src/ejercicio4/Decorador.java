package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public abstract class Decorador implements Component {

    private Component component;

    public Decorador(Component component) {
        this.component = component;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

}
