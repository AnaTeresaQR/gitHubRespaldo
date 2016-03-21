package patronObserver;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        User u1 = new User("Juan");
        User u2 = new User("Tere");
        User u3 = new User("MIguel");
        User u4 = new User("Ana");

        Periodico p = new Periodico();

        p.add(u1);
        p.add(u2);
        p.add(u3);
        p.add(u4);

        p.setNoticia("Ganamos en playfulbet");
        System.out.println("-------------------------");
        p.setNoticia("Perdimos en playfulbet");

    }

}
