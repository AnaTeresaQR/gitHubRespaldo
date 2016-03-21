package patronStrategy;

/**
 * Clase que maneja la lista (añadir, remover)
 *
 * @author Ana Teresa
 */
public class ContactList {

    SummarizingStrategy summarizer;
    private Contact[] contactList;

    public ContactList() {
        contactList = new Contact[10];
    }

    // llama al método de la estrategia completa
    public String summarize() {
        return summarizer.summarize(contactList);
    }

    // llama al método de la estrategia completa
    public String[] makeSummarizedList() {
        return summarizer.makeSummarizedList(contactList);
    }

    public void addContact(Contact contact) {

        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                contactList[i] = contact;
                return;
            }
        }
    } // fin

    public void removeContact(Contact contact) {
        for (int i = contactList.length; i > 0; i--) {
            if (contactList[i] != null) {
                contactList[i] = null;
                return;
            }
        }
    } // fin

    public void setSummarizer(SummarizingStrategy summarizer) {
        this.summarizer = summarizer;
    }
}
