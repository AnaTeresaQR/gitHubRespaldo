package factoryMethod;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Creator c = new ConcreteCreator(); // interface = clase concreta con método de creación

        // se crean 3 objetos con diferentes valores cuyo método de creación es el mismo y se encarga de instanciar la correcta
        // Se imprime la descripción de cada tríangulo, cuyos datos son todos distintos
        Triangulo t1 = c.crearTriangulo(10, 10, 10);
        System.out.println("" + t1.getDatosTrianguloIngresado());
        Triangulo t2 = c.crearTriangulo(20, 20, 15);
        System.out.println("" + t2.getDatosTrianguloIngresado());
        Triangulo t3 = c.crearTriangulo(15, 25, 35);
        System.out.println("" + t3.getDatosTrianguloIngresado());

    }
}
