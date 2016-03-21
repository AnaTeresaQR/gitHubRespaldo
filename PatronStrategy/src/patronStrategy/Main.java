package patronStrategy;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Contact c1 = new Contact("A", "aa", "456");
        Contact c2 = new Contact("B", "bb", "901");
        Contact c3 = new Contact("C", "cc", "123");
        Contact c4 = new Contact("D", "dd", "789");

        ContactList list = new ContactList();

        list.addContact(c1);
        list.addContact(c2);
        list.addContact(c3);
        list.addContact(c4);

        list.setSummarizer(new ScheduleSummarizer());

        System.out.println("" + list.summarize());

        list.setSummarizer(new NameSummarizer());

        System.out.println("" + list.summarize());

    }

}
