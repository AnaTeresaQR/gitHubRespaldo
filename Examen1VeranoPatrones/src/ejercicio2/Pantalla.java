package ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Ana Teresa
 */
public class Pantalla implements Observable {

    private String disponible;
    private ArrayList<Observer> observadores;

    public Pantalla() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void add(Observer o) {
        this.observadores.add(o);
        registrarPasajero(o);
    }

    @Override
    public void remove(Observer o) {
        this.observadores.remove(o);
    }

    @Override
    public void notificar(String vuelo) {
        for (Observer observers : observadores) {
            if (observers.getVuelo().equals(vuelo)) {
                observers.update(disponible);
            }
        }
    }

    public void cambioDisponibilidad(String disponible) {
        notificar(disponible);
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
        cambioDisponibilidad(disponible);
    }

    private void registrarPasajero(Observer o) {
        if (o instanceof PasajeroNacional) {
            PasajeroNacional pasajero = (PasajeroNacional) o;
            System.out.println("El pasajero nombre del vuelo " + pasajero.getVuelo()
                    + ", del tipo: " + pasajero.getTipoPasajero() + ", presenta sus documentos al oficial"
                    + "\nPasaporte: " + pasajero.getPasaporte()
                    + "\nTiquete del equipaje: " + pasajero.getTiqueteEquipaje()
                    + "\nDeclaracion aduanas: " + pasajero.getDeclaracionAduanas()
            );
            return;
        }
        if (o instanceof PasajeroInternacional) {
            PasajeroInternacional pasajero = (PasajeroInternacional) o;
            System.out.println("El pasajero nombre del vuelo " + pasajero.getVuelo()
                    + ", del tipo: " + pasajero.getTipoPasajero() + ", presenta sus documentos al oficial"
                    + "\nPasaporte: " + pasajero.getPasaporte()
                    + "\nVisa: " + pasajero.getVisa()
                    + "\nTránsito mercancías: " + pasajero.getTransitoMercancias());
            return;
        }
    }

}
