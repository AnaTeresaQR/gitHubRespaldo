package ejercicio3;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Date d1 = Main.crearFecha(10, 9, 2016);
        Date d2 = Main.crearFecha(12, 9, 2016);
        Date d3 = Main.crearFecha(14, 10, 2016);

        Persona p1 = new Persona("a", "aa", "11");
        Persona p2 = new Persona("b", "bb", "22");

        Encargado e1 = new Encargado();
        OriginatorDocumento o = new OriginatorDocumento("Documento 1", "documento de versiones", d1, p1);

        o.setTexto("doc v1.1");
        System.out.println("\n--Cambio de texto--" + o.toString());
        o.setFechaMod(d2); // cambio de fecha
        System.out.println("\n--Cambio de fecha--" + o.toString());
        e1.addMemento(o.getMemento()); // guardar
        o.setTexto("doc v1.2");
        o.setTexto("doc v1.3");
        System.out.println("\n--Cambio de texto--" + o.toString());
        e1.addMemento(o.getMemento()); // guardar
        o.setTexto("doc v1.4");
        o.setTexto("doc v1.5");
        System.out.println("\n--Cambio de texto--" + o.toString());
        e1.addMemento(o.getMemento()); // guardar
        o.setTexto("doc v1.6");
        o.setTexto("doc v1.7");
        System.out.println("\n--Cambio de texto--" + o.toString());
        o.setTexto("doc v1.8");
        o.setFechaMod(d3); // cambio de fecha       
        System.out.println("\n--Cambio de fecha--" + o.toString());

        System.out.println("\n-- Restaurar a una versión antigua.--");
        o.setMemento(e1.getMemento(2));
        System.out.println("\n--CAMBIO DE VERSIÓN--" + o.toString());
    }

    public static Date crearFecha(int dia, int mes, int anno) {
        Calendar c = Calendar.getInstance();
        c.set(anno, mes, dia);
        return c.getTime();
    }

}
