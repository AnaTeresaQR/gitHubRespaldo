package patronObserver;

import java.util.ArrayList;

/**
 * Clase con métodos de añadir y remover observadores de la lista, cambia
 * estados de noticias y se encarga de notificar a los observadores esos cambios
 *
 * @author Ana Teresa
 */
public class Periodico implements Observable {

    private String noticia;
    ArrayList<Observer> observers;

    public Periodico() {
        observers = new ArrayList<>();
    }

    private void changeState() {
        notificar();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificar() {
        for (Observer observer : observers) {
            observer.update(noticia);
        }
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
        changeState();
    }

}
