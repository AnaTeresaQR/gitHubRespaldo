package patronMemento;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        Encargado encargado = new Encargado(); // encargado de la lista de Mementos guardados

        Originator originator = new Originator(); // encargado de crear  Mementos

        originator.setMejorApostador("Tere");
        encargado.addMemento(originator.getMemento());

        originator.setMejorApostador("Ana");
        encargado.addMemento(originator.getMemento());

        originator.setMejorApostador("Superman");
        encargado.addMemento(originator.getMemento());

        originator.setMejorApostador("JuanMi");
        encargado.addMemento(originator.getMemento());

        System.out.println("último mejor jugador guardado: " + originator.getMejorApostador());

        originator.setMemento(encargado.getMemento(0)); // escogemos el índice del mejor jugador guardado para actualizar

        System.out.println("volvemos el estado al mejor jugador que queremos: " + originator.getMejorApostador());

    }
}
