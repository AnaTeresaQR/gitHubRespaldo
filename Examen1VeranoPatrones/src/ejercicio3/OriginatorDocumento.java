package ejercicio3;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class OriginatorDocumento {

    private String nombreDoc;
    private String texto;
    private Date fechaMod;
    private Persona personaMod;

    public OriginatorDocumento() {
    }

    public OriginatorDocumento(String nombreDoc, String texto, Date fechaMod, Persona personaMod) {
        this.nombreDoc = nombreDoc;
        this.texto = texto;
        this.fechaMod = fechaMod;
        this.personaMod = personaMod;
    }

    public void setMemento(Object m) {
        if (m instanceof Memento) {
            Memento recuerdo = (Memento) m;
            texto = recuerdo.textoSalvar;
            fechaMod = recuerdo.fechaSalvar;
        }
    }

    public Object getMemento() {
        return new Memento(texto, fechaMod);
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }

    public Persona getPersonaMod() {
        return personaMod;
    }

    public void setPersonaMod(Persona personaMod) {
        this.personaMod = personaMod;
    }

    @Override
    public String toString() {
        return "\nDocumento\n{" + "nombreDoc=" + nombreDoc + ", texto=" + texto + ", fechaMod=" + fechaMod.toLocaleString() + "\nPersona Modifica=" + personaMod + '}';
    }

    private class Memento {

        private String textoSalvar;
        private Date fechaSalvar;

        public Memento(String textoSalvar, Date fechaSalvar) {
            this.textoSalvar = textoSalvar;
            this.fechaSalvar = fechaSalvar;
        }

        public String getTextoSalvar() {
            return textoSalvar;
        }

        public Date getFechaSalvar() {
            return fechaSalvar;
        }

    }

}
