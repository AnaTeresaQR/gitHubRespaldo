package patronMemento;

import java.util.ArrayList;

/**
 * Clase encargada de añadir o devolver Objetos Memento a la lista
 *
 * @author Ana Teresa
 */
public class Encargado {

    private ArrayList mejoresApostadores = new ArrayList();// lista de estados

    // recibe un objeto para ocultar tipos
    public void addMemento(Object m) { // añade un objeto a la lista
        mejoresApostadores.add(m);
    }

    // tipo objeto para ocultar detalles 
    public Object getMemento(int indice) { // devuelve un memento guardado por indice
        return mejoresApostadores.get(indice);
    }
}
