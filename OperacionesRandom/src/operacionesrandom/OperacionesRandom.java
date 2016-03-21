/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesrandom;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Ana Teresa
 */
public class OperacionesRandom {

    private Random r = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OperacionesRandom ops = new OperacionesRandom();
        while (true) {
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de operaciones"));
            JOptionPane.showMessageDialog(null, "Resultado: " + ops.devolver(cantidad));
        }
    }

    public String devolver(int cantidadOp) {
        String cadena = "";
        int resultado = 0;
        for (int i = 0; i < cantidadOp; i++) {
            String[] vector = operacion();
            if (i == cantidadOp - 1) {
                // la suma no se agrega a la cadena
                cadena += vector[0];
                resultado += Integer.parseInt(vector[1]);
            } else {
                // se agrega la suma a la cadena
                cadena += vector[0] + " + ";
                resultado += Integer.parseInt(vector[1]);
            }
        }
        return cadena + " = " + resultado;
    }

    private String[] operacion() {
        int num1 = r.nextInt(100);
        int num2 = r.nextInt(100);

        int numR = r.nextInt(4);

        switch (numR) {
            case 0:
                // suma
                return suma(num1, num2);
            case 1:
                // resta
                return resta(num1, num2);
            case 2:
                // multiplicacion
                return multiplicacion(num1, num2);
            case 3:
                // division
                return division(num1, num2);
            default:
                throw new AssertionError();
        }
    }

    private String[] suma(int num1, int num2) {
        int resultado = num1 + num2;
        String[] vs = {"( " + num1 + " + " + num2 + "  )", resultado + ""};
        return vs;
    }

    private String[] resta(int num1, int num2) {
        int resultado = num1 - num2;
        String[] vr = {"( " + num1 + " - " + num2 + " )", resultado + ""};
        return vr;
    }

    private String[] multiplicacion(int num1, int num2) {
        int resultado = num1 * num2;
        String[] vm = {"( " + num1 + " x " + num2 + " )", resultado + ""};
        return vm;
    }

    private String[] division(int num1, int num2) {
        if (num2 == 0) {
            num2++;
        }
        int resultado = num1 / num2;
        String[] vd = {"( " + num1 + " / " + num2 + " )", resultado + ""};
        return vd;
    }
}
