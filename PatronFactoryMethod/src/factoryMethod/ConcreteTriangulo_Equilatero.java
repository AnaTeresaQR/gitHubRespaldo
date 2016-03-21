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
public class ConcreteTriangulo_Equilatero extends Triangulo {

    public ConcreteTriangulo_Equilatero(int ladoA, int ladoB, int ladoC) {
        super(ladoA, ladoB, ladoC);
    }

    @Override
    public String getDatosTrianguloIngresado() {
        return "Soy un triángulo equilátero, es decir todos mis lados miden igual" + super.toString()
                + "Área: " + super.AreaFormulaHeron() + "\n";
    }

}
