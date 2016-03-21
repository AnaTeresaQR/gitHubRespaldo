package ejercicio2;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        try {
            
            PasajeroNacional p1 = new PasajeroNacional("TA-350", "1", "01", "Ropa");
            PasajeroInternacional p2 = new PasajeroInternacional("AA-123", "2", "0001", 6000);
            
            Pantalla pantalla = new Pantalla();
            pantalla.add(p1);
            pantalla.add(p2);
            
            pantalla.setDisponible(p1.getVuelo());
            pantalla.setDisponible(p2.getVuelo());
            pantalla.setDisponible("IB-111");
            
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }
    
}
