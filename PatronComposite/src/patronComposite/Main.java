package patronComposite;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        Carpeta c1 = new Carpeta("Mariposas", "Carpeta con archivos de mariposas", 10);

        // se crea un archivo para la carpeta 1
        Archivo a0 = new Archivo("mariposaVerde.png", "imagen de una mariposa verde");

        // se agrega el archivo a0 a la carpeta c1
        c1.agregarElemento(a0);

        // se crea otra carpeta para agregar en c1
        Carpeta c2 = new Carpeta("MariposasAzules", "Carpeta con mariposas azules", 7);

        // se crean 2 archivos parta la carpeta 2
        Archivo a1 = new Archivo("mariposaAzul.png", "imagen mariposa azul con paisaje");
        Archivo a2 = new Archivo("mariposasAzulVerde.png", "imagen de mariposa colorida con azul");
        // se agregan los archivos a la carpeta c2
        c2.agregarElemento(a1);
        c2.agregarElemento(a2);

        // se agrega la carpeta c2 a la carpeta c1
        c1.agregarElemento(c2);

        // se imprime cantidad de archivos
        System.out.println("La cantidad de archivos de la carpeta 1 es: " + c1.calcularCantidadArchivos());
    }
}
