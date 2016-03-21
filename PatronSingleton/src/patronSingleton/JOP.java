/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronSingleton;

import javax.swing.JOptionPane;

/**
 *
 * @author Ana Teresa
 */
public class JOP {

    private static JOP instance;

    private JOP() {

    }

    public static JOP getInstance() {
        if (instance == null) {
            instance = new JOP();
            return instance;
        } else {
            return instance;
        }
    }

    public static String solicitarString(String mensaje) {
        return JOptionPane.showInputDialog(null, mensaje);
    }

    public static int solicitarInt(String mensaje) {
        return Integer.parseInt(solicitarString(mensaje));
    }

    public static void mostrar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
