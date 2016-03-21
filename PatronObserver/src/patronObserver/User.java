package patronObserver;

/**
 * Clase con el método que es actualizado para que el usuario lo lea
 *
 * @author Ana Teresa
 */
public class User implements Observer {

    private String nombre;

    public User() {
    }

    public User(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String noticia) {
        System.out.println("Soy: " + nombre + " Estoy leyendo\n" + noticia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
