/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronBuilder;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        try {

            AbstractBuilder ab = new ConcreteBuilder();
            Director d = new Director();

            ProductPersona p = d.buildPersona(ab, "Te", "QR", 20);

            System.out.println("" + p);
        } catch (Error ex) {
            System.out.println("" + ex.getMessage());
        }

    }
}
