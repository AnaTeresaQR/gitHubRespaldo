package patronObserver;

/**
 * Métodos de añadir y remover obervadores o de ser notificados
 *
 * @author Ana Teresa
 */
public interface Observable {

    public void add(Observer observer);

    public void remove(Observer observer);

    public void notificar();
}
