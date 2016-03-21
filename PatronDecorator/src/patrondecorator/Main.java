package patrondecorator;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Component_Heladeria helado1 = new Helado("Chocolate");
        helado1 = new Gomitas(helado1);
        helado1 = new Botonetas(helado1);

        System.out.println("\nHelado 1\n" + helado1.getDescripcion() + "\nPrecio = " + helado1.getPrecio());

        Component_Heladeria helado2 = new Helado("Vainilla");
        helado2 = new Botonetas(helado2);
        helado2 = new Caramelo(helado2);
        helado2 = new Chispas(helado2);
        helado2 = new Gomitas(helado2);
        helado2 = new Marmelos(helado2);
        System.out.println("\nHelado 2 con todas las decoraciones\n" + helado2.getDescripcion() + "\nPrecio = " + helado2.getPrecio());

    }

}
