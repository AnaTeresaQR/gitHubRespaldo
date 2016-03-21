package patronMemento;

/**
 * Clase que tiene la clase Memento, guarda y retorna
 *
 * @author Ana Teresa
 */
public class Originator {

    private String mejorApostador;// variable que maneja el programa

    // devuelve un memento (una instancia a Memento)
    public Object getMemento() { // el orginator (origina) al memento
        return new Memento(mejorApostador);
    }

    // establece un memento, es decir sus datos a guardar
    public void setMemento(Object m) {
        if (m instanceof Memento) { // solo sucede si el objeto proveniente es tipo Memento
            Memento recuerdo = (Memento) m; // lo establece a tipo Memento
            mejorApostador = recuerdo.mejorApostadorAsalvar;// guarda los datos al objeto
        }
    }

    public String getMejorApostador() {
        return mejorApostador;
    }

    public void setMejorApostador(String mejorApostador) {
        this.mejorApostador = mejorApostador;
    }

    // clase memento con las variables a salvar
    private class Memento {

        private String mejorApostadorAsalvar; // estados a salvar

        private Memento(String mejorApostadorAsalvar) {
            this.mejorApostadorAsalvar = mejorApostadorAsalvar;
        }

        public String getMejorApostadorAsalvar() {
            return mejorApostadorAsalvar;
        }

    }

}
