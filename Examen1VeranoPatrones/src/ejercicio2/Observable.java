package ejercicio2;

/**
 *
 * @author Ana Teresa
 */
public interface Observable {

    public void add(Observer o);

    public void remove(Observer o);

    public void notificar(String vuelo);

}
