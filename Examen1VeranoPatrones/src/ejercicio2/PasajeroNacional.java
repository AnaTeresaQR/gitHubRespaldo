package ejercicio2;

/**
 *
 * @author Ana Teresa
 */
public class PasajeroNacional implements Observer {

    private final String tipoPasajero = "Nacional";

    private String numeroVuelo;
    private String pasaporte;
    private String tiqueteEquipaje;
    private String declaracionAduanas;

    public PasajeroNacional(String numeroVuelo, String pasaporte, String tiqueteEquipaje, String declaracionAduanas) {
        this.numeroVuelo = numeroVuelo;
        this.pasaporte = pasaporte;
        this.tiqueteEquipaje = tiqueteEquipaje;
        this.declaracionAduanas = declaracionAduanas;
    }

    @Override
    public void update(String disponible) {
        System.out.println("El pasajero nombre del vuelo: " + disponible + ", del tipo: " + tipoPasajero + " se retira con su equipaje.");
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getTiqueteEquipaje() {
        return tiqueteEquipaje;
    }

    public void setTiqueteEquipaje(String tiqueteEquipaje) {
        this.tiqueteEquipaje = tiqueteEquipaje;
    }

    public String getDeclaracionAduanas() {
        return declaracionAduanas;
    }

    public void setDeclaracionAduanas(String declaracionAduanas) {
        this.declaracionAduanas = declaracionAduanas;
    }

    public String getTipoPasajero() {
        return tipoPasajero;
    }

    @Override
    public String getVuelo() {
        return this.numeroVuelo;
    }

}
