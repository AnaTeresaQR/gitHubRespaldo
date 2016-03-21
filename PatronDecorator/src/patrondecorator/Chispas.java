/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrondecorator;

/**
 * Clase que se encarga de decorar un helado concreto
 *
 * @author Ana Teresa
 */
public class Chispas extends HeladoDecorador {

    public Chispas(Component_Heladeria heladeria) {
        super(heladeria);
    }

    /**
     * Método que agrega descripción sobre un helado decorado
     *
     * @return la descripción decorada
     */
    @Override
    public String getDescripcion() {
        return super.getHeladeria().getDescripcion() + " + chispas de colores ";
    }

    /**
     * Método que agrega precio extra por la decoración
     *
     * @return el precio extra por decoración
     */
    @Override
    public int getPrecio() {
        return super.getHeladeria().getPrecio() + 150;
    }

}
