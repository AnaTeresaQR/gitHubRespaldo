/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronPrototype;

/**
 *
 * @author Ana Teresa
 */
public class Direccion implements Prototype {

    private String provincia;
    private int codigoPostal;

    public Direccion(String provincia, int codigoPostal) {
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Direccion{" + "provincia: " + provincia + ", codigoPostal: " + codigoPostal + '}';
    }

    /**
     * Es una copia superficial ya que clona objetos de bajo nivel
     *
     * @return una direccion
     */
    @Override
    public Object clone() {
        return new Direccion(getProvincia(), getCodigoPostal());
    }

}
