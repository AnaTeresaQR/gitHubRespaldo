package ejercicio2;

/**
 *
 * @author Ana Teresa
 */
public class PasajeroInternacional implements Observer {

    private final String tipoPasajero = "Internacional";

    private String numeroVuelo;
    private String pasaporte;
    private String visa;
    private int transitoMercancias;

    public PasajeroInternacional(String numeroVuelo, String pasaporte, String visa, int transitoMercancias) throws Error {
        this.numeroVuelo = numeroVuelo;
        this.pasaporte = pasaporte;
        this.visa = visa;
        validarTransitoMercancias(transitoMercancias);
    }

    private void validarTransitoMercancias(int transitoMercancias) throws Error {
        if (transitoMercancias <= 10000) {
            this.transitoMercancias = transitoMercancias;
        } else {
            throw new Error("El tránsito de mercancías sobrepasa el máximo permitido");
        }
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

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public int getTransitoMercancias() {
        return transitoMercancias;
    }

    public void setTransitoMercancias(int transitoMercancias) throws Error {
        validarTransitoMercancias(transitoMercancias);
    }

    public String getTipoPasajero() {
        return tipoPasajero;
    }

    @Override
    public String getVuelo() {
        return this.numeroVuelo;
    }

}
