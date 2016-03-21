package factoryMethod;

/**
 *
 * @author Ana Teresa
 */
public class ConcreteCreator implements Creator {

    // método que crea los tríangulos todos diferentes según los datos que recibe
    @Override
    public Triangulo crearTriangulo(int ladoA, int ladoB, int ladoC) {
        if (ladoA == ladoB && ladoA == ladoC) {
            return new ConcreteTriangulo_Equilatero(ladoA, ladoB, ladoC);
        }
        if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
            return new ConcreteTriangulo_Escaleno(ladoA, ladoB, ladoC);
        } else {
            return new ConcreteTriangulo_Isosceles(ladoA, ladoB, ladoC);
        }
    }

}
