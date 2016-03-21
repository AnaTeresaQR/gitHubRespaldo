package factoryMethod;

import static java.lang.Math.sqrt;
import java.text.NumberFormat;

/**
 *
 * @author Ana Teresa
 *
 * Se decide hacer una clase abstracta para definir métodos con implementaciones
 * y atributos. No se hace una interfaz con calcular Área porque mediante la
 * fórmula de Herón todas las áreas se crearán de la misma forma sin importar
 * las medidas del tríangulo
 */
public abstract class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) {
        // establece los valores
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
    }

    // método abstracto que es modificado por cada clase concreta que implementa Triangulo
    public abstract String getDatosTrianguloIngresado();

    // saca el valor del semiperimetro necesario para la fórmula de Herón de calcular área
    private double semiperimetro() {
        double p = (((double) ladoA + (double) ladoB + (double) ladoC) / 2);
        return p;
    }

    // fórmula de Herón para calcular el área
    public double AreaFormulaHeron() {
        double p = semiperimetro();
        double A = sqrt(p * (p - (double) ladoA) * (p - (double) ladoB) * (p - (double) ladoC));
        double resultado = cortarDecimales(A);
        return resultado;
    }

    // método para cortar los decimales del resultado de calcular el Área
    private double cortarDecimales(double A) {

        // llamamos a la instancia de formato de números
        NumberFormat numberF = NumberFormat.getInstance();

        numberF.setMaximumFractionDigits(5);//Establecemos el numero de decimales que queremos en el resultado 
        String st = numberF.format(A);//Convertimos el numero a un String
        double resultado = Double.valueOf(st);//Convertir el numero String a double 
        return resultado;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String toString() {
        return "\nTriangulo ingresado {" + " a: " + ladoA + ", b: " + ladoB + ", c: " + ladoC + "}\n";
    }

}
