/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronSingleton;

/**
 *
 * @author Ana Teresa
 */
public class Main {
    
    public static void main(String[] args) {
        JOP j = JOP.getInstance();
        
        String nombre = JOP.solicitarString("Escriba su nombre");
        JOP.mostrar(nombre);
    }
    
}
