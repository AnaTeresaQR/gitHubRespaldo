/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author Ana Teresa
 */
public class ConcreteTriangulo_Isosceles extends Triangulo {

    public ConcreteTriangulo_Isosceles(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDatosTrianguloIngresado() {
        return "Soy un triángulo isosceles, es decir 2 de mis lados miden igual y 1 diferente" + super.toString()
                + "Área: " + super.AreaFormulaHeron() + "\n";
    }

}
