package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Ana Teresa
 */
public class Encargado {

    private ArrayList cambios;

    public Encargado() {
        cambios = new ArrayList();
    }

    public void addMemento(Object o) {
        cambios.add(o);
    }

    public Object getMemento(int index) {
        return cambios.get(index);
    }

}
