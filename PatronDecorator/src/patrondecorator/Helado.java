package patrondecorator;

/**
 * Clase con los atributos de un helado y la implementación básica de un helado
 * no decorado
 *
 * @author Ana Teresa
 */
public class Helado implements Component_Heladeria {

    private final String dato = "Helado de:  ";
    private String saborHelado;
    private int precio = 700;

    public Helado() {
    }

    public Helado(String saborHelado) {
        this.saborHelado = saborHelado;
    }

    public String getSaborHelado() {
        return saborHelado;
    }

    public void setSaborHelado(String saborHelado) {
        this.saborHelado = saborHelado;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String getDescripcion() {
        return dato + saborHelado;
    }

}
