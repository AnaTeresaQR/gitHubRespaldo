package ejercicio4;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Component c1 = new CompuBasica();

        c1 = new CamaraWeb(c1);
        c1 = new Mouse(c1);
        c1 = new MemoriaRam(c1);

        Component c2 = new CompuBasica();
        c2 = new QuemadorDVDBlueRay(c2);
        c2 = new TarjetaVideo(c2);
        c2 = new DiscoDuro(c2);
        c2 = new CamaraWeb(c2);

        System.out.println("Compu 1 Datos\n" + c1.descripcion() + "\n" + c1.precio());

        System.out.println("");

        System.out.println("Compu 2 Datos\n" + c2.descripcion() + "\n" + c2.precio());

    }

}
