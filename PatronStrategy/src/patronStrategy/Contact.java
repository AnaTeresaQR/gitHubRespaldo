package patronStrategy;

/**
 * Clase contacto con sus datos
 *
 * @author Ana Teresa
 */
public class Contact {

    private String name;
    private String lastName;
    private String schedule;

    public Contact() {
    }

    public Contact(String name, String lastName, String shedule) {
        this.name = name;
        this.lastName = lastName;
        this.schedule = shedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", lastName=" + lastName + ", schedule=" + schedule + '}';
    }

}
